<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${student.name} 님의 시험 응시 리스트입니다.
<table border="1">
    <tr>
        <th>시험 일련번호</th>
        <th>응시한 시험 일련번호</th>
        <th>학기</th>
        <th>만든날짜</th>
        <th>선생님이름</th>
        <th>업데이트날짜</th>
    </tr>
    <c:forEach var="studentApply" items="${studentApplyList}">
        <tr>
            <td>${studentApply.examNo}</td>
            <td>${studentApply.examStudentApplyNo}</td>
            <td>${studentApply.semester}학기</td>
            <td>${studentApply.createDate}</td>
            <td>${studentApply.teacherName}</td>
            <td>${studentApply.updateDate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
