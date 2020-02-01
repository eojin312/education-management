<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>선생님 등록 페이지</title>
</head>
<body>
<form action="/teacher/add" method="post" id="teacher_form" name="school_form">
    선생님 명 : <input type="text" id="teacherName" name="teacherName"> <br>
    선생님 성별 : <select name="sex" id="sex">
                    <option value="M">남자</option>
                    <option value="F">여자</option>
                </select> <br>
    주민번호 :  <input type="text" id="juminNo" name="juminNo"> <br>
    담당 과목 : <select name="subjectNo" id="subjectNo">
                <option value="1">국어</option>
                <option value="2">수학</option>
                <option value="3">사회</option>
                <option value="4">과학</option>
                <option value="5">영어</option>
                <option value="6">한국사</option>
              </select>
         <input type="submit" value="등록">
</form>

<a href="/teacher/list-with-subject">리스트 보기</a>
</body>
</html>
