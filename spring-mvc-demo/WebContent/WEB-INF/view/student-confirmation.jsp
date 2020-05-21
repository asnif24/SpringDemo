<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

The Student is Confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Gender: ${student.gender}

<br><br>

Favorite Sport: ${student.favoriteSport}

<br><br>

Operating Systems:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">
		<li>${temp}</li>
	</c:forEach>
</ul>

</body>

</html>