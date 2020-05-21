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

<%-- 			<form:options items="${student.countryOptions}"/> --%>
			
			<form:options items="${theCountryOptions}"/>
		</form:select>
	
	<br><br>
	
	Favorite Language: 
	<form:radiobutton path="favoriteLanguage" value="Java"/>Java
	<form:radiobutton path="favoriteLanguage" value="C#"/>C#
	<form:radiobutton path="favoriteLanguage" value="PHP"/>PHP
	<form:radiobutton path="favoriteLanguage" value="Ruby"/>Ruby
	
	<br><br>
	
	Gender: 
	<form:radiobutton path="gender" value="Male"/>Male
	<form:radiobutton path="gender" value="Female"/>Female
	<form:radiobutton path="gender" value="Others"/>Others
	
	<br><br>
	
	Favorite Sport:
	<form:select path="favoriteSport">
		<form:options items="${theSportOptions}"/>
	</form:select>
	
	<br><br>
	
	<input type="submit" value="Submit"/>
	</form:form>

</body>

</html>







