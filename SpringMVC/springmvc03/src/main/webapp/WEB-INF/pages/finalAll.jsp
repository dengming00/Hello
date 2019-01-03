<%--
  Created by IntelliJ IDEA.
  User: 邓明明
  Date: 2018/12/28
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>finalAll</title>
</head>
<body>
<div>查找所有</div>

<c:forEach items="${list}" var="user">
    ${user.id}
    ${user.money}
    ${user.name}
    <br>

</c:forEach>

</body>
</html>
