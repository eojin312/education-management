<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>student-add</title>
</head>
<body>
<div>
    <form action="/student/add" method="post">
        학생명 : <input name="name" type="text"> <br>
        학생 주민번호 : <input name="juminNo" type="text"> <br>
        성별 : <input name="sex" type="text"> <br>
        id : <input name="id" type="text"> <br>
        pwd : <input name="pwd" type="password"> <br>
        <div>
            반 : 1반<input name="gradeClassNo" type="radio" value="1">
            2반<input name="gradeClassNo" type="radio" value="2">
            3반<input name="gradeClassNo" type="radio" value="3">
            4반<input name="gradeClassNo" type="radio" value="4">
            5반<input name="gradeClassNo" type="radio" value="5">
            <input type="submit" value="등록">
        </div>
    </form>
</div>
<a href="/home">홈으로가기</a>
<a href="/student/list">목록으록 가기</a>
</body>
</html>
