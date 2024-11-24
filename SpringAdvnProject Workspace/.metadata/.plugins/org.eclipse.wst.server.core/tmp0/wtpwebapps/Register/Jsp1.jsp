<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<p>hello:<%= request.getAttribute("username") %> </p>
    <table border="1">
        <thead>
            <tr>
                <th>sno</th>
                <th>square</th>
                <th>cube</th>
            </tr>
        </thead>
      
            <% for (int i = 1; i <= 10; i++) { %>
                <tr>
                    <td><%= i %></td>
                    <td><%= i * i %></td>
                    <td><%= i * i * i %></td>
                </tr>
            <% } %>
       
    </table>
    
</body>
</html>