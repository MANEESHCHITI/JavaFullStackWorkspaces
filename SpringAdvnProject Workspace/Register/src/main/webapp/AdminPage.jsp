<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
	<style>
		.top{
			padding-top: 100px;
		}
		.font{
			font-size: 40px;
		}
		.font1{
			font-size: 40px;
			color:green;
		}
		</style>
	</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3">
					<label class="font">VCUBE</label>
			</div>
			<div class="col-sm-6">
				
			</div>
			<div class="col-sm-3">
			
						<h1 class="font1">Welcome <%= session.getAttribute("firtname") %></h1>
 			
 
				
			</div>
		</div>
	</div>
	<div class="container-fluid top">
		<div class="row">
			<div class="col-sm-3">
			<a href="./Student.jsp">ADD STUDENT</a><br><br>
			<a href="./Faculty.jsp">ADD FACULTY</a><br><br>
			<a href="./Course.jsp">ADD COURSE</a><br><br>
			<form action="facultyTableServlet" method="post">
			
			<button type="submit">FACULTY LIST</button><br><br>
			
			</form>
			
			<form action="StudentTableController" method="post">
			
			<button type="submit">STUDENT LIST</button><br><br>
			 <!-- instead we use class name in heref but by doGet by default it takes -->
			
			</form>
			
			
			</div>
			<div class="col-sm-6">
			
			</div>
			<div class="col-sm-3">
			
			</div>
		</div>
	</div>
</body>
</html>