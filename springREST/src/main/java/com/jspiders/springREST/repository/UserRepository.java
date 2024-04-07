package com.jspiders.springREST.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.springREST.pojo.Car;
import com.jspiders.springREST.pojo.User;

@Repository
public class UserRepository {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;
	
	
	private void openConnection() {
		 entityManagerFactory = Persistence.createEntityManagerFactory("car");
		 entityManager = entityManagerFactory.createEntityManager();
		  entityTransaction = entityManager.getTransaction();
	}
	private void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}
	public User addUser(User user) {
		openConnection();
		entityTransaction.begin();
			entityManager.persist(user);
		entityTransaction.commit();
		closeConnection();
		return user;
		
	}
	
	public List<User> findAllUser(){
		openConnection();
		     Query query = entityManager.createQuery("SELECT user FROM User user");
		     @SuppressWarnings("unchecked")
			List<User> user = query.getResultList();
		closeConnection();
		return user;
	}
	
	public User updateUser(User user) {
		openConnection();
		User userToBeUpdated = entityManager.find(User.class, user.getId());
		if (userToBeUpdated != null) {
			userToBeUpdated.setUserName(user.getUserName());
			userToBeUpdated.setPassword(user.getEmail());
			userToBeUpdated.setMobile(user.getMobile());
			userToBeUpdated.setPassword(user.getPassword());
			entityTransaction.begin();
			entityManager.persist(userToBeUpdated);
			entityTransaction.commit();
			
		}
		closeConnection();
		return user;
	}
	
	public User deleteUser(int id) {
		openConnection();
		User userToBeDeleted = entityManager.find(User.class, id);
		if (userToBeDeleted != null) {
			entityTransaction.begin();
			entityManager.remove(userToBeDeleted);
			entityTransaction.commit();
		}
		closeConnection();
		return userToBeDeleted;
	}
	
	public User updateCarListForUser(int userId,int carId) {
			openConnection();
				User user = entityManager.find(User.class, userId);
				Car car = entityManager.find(Car.class, carId);
				
				if (user != null && car != null) {
					List<Car> cars = user.getCars();
					if (cars != null) {
						cars.add(car);
					}else {
						cars = new ArrayList<Car>();
						cars.add(car);
					}
					user.setCars(cars);
					entityTransaction.begin();
					entityManager.persist(user);
					entityTransaction.commit();
					     User updatedUser = entityManager.find(User.class, userId);
					  closeConnection();
					  return updatedUser;
				}else {
					return null;
				}		
	}
	
	
	
}
