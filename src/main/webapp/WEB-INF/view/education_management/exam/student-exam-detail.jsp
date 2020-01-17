<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1" bgcolor="#006400">
    <tr>
        <th>이름</th>
        <th>학년</th>
        <th>학기</th>
        <th>과목</th>
        <th>점수</th>
        <th>만점</th>
        <th>시작날짜</th>
        <th>종료날짜</th>
    </tr>
    <c:forEach var="examDetail" items="${examDetail}">
        <tr>
            <td>${examDetail.name}</td>
            <td>${examDetail.grade} 학년</td>
            <td>${examDetail.semester} 학기</td>
            <td>${examDetail.subjectName}</td>
            <td>${examDetail.score} 점</td>
            <td>${examDetail.perfect} 점</td>
            <td>${examDetail.startDate}</td>
            <td>${examDetail.endDate}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
