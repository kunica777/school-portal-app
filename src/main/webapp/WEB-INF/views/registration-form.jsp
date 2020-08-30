<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css"/>
</head>
<body class="background-color text-style">
<H2>Registration Form</h2>
<hr>
<p>Fields marked with * are required</p>
<form:form action="processForm" modelAttribute="user">
    <form:select path="title">
        <form:option cssClass="form-width" value="-" label="--Choose Title--"/>
        <form:options cssClass="form-width" items="${titles}"/>
    </form:select>
    <br>
    <form:input  cssClass="form-width" type="text" path="firstName" placeholder="First name" required="required"/>*
    <br>
    <form:input cssClass="form-width"  type="text" path="lastName" placeholder="Last name" required="required"/>*
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
    <form:input cssClass="form-width" type="text" path="phoneNumber" placeholder="Phone number"/>
    <br>
    <form:select path="country">
        <form:option cssClass="form-width" value="-" label="--Select Country--"/>
        <form:options items="${countries}"/>
    </form:select>
    <br>
    <form:input cssClass="form-width" type="text" path="courseName" placeholder="Name of the course"/>
    <br>
    <form:select path="educationLevel">
        <form:option  cssStyle="width: 259px" value="-" label="--Education Level--"/>
        <form:options  items="${educationLevels}"/>
    </form:select>
    <br>
    <input class="button" type="submit" value="Submit"/>
</form:form>

</body>
</html>