<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>학사 관리 프로그램</title>

    <link rel="stylesheet" href="/static/bootstrap/bootstrap.css" type="text/css">
    <link rel="stylesheet" href="/static/bootstrap/bootstrap-theme.css" type="text/css">
    <script src="/static/js/jquery.3.4.js"></script>
    <script src="/static/bootstrap/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <h1>나이스</h1>


    <div class="navbar-collapse collapse">
        <ul class="nav navbar-nav">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown
                    <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li class="dropdown-header">Nav header</li>
                    <li><a href="#">Separated link</a></li>
                    <li><a href="#">One more separated link</a></li>
                </ul>
            </li>
        </ul>
    </div>


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
