<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <link href="/resources/css/styles.css" rel="stylesheet"/>
    <title>Tutor Registration Form</title>
</head>
<body class="background-color text-style">
<p>Fill in all the fields below:</p>
<hr>
<form:form action="processFormThree" modelAttribute="tutor">
    <form:input type="text" path="firstName" placeholder="Your first name"/>
    <br>
    <form:input type="text" path="lastName" placeholder="Your last name"/>
    <br>
<%--    <form:input type="date" path="dateOfBirth" placeholder="Your date of birth "/>--%>
<%--    <br>--%>
<%--    <form:radiobutton path="gender" value = "Male" label="Male"/>--%>
<%--    <br>--%>
<%--    <form:radiobutton path="gender" value = "Female" label="Female"/>--%>
<%--    <br>--%>
<%--    <form:radiobutton path="gender" value = "Transgender" label="Transgender"/>--%>
<%--    <br>--%>
<%--    <form:input type="text" path="login" placeholder="Create login name"/>--%>
<%--    <br>--%>
<%--    <form:password  path="password" placeholder="Create password"/>--%>
<%--    <br>--%>
<%--    <form:input type="email" path="email" placeholder="Your email"/>--%>
<%--    <br>--%>
<%--    <form:input type="text" path="country" placeholder="Your country"/>--%>
<%--    <br>--%>
<%--    <form:input type="text" path="city" placeholder="Your city"/>--%>
<%--    <br>--%>
<%--    <form:input type="text" path="street" placeholder="Your street name and number"/>--%>
<%--    <br>--%>
<%--    <form:input type="text" path="flatOrHouseNumber" placeholder="Your flat or house number"/>--%>
<%--    <br>--%>
<%--    <form:input type="text" path="postcode" placeholder="Your postcode"/>--%>
<%--    <br>--%>
    <input class="button" type="submit" value="Submit"/>
</form:form>
</body>

</html>