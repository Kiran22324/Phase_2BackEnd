<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
	<h1>Add Teacher Form</h1>
	<form action="add-teacher2" method="post">
	<fieldset>
	<legend>Add Teacher Details</legend>
	First name:<input type="text" name="fname" id="fname">
	Last Name:<input type="text" name="lname" id="lname">
	
	<p>
	
	<select name="type1">
		<option vlaue="1">Physics</option>
		<option vlaue="2">Maths</option>
		<option vlaue="3">Chemistry</option>
	</select>	
	</p>
	
	<p>
	
	<select name="type2">
		<option vlaue="1">Physics</option>
		<option vlaue="2">Maths</option>
		<option vlaue="3">Chemistry</option>
	</select>	
	</p>
	
	<p>
	
	<select name="type3">
		<option vlaue="1">Physics</option>
		<option vlaue="2">Maths</option>
		<option vlaue="3">Chemistry</option>
	</select>	
	</p>
	<input type="submit" name="name" value="Submit">
	
	</fieldset>
	</form>
</body>
</html>