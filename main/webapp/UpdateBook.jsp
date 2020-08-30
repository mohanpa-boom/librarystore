<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <h1>Update Book</h1>
<body>
   <form action = "updateBook" method="post">
		Enter Book Id : <input type = "text" name = "bId">
		<br><br>
		<p>Enter the values to update.</p>
		<br><br>
		Enter Book Name : <input type = "text" name = "bName">
		<br><br>
		Enter Author Name : <input type = "text" name = "Authr">
		<br><br>
		Enter Publisher Name : <input type = "text" name = "Pubshr">
		<br><br>
		<input type ="submit" value ="Update">
	</form>

</body>
</html>