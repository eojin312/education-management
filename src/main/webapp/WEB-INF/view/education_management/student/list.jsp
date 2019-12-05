<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>학생 리스트</title>
</head>
<body>
<table border="1" bgcolor="#ffdead">
    <c:forEach var="student" items="${studentList}">
        <tr>
            <th>학생이름</th>
            <th>주민번호</th>
            <th>성별</th>
        </tr>
        <tr>
            <td><a href="/student/${student.studentNo}">${student.name}</a></td>
            <td>${student.juminNo}</td>
            <td>${student.sex}</td>
        </tr>
    </c:forEach>
</table>
<a href="/education/home">홈으로 가기</a>
<a href="/student/add">등록하러가기</a>
</body>
</html>
