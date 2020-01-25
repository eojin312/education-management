<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>선생님 등록 상세화면</title>
</head>
<body>
<table class="table table-bordered dataTable">
    <tr>
        <th>선생님 이름</th>
        <th>선생님 주민번호</th>
        <th>선생님 성별</th>
        <th>선생님 과목</th>
    </tr>
    <tr>
        <td>${teacher.teacherName}</td>
        <td>${teacher.juminNo}</td>
        <td>${teacher.sex}</td>
        <td>${teacher.subjectNo}</td>
    </tr>
</table>

<a href="/teacher/add">선생님 등록 화면으로 가기</a>
</body>
</html>
