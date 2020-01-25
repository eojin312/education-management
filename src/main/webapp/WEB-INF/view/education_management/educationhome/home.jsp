<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>

</head>
<body>
<div class="container">
    <h1>나이스</h1>

    <div id="main">
        <div class="gnb">
                <span>
                    <c:choose>
                        <c:when test="${loginedTeacher != null}">
                            ${loginedTeacher.teacherName} 선생님 안녕하세요. <a href="#"
                                                                        onclick="logout(); return false;">로그아웃</a>
                        </c:when>
                        <c:otherwise>
                            로그인해주세요
                        </c:otherwise>
                    </c:choose>
                </span>
            <button type="button" class="btn btn-lg btn-default">Default</button>
        </div>
        <div>
            <ul>
                <li><a href="/student/list">학생 관리</a></li>
                <li><a href="/school/list">학교 관리</a></li>
                <li><a href="teacher/list-with-subject">선생님 관리</a></li>
                <li><a href="#">공지사항</a></li>
            </ul>
        </div>
        <c:if test="${loginedTeacher == null}">
            <form id="loginform" name="loginform" method="post" action="/login">
                <div id="login">
                    id <br> <input type="text" id="userId" name="userId"> <br>
                    password <br> <input type="password" id="userPwd" name="userPwd">
                    <br><input type="button" value="로그인하기" onclick="login()">
                </div>
                <div>
                    <input type="radio" name="userType" value="student">학생
                    <input type="radio" name="userType" value="teacher">선생님
                    <input type="radio" name="userType" value="staff">교육청
                </div>
            </form>
        </c:if>
    </div>
</div>


<script>
        function login() {
            var userId = $('#userId').val();
            var userPwd = $('#userPwd').val();
            if (userId == '') {
                alert('아이디를 입력해주세요');
                $('#userId').focus();
                return;
            }
            if (userPwd == '') {
                alert('비밀번호를 입력해주세요');
                $('#userPwd').focus();
                return;
            }
            var userType = $('input:radio[name=userType]:checked').val();
            console.log(userType);
            if (userType == undefined) {
                alert('로그인 타입을 지정해주세요');
                return;
            }
            $('#loginform').submit();
        }
        function logout() {
            if (confirm("정말 로그아웃 하시겠습니까?")) {
                window.location.href = '/logout';
            } else {
                console.log("취소");
            }
        }
    </script>
</body>
</html>
