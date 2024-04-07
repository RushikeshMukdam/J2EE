package com.jspiders.springREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springREST.pojo.Car;
import com.jspiders.springREST.response.ResponseStructure;
import com.jspiders.springREST.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@PostMapping(path = "/car")
	public ResponseEntity<ResponseStructure<Car>> addCar(@RequestBody Car car){
	           Car addedCar = carService.addCar(car);
	        ResponseStructure<Car> responseStructure = new ResponseStructure<>();
	        responseStructure.setMessage("car added");
	        responseStructure.setData(addedCar);
	        responseStructure.setStatus(HttpStatus.OK.value());
	        return new ResponseEntity<ResponseStructure<Car>>(responseStructure,HttpStatus.OK);
	}
	
	@GetMapping(path="/cars")
	public ResponseEntity<ResponseStructure<List<Car>>> findAllCar(){
		List<Car> cars = carService.findAllCar();
		ResponseStructure<List<Car>> responseStructure = new ResponseStructure<>(); 
		if (cars != null) {
			responseStructure.setMessage("Car Found");
			responseStructure.setData(cars);
			responseStructure.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<List<Car>>>(responseStructure, HttpStatus.FOUND);
		}else {
			responseStructure.setMessage("Car Not Found");
			responseStructure.setData(cars);
			responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
			return new ResponseEntity<ResponseStructure<List<Car>>>(responseStructure, HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping(path = "/car")
	public ResponseEntity<ResponseStructure<Car>> deleteCar(@RequestParam(name ="id" ) int id){
		      Car deletedCar = carService.deleteCar(id);
		      ResponseStructure<Car> responseStructure = new ResponseStructure<>();
		      if (deletedCar != null) {
				responseStructure.setMessage("Car Deleted");
				responseStructure.setData(deletedCar);
				responseStructure.setStatus(HttpStatus.OK.value());
				return new ResponseEntity<ResponseStructure<Car>>(responseStructure,HttpStatus.OK);
			}else {
				responseStructure.setMessage("Car Not Found");
				responseStructure.setData(deletedCar);
				responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
				return new ResponseEntity<ResponseStructure<Car>>(responseStructure,HttpStatus.NOT_FOUND);
			}
		      
	}
	
	@PutMapping(path = "/car")
	public ResponseEntity<ResponseStructure<Car>> updateCar(@RequestBody Car car){
		        Car updateCar = carService.updateCar(car);
		        ResponseStructure<Car> responseStructure = new ResponseStructure<>();         
		                 if (updateCar != null) {
							responseStructure.setMessage("Car Updated");
							responseStructure.setData(updateCar);
							responseStructure.setStatus(HttpStatus.OK.value());
							return new ResponseEntity<ResponseStructure<Car>>(responseStructure,HttpStatus.OK);
							
						}else {
							responseStructure.setMessage("Car Not Found");
							responseStructure.setData(updateCar);
							responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
							return new ResponseEntity<ResponseStructure<Car>>(responseStructure,HttpStatus.NOT_FOUND);
						}
	}
	

}
