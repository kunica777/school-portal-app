<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Registration Form</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
</head>
<body class="background-color text-style">
<p><b>Student Registration Form</b></p>
<hr>
<p>Fields marked with * are required for filling</p>
<form:form action="processForm" modelAttribute="student">
    <form:input cssClass="form-width" type="text" path="firstName" placeholder="First name" required="required"/>*
    <br>
    <form:input cssClass="form-width" type="text" path="lastName" placeholder="Last name" required="required"/>*
    <br>
    <form:input cssClass="form-width" type="text" path="dateOfBirth" placeholder="dd/mm/yyyy" required="required"/>*
    <br>
    <form:radiobutton path="gender" value="Male" label="Male"/>
    <br>
    <form:radiobutton path="gender" value="Female" label="Female"/>
    <br>
    <form:radiobutton path="gender" value="Transgender" label="Transgender"/>
    <br>
    <form:input cssClass="form-width" type="text" path="login" placeholder="Login name" required="required"/>*
    <br>
    <form:password cssClass="form-width" path="password" placeholder="Password" required="required"/>*
    <br>
    <form:input cssClass="form-width" type="email" path="email" placeholder="Email" required="required"/>*
    <br>
    <form:select path="countryCode">
        <form:option cssClass="form-width" value="-" label="--Select Country--"/>
        <form:options cssClass="form-width" items="${student.countryOptions}"/>
    </form:select>
    <br>
    <form:input cssClass="form-width" type="text" path="city" placeholder="City"/>
    <br>
    <form:input cssClass="form-width" type="text" path="street" placeholder="Street"/>
    <br>
    <form:input cssClass="form-width" type="text" path="flatOrHouseNumber" placeholder="Flat/house number"/>
    <br>
    <form:input cssClass="form-width" type="text" path="postcode" placeholder="Postcode"/>
    <br>
    <input class="button" type="submit" value="Submit"/>

</form:form>

</body>
</html>