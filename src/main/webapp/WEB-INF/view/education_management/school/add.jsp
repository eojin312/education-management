<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="formMain">
    <form action="/school/add" method="post" id="school_form" name="school_form">
        학교명 : <input name="schoolName" id="schoolName" type="text"> <br>
        학교아이디 : <input name="schoolNickname" id="schoolNickname" type="text"> <br>
        초중고 : <select name="grade" id="grade">
        <option value="H">고등학교</option>
        <option value="M">중학교</option>
        <option value="E">초등학교</option>
    </select>

        <br>
        국립/사립 : <input name="ownerType" type="radio" value="N">국립
                  <input name="ownerType" type="radio" value="P">사립
        <br>
        eduType : <input name="eduType" id="eduType" type="text">
        <br>
        학교지역 : <input name="area" id="area" type="text">
        <br>
        <input type="submit" value="등록">
    </form>
</div>

<button><a href="/school/list">학교리스트</a></button>


</body>
</html>
