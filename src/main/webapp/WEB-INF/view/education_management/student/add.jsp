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
            <select name="gradeClassNo">
                <option value="1">1-1</option>
                <option value="2">1-2</option>
                <option value="3">1-3</option>
                <option value="4">1-4</option>
                <option value="5">1-5</option>
            </select>
        </div>
        <input type="submit" value="등록">
    </form>
</div>
<a href="/home">홈으로가기</a>
<a href="/student/list">목록으록 가기</a>
</body>
</html>
