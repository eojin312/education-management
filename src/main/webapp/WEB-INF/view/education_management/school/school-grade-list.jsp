<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>학교번호</td>
        <td>${school.schoolNo}</td>
    </tr>
    <tr>
        <td>학교이름</td>
        <td>${school.schoolName}</td>
    </tr>
</table>
<table border="1">
    <tr>
        <th>반 일련번호</th>
        <th>년도</th>
        <th>학년</th>
        <th>반</th>
        <th>기능</th>
    </tr>
    <c:forEach var="gradeclass" items="${gradeclassList}">
        <tr>
            <td>${gradeclass.gradeClassNo}</td>
            <td>${gradeclass.year}</td>
            <td>${gradeclass.grade}</td>
            <td>${gradeclass.gradeClass}</td>
            <td><input type="button" value="반상세정보"
                       onclick="window.location.href='/school/${school.schoolNo}/grade-class/${gradeclass.gradeClassNo}';">
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
