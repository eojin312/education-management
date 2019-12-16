<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
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
        <td>${studentGradeClass.studentNo}</td>
        <td>${studentGradeClass.name}</td>
        <td>${studentGradeClass.juminNo}</td>
        <td>${studentGradeClass.sex}</td>
        <td>${studentGradeClass.id}</td>
        <td>${studentGradeClass.schoolName}</td>
        <td>${studentGradeClass.year}</td>
        <td>${studentGradeClass.grade}</td>
        <td>${studentGradeClass.gradeClass}</td>
    </tr>
</table>
<button><a href="/student/add">학생 등록하러 가기</a></button>
</body>
</html>