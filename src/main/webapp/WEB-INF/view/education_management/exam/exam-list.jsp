<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <title>Title</title>
</head>
<body>
${school.schoolNo}
${school.schoolName}
${school.grade}
<table>
    <c:forEach var="examList" items="${examList}">
        <tr>
            <td>${examList.examNo}</td>
            <td>${examList.grade}</td>
            <td>${examList.semester}</td>
            <td>${examList.startDate}</td>
            <td>${examList.endDate}</td>
            <td>${examList.subjectNo}</td>
            <td>${examList.subjectName}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
