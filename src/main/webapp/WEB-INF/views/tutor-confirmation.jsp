<!DOCTYPE html>
<html>
<head>
    <title>Tutor Confirmation Page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
</head>
<body class="background-color text-style">
<h3>Dear ${tutor.firstName} ${tutor.lastName}, your ${tutor.title} account was successfully created!</h3>
<hr>
<p>Your first name: ${tutor.firstName}</p>
<p>Your last name: ${tutor.lastName}</p>
<p>Your date of birth: ${tutor.dateOfBirth.date}/${tutor.dateOfBirth.month+1}/${tutor.dateOfBirth.year}</p>
<p>Your gender: ${tutor.gender}</p>
<p>Your email: ${tutor.email}</p>
<br>
<p>Your address:</p>
<p>${tutor.country}</p>
<p>${tutor.city}</p>
<p>${tutor.street}-${tutor.flatOrHouseNumber}</p>
<p>${tutor.postcode}</p>
<hr>
<p><a class="button" href="${pageContext.request.contextPath}/">HOME</a></p>
</body>
</html>