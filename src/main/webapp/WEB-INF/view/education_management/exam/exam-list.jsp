<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>학사 관리 프로그램</title>
    <%--sbadmin2를 사용할 때에는 bootstrap.css는 별도로 필요없다--%>
    <%--<link rel="stylesheet" href="/static/bootstrap/bootstrap.css" type="text/css">--%>
    <link rel="stylesheet" href="/static/bootstrap/theme/sbadmin2/all.min.css" type="text/css">
    <link rel="stylesheet" href="/static/bootstrap/theme/sbadmin2/sb-admin-2.min.css" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">
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
            <td>${exam.grade} 학년</td>
            <td>${exam.semester} 학기</td>
            <td>${exam.startDate}</td>
            <td>${exam.endDate}</td>
            <td>${exam.subjectNo}</td>
            <td>${exam.subjectName}</td>
            <td>${exam.examNo}</td>
        </tr>
    </c:forEach>
</table>

<!-- 공통 js 들 -->
<script src="/static/bootstrap/theme/sbadmin2/jquery.js"></script>
<script src="/static/bootstrap/theme/sbadmin2/bootstrap.bundle.js"></script>
<script src="/static/bootstrap/theme/sbadmin2/jquery.easing.min.js"></script>
<script src="/static/bootstrap/theme/sbadmin2/sb-admin-2.js"></script>

</body>
</html>
