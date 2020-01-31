<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<div>
    <form action="/exams/add" method="post">
        년도 <select name="year">
        <option value="2020">2020</option>
        <option value="2019">2019</option>
        <option value="2018">2018</option>
    </select>
        학교명 : <select name="schoolNo">
        <option value="1">부림중</option>
    </select> <br>
        학년: <select name="gradeNo">
        <option value="1">1학년</option>
        <option value="2">2학년</option>
        <option value="3">3학년</option>
    </select><br>
        시험종류 : <select name="examType">
        <option value="MIDDLE">중간</option>
        <option value="FINAL">기말</option>
        <option value="PERFORMENCE">수헹</option>
    </select>
        <input type="submit" value="등록">
    </form>
</div>
</body>
</html>
