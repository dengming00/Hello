<%--
  Created by IntelliJ IDEA.
  User: 邓明明
  Date: 2018/12/26
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery.min.js"></script>
<html>
<head>
    <title>Title</title>
    <script>
        //函数入口
        $(function () {
            $("#button").click(function () {
                alert("开始");
                $.ajax({
                    url:"testjson",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"name":"哈哈","age":100,"male":"男"}',
                    dataType:"json",
                    type:"post",
                    success:function(data){
                        alert("成功");
                        alert(data);
                        alert(data.name);
                    },
                    error:function () {
                        alert("错误");
                    }
            });

            });
        });
    </script>
</head>
<body>
<input type="button" value="发送ajax请求" id="button">

</body>
</html>
