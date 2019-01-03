<%--
  Created by IntelliJ IDEA.
  User: 邓明明
  Date: 2019/1/2
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查找所有findAll</title>
</head>
<body>
<table width="50%" border=1 align="center">
    <c:forEach items="${list}" var="user">
        <tr>
            <td>序号：</td>
            <td> ${user.id}</td>
            <td>银行：</td>
            <td> ${user.name}</td>
            <td>存款：</td>
            <td> ${user.money}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
