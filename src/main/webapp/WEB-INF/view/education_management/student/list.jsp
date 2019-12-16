<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
    <title>학생 리스트</title>
</head>
<body>
<table border="1" bgcolor="#ffdead">
    <c:forEach var="studentGradeClass" items="${studentList}">
        <tr>
            <th>학생이름</th>
            <th>주민번호</th>
            <th>성별</th>
            <th>아아디</th>
            <th>학교</th>
            <th>년도</th>
            <th>학년</th>
            <th>반</th>
        </tr>
        <tr>
            <td><a href="/student/${studentGradeClass.studentNo}">${studentGradeClass.name}</a></td>
            <td>${studentGradeClass.juminNo}</td>
            <td>${studentGradeClass.sex}</td>
            <td>${studentGradeClass.id}</td>
            <td>${studentGradeClass.schoolName}</td>
            <td>${studentGradeClass.year}</td>
            <td>${studentGradeClass.grade}</td>
            <td>${studentGradeClass.gradeClass}</td>
        </tr>
    </c:forEach>
</table>

<a href="http://hachi.edu.go.kr:8080/">홈으로 가기</a>
<a href="/student/add">등록하러가기</a>
</body>
</html>
