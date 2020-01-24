<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <steyle></steyle>
</head>
<body>
<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
    <h1 class="h3 mb-0 text-gray-800">학교목록</h1>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
            class="fas fa-download fa-sm text-white-50"></i> Excel Download</a>
</div>

<table class="table table-bordered dataTable">
    <c:forEach var="school" items="${schoolList}">
        <tr>
            <th>학교이름</th>
            <th>학교닉네임</th>
            <th>초중고</th>
            <th>지역</th>
        </tr>
        <tr>
            <td><a href="/school/${school.schoolNo}/grade-class">${school.schoolName}</a></td>
            <td>${school.schoolNickname}</td>
            <td>${school.grade}</td>
            <td>${school.area}</td>
        </tr>
    </c:forEach>
</table>
<form name="search-form" method="get" action="/school/list">
    지역 : <input type="text" name="area" value="${schoolSearchParameter.area}"/> <br/>
    학교명 : <input type="text" name="schoolName" value="${schoolSearchParameter.schoolName}"/> <br/>
    <input type="submit" value="검색"/>
</form>

</body>
</html>
