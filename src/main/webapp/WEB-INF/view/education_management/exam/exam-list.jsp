<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<table border="1">
    <tr>
        <th>학교 일련번호</th>
        <th>학교 이름</th>
    </tr>
    <tr>
        <td> ${school.schoolNo}</td>
        <td><a href="/school/${school.schoolNo}">${school.schoolName}</a></td>
    </tr>
</table>
<table class="table table-striped">
    <tr>
        <th>학년</th>
        <th>학기</th>
        <th>시작날짜</th>
        <th>끝나는 날짜</th>
        <th>과목 일련번호</th>
        <th>과목</th>
        <th>시험일련번호</th>
    </tr>
    <c:forEach var="exam" items="${examList}">
        <tr>
            <td>${exam.gradeNo} 학년</td>
            <td>${exam.semester} 학기</td>
            <td>${exam.startDate}</td>
            <td>${exam.endDate}</td>
            <td>${exam.subjectNo}</td>
            <td>${exam.subjectName}</td>
            <td>${exam.examNo}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
