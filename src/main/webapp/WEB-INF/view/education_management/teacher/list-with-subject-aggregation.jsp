<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>선생님 리스트</title>
</head>
<body>
<table class="table table-bordered dataTable">
    <c:forEach var="teacher" items="${teacherList}">
        <tr>
            <th>선생님 명</th>
            <th>성별</th>
            <th>담임/비담임</th>
            <th>담당 반</th>
            <th>과목</th>
        </tr>
        <tr>
            <td><a href="/teacher/${teacher.teacherNo}">${teacher.teacherName}</a></td>
            <td>${teacher.sex}</td>
            <td>${teacher.classType}</td>
            <td>${teacher.classroom}</td>
            <td>${teacher.subject.subjectName}</td>
        </tr>
    </c:forEach>
</table>
<a href="/education/home">홈으로 가기</a>
</body>
</html>
