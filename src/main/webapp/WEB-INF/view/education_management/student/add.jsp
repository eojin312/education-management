<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>student-add</title>
</head>
<body>
<form action="/student/add" method="post">
    학생명 :    <input name="name" type="text"> <br>
    학생 주민번호 : <input name="juminNo" type="text"> <br>
    성별 : <input name="sex" type="text"> <br>
    <input type="submit" value="등록">
</form>
<a href="/education/home">홈으로가기</a>
<a href="/student/list">목록으록 가기</a>
</body>
</html>
