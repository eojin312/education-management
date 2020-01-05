<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
${gradeClassWithSchool.schoolNo}
${gradeClassWithSchool.schoolName}
<c:forEach var="gradeClassWithSchool" items="gradeClassWithSchoolList">
    ${gradeClassWithSchool.gradeClassNo}
    ${gradeClassWithSchool.year}
    ${gradeClassWithSchool.grade}
    ${gradeClassWithSchool.gradeClass}
</c:forEach>
</body>
</html>
