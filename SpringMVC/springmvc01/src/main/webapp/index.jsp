<%--
  Created by IntelliJ IDEA.
  User: 邓明明
  Date: 2018/12/25
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="hello"><h5>hello</h5></a>
<a href="delete?name=hehe"><h5>delete</h5></a>
<form action="update" method="get">
    姓名：<input type="text" name="username">
    年龄：<input type="text" name="age">
    <input type="submit" value="提交表单">
</form>
<form action="insert" method="post">
    姓名：<input type="text" name="name">
    年龄：<input type="text" name="year">
    性别：<input type="text" name="male">
    man姓名：<input type="text" name="man.mname">
    man年龄：<input type="text" name="man.mage">
    listman姓名：<input type="text" name="list[0].mname">
    listman年龄：<input type="text" name="list[0].mage">
    map姓名：<input type="text" name="map['mapname'].mname">
    map年龄：<input type="text" name="map['mapname'].mage">
    <input type="submit" value="提交表单">
</form>
<form action="DateTest" method="get">
    日期：<input type="text" name="date">
    <input type="submit" value="提交表单">
</form>


</body>
</html>
