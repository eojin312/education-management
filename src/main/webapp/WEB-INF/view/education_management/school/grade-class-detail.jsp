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
        <td>${school.schoolNo}</td>
        <td>${school.schoolName}</td>
        <td>${school.area}</td>

    </tr>
</table>
<table border="1">
    <tr>
        <th>학번</th>
        <th>번호</th>
        <th>이름</th>
        <th>성별</th>
    </tr>
    <c:forEach var="gradeclass" items="${gradeclassDetailList}">
        <tr>
            <td>${gradeclass.studentNo}</td>
            <td>${gradeclass.studentClassNumber}</td>
            <td>${gradeclass.name}</td>
            <td>${gradeclass.sex}</td>
            <td><input type="button" value="응시했던 시험 확인하기"
                       onclick="window.location.href='/exam/exam-apply-list/${gradeclass.studentNo}';"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
