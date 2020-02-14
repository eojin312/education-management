
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul id="listDiv">

</ul>
<div id="paging-area">

</div>

<script>
    $(document).ready(function () {
        getList(1);
        let pagingHtml = '';
        for (let i = 1; i <= 10; i++) {
            pagingHtml += '<a href="#" onclick="getList(' + i + ');return false;">' + i + '</a>';
        }
        console.log(pagingHtml);
        $('#paging-area').html(pagingHtml);
    });

    function getList(pageNo) {
        $.ajax(
            {
                url: '/student/list.jq'
                , data: {
                    page: pageNo
                    , rows: 5
                    , sord: 'desc'
                }
                , method: 'GET'
            }
        ).done(function (response) {
            let aa = '';
            for (let i = 0; i < response.list.length; i++) {
                aa += '<li>' + response.list[i].name + '</li>';
            }

            $('#listDiv').html(aa);
        });
    }
</script>
</body>
</html>
