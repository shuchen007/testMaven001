<%@ page language="java"  contentType="text/html;charset=UTF-8" pageEncoding="utf-8"%>
<html>
<body>
<h2>Hello World!</h2>
${name}
</br>
<%=request.getParameter("name")%>
</br>
<%=request.getAttribute("name")%>
</br>
<%=request.getAttribute("do")%>
<form action="myController" method="post">
    <input type="text" name="name">
    return:${name}
    <input value="提交1" type="submit">
</form>
</body>
</html>
