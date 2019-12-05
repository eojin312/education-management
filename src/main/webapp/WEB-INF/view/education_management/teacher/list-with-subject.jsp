<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>선생님 리스트</title>
</head>
<body>
<table border="1" bgcolor="#ffdead">
    <c:forEach var="teacherSubject" items="${teacherList}">
    <tr>
        <th>선생님 명</th>
        <th>성별</th>
        <th>담임/비담임</th>
        <th>담당 반</th>
        <th>과목</th>
    </tr>
    <tr>
        <td><a href="/teacher/${teacherSubject.teacherNo}">${teacherSubject.teacherName}</a></td>
        <td>${teacherSubject.sex}</td>
        <td>${teacherSubject.classType}</td>
        <td>${teacherSubject.classroom}</td>
        <td>${teacherSubject.subjectName}</td>
    </tr>
    </c:forEach>
</table>
<a href="/education/home">홈으로 가기</a>
</body>
</html>
