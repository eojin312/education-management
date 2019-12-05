<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>유저 리스트</title>
</head>
<body>
<c:forEach var="user" items="${userList}">
    ${user.name}
    ${user.id},
    ${user.email},
    ${user.gender}
</c:forEach>
</body>
</html>
