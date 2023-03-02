<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="struts" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table border="1">
    <tr>
      <th>Name</th>
      <th>Document</th>
      <th>Email</th>
    </tr>
    <struts:iterator value="customers">
      <tr>
        <td><struts:property value="name"/></td>
        <td><struts:property value="document"/></td>
        <td><struts:property value="email"/></td>
      </tr>
    </struts:iterator>
  </table>
  <a href="/app/customer/register.jsp">Register</a>
</body>
</html>
