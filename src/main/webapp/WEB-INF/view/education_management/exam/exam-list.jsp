<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <title>Title</title>
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
<table border="1">
    <tr>
        <th>학년</th>
        <th>학기</th>
        <th>시작날짜</th>
        <th>끝나는 날짜</th>
        <th>과목 일련번호</th>
        <th>과목</th>
    </tr>
    <c:forEach var="examList" items="${examList}">
        <tr>
            <td>${examList.grade} 학년</td>
            <td>${examList.semester} 학기</td>
            <td>${examList.startDate}</td>
            <td>${examList.endDate}</td>
            <td>${examList.subjectNo}</td>
            <td>${examList.subjectName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
