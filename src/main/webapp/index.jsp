<%@ page import="java.util.Date, " %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Логирование</title>
</head>
<body>
    <h1>Логирование</h1>
    <h4>
        <a href="/Logger">LogServlet</a>
        <br>
    </h4>
    <br>
    <h2>
       Текущие данные
     </h2>
     <h4>
       Ваш ip адрес <%=request.getRemoteAddr()%>
       <br>
       Дата время <%= new Date().toString()%>
     </h4>
</body>
</html>
