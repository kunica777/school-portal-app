<!DOCTYPE html>
<html>
<head>
    <title>Registration Confirmation</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
</head>
<body class="background-color text-style">
<h3>Dear ${user.title} ${user.firstName} ${user.lastName}, your account was successfully created!</h3>
<hr>
<p><b>Please check your details below:</b></p>
<p>First name: ${user.firstName}</p>
<p>Last name: ${user.lastName}</p>
<p>Date of birth: ${user.dateOfBirth.date}/${user.dateOfBirth.month+1}/${user.dateOfBirth.year}</p>
<p>Gender: ${user.gender}</p>
<p>Email: ${user.email}</p>
<p>Country: ${user.country}</p>
<p>Education: ${user.courseName} (${user.educationLevel})</p>
<br>
<hr>
<p><a class="button" href="${pageContext.request.contextPath}/">HOME</a></p>
</body>
</html>
