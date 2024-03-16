<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div align="center">
			<form action="Palidrom.jsp">
				<table>
					<tr>
						<td>Num1:</td>
						<td><input type="text" name="num1"></td>
					</tr>
				
				</table>
				<input type = "submit" value="ADD">
			</form>
		</div>
		
		<%! int num1,temp , res,sum=0; String str; %>
		<%
		
		String input1 = request.getParameter("num1");
		
		if(input1 != null){
			num1=Integer.parseInt(input1);
			
			temp = num1;
			while(temp > 0){
				res = temp%10;
				sum=(sum*10)+res;
				temp = temp/10;
			}
			
			if(sum == num1){
					str = "Number is Palidrom";
					//num1 = 0;
				
			}	else{
					str = "Number is not palidrom";
					//num1 = 0;
			}
			%>
			
		<div align="center"><h1><%= num1 %>  <%=str %></h1></div>
		<% 
		}
		
		%>
		
		
		
</body>
</html>