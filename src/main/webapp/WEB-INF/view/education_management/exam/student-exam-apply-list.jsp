<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>시험 일련번호</th>
        <th>학생 일련번호</th>
        <th>응시한 시험 일련번호</th>
        <th>학생이름</th>
        <th>학년</th>
        <th>학기</th>
        <th>만든날짜</th>
        <th>선생님이름</th>
        <th>업데이트날짜</th>
    </tr>
    <c:forEach var="studentApplyList" items="${studentApplyList}">
        <tr>
            <td>${studentApplyList.examNo}</td>
            <td>${studentApplyList.studentNo}</td>
            <td>${studentApplyList.examStudentApplyNo}</td>
            <td>${studentApplyList.name}</td>
            <td>${studentApplyList.grade}</td>
            <td>${studentApplyList.semester}학기</td>
            <td>${studentApplyList.createDate}</td>
            <td>${studentApplyList.teacherName}</td>
            <td>${studentApplyList.updateDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
