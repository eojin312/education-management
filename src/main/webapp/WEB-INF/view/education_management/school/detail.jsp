<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
     <script src="/static/js/jquery.3.4.js"></script>
</head>
<body>
     ${school.schoolNo}
     <br>
     ${school.schoolName}
     <br>
     ${school.schoolNickname}
     <br>
     ${school.gradeName}
     <br>
     <c:if test="${school.ownerType eq 'P'}">사립</c:if>
     <c:if test="${school.ownerType eq 'N'}">공립</c:if>
     <br>
     ${school.eduType}
     <br>
     ${school.useYn}
     <br>
     ${school.area}
<button><a href="/school/add">등록하러가기</a></button>
<button><a href="/school/modify/${school.schoolNo}">수정</a></button>
     <div id="delete">
          <button id="remove" onclick="remove('${school.schoolNo}')">삭제하기</button>
     </div>
<script>

     function remove(_schoolNo) {
         $.ajax({
             url : "/school/remove"
             ,type : "POST"
             ,data : {schoolNo : _schoolNo}
             ,success : function (res) {
                 console.log(res);
                 if (res.success == false) {
                     alert(res.errorMessage);
                 } else {
                     alert(res.success);
                     window.location.href = '/school/list';
                 }
             }
         })
     }
</script>
</body>
</html>
