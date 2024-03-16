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
			<form action="sum2.jsp">
				<table>
					<tr>
						<td>Num1:</td>
						<td><input type="text" name="num1"></td>
					</tr>
					
					<tr>
						<td>Num2</td>
						<td><input type="text" name="num2"></td>
					</tr>
				</table>
				<input type = "submit" value="ADD">
			</form>
		</div>
		
		
		<%! int num1; int num2;int sum; %>
		<%
		
		String input1 = request.getParameter("num1");
		String input2 = request.getParameter("num2");
		
		
		if(input1 != null && input2 != null){
			num1=Integer.parseInt(input1);
			num2=Integer.parseInt(input2);
			sum=num1+num2;
		
		}
		%>
		
		<div align="center">
		<h1>Sum of <%=num1 %>and <%=num2 %> is <%=sum %></h1>
		</div>

		
</body>
</html>