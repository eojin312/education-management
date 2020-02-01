<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table table-bordered dataTable">
    <tr>
        <th>학생번호</th>
        <th>학생 이름</th>
        <th>주민번호</th>
        <th>성별</th>
        <th>아아디</th>
        <th>학교</th>
        <th>년도</th>
        <th>학년</th>
        <th>반</th>
    </tr>
    <tr>
        <td>${studentDetail.studentNo}</td>
        <td>${studentDetail.name}</td>
        <td>${studentDetail.juminNo}</td>
        <td>${studentDetail.sex}</td>
        <td>${studentDetail.id}</td>
        <td>${studentDetail.schoolName}</td>
        <td>${studentDetail.year}</td>
        <td>${studentDetail.grade}</td>
        <td>${studentDetail.gradeClass}</td>
    </tr>
</table>
<button><a href="/student/add">학생 등록하러 가기</a></button>
</body>
</html>