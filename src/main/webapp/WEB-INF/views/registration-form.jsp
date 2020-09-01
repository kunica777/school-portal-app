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
    <form:select width="267"  cssStyle="width:267px" path="title">
        <form:option value="-" label="--Choose Title--"/>
        <form:options items="${user.titlesList}"/>
    </form:select>
    <br>
    <form:input  cssClass="form-width" type="text" path="firstName" placeholder="First name" required="required"/>*
    <form:errors path="firstName" cssClass="error"/>
    <br>
    <form:input cssClass="form-width"  type="text" path="lastName" placeholder="Last name" required="required"/>*
    <form:errors path="lastName" cssClass="error"/>
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
    <form:errors path="login" cssClass="error"/>
    <br>
    <form:input cssClass="form-width" type="password" path="password" placeholder="Password" required="required"/>*
    <form:errors path="password" cssClass="error"/>
    <br>
    <form:input cssClass="form-width" type="email" path="email" placeholder="Email" required="required"/>*
    <br>
    <form:input cssClass="form-width" type="text" path="phoneNumber" placeholder="Phone number"/>
    <form:errors path="phoneNumber" cssClass="error"/>
    <br>
    <form:select width="267"  cssStyle="width:267px" path="country">
        <form:option value="-" label="--Select Country--"/>
        <form:options items="${user.countriesList}"/>
    </form:select>
    <br>
    <form:input cssClass="form-width" type="text" path="courseName" placeholder="Name of the course"/>
    <br>
    <form:select width="267"  cssStyle="width:267px" path="educationLevel">
        <form:option value="-" label="--Education Level--"/>
        <form:options items="${user.levelsList}"/>
    </form:select>
    <br>
    <input class="button" type="submit" value="Submit"/>
</form:form>

</body>
</html>
