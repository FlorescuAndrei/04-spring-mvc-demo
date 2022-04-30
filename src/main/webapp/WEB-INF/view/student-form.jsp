
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName"/>
		<br><br>
	
		Last name: <form:input path="lastName" />
		<br><br>
		
		Country from JSP:	
					<form:select path="country">
						
						<form:option value="Romania" label="Roamnia"></form:option>
						<form:option value="France" label="France"></form:option>
						<form:option value="Germany" label="Germany"></form:option>
						
					</form:select>
							
		<br><br>
		Country from Student.class:	
					<form:select path="country">
						
						<form:options items="${student.countryOptions}" />
						
					</form:select>
					
					
		<br><br>
		
		Country from countries.properties:	
					<form:select path="country">
						
						<form:options items="${countryOptions}" />
						
					</form:select>
		<br><br>
		
		Favorite Language: 	Java	<form:radiobutton path="favoriteLanguage" value="Java" />
					C#	<form:radiobutton path="favoriteLanguage" value="C#" />
					PHP	<form:radiobutton path="favoriteLanguage" value="PHP" />
		
		<br><br>
		
		Operating Systems:
		
							Linux		<form:checkbox path="operatingSystems" value="Linux" />
							Mac OS		<form:checkbox path="operatingSystems" value="Mac OS" />
							MS Windows	<form:checkbox path="operatingSystems" value="MS Windows" />
		
		<br><br>
		<input type="submit" value="Submit now" />
	
	</form:form>



</body>
</html>
