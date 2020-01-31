<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>학교 정보 수정</title>
</head>
<body>
<div id="formMain">
    <form action="/school/modify" method="post" id="school_form" name="school_form">
        <input name="schoolNo" id="schoolNo" type="hidden" value="${school.schoolNo}"> <br>

        학교명 : <input name="schoolName" id="schoolName" type="text" value="${school.schoolName}" readonly> <br>
        학교아이디 : <input name="schoolNickname" id="schoolNickname" type="text" value="${school.schoolNickname}" readonly> <br>
        초중고 : <select name="gradeNo" id="gradeNo" value="${school.gradeNo}">
        <option value="H">고등학교</option>
        <option value="M">중학교</option>
        <option value="E">초등학교</option>
    </select>

        <br>
        국립/사립 : <input name="ownerType" type="radio" value="N" <c:if test="${school.ownerType eq 'N' }"> checked</c:if>>국립
        <input name="ownerType" type="radio" value="P"  <c:if test="${school.ownerType eq 'P'}"> checked </c:if>  > 사립
        <br>
        eduType : <input name="eduType" id="eduType" type="text" value="${school.eduType}">
        <br>
        학교지역 : <input name="area" id="area" type="text" value="${school.area}">
        <br>
        <input type="submit" value="수정">
    </form>
</div>


</body>
</html>
