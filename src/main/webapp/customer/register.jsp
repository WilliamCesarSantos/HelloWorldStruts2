<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="struts" uri="/struts-tags" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Cadastro cliente</title>
</head>
<body>
    <struts:form action="register_customer" method="post">
        <struts:textfield label="Name" name="customer.name" />
        <struts:textfield label="Document" name="customer.document" />
        <struts:textfield label="Email" name="customer.email" />
        <struts:submit value="Cadastrar" />
    </struts:form>
</body>
</html>
