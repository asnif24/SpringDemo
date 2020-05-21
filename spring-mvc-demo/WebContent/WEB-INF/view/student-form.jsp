<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	First Name: <form:input path="firstName"/>
	<br><br>
	Last Name: <form:input path="lastName"/>
	<br><br>
	Country: 
		<form:select path="country">
<%-- 			<form:option value="Brazil" label="Brazil"/> --%>
<%-- 			<form:option value="Chile" label="Chile"/> --%>
<%-- 			<form:option value="Denmark" label="Denmark"/> --%>
<%-- 			<form:option value="Spain" label="Spain"/> --%>
<%-- 			<form:option value="Taiwan" label="Taiwan"/> --%>
<%-- 			<form:option value="Others" label="Others"/> --%>
			<form:options items="${student.countryOptions}"/>
		</form:select>
	
	<br><br>
	<input type="submit" value="Submit"/>
	</form:form>

</body>

</html>







