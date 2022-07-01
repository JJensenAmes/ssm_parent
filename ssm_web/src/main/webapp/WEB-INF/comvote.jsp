<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
    <script>
        function checkname(){
            var name=document.getElementsByName("option")
            for(var i=0;i<name.length;i++){
                if(name[i].checked){
                    return true;
                }
            }
            alert("请至少选择一个选项");
            return false;
        }

        function a(status){
            if(status==hide){
                alert("11");
            document.getElementById("vote").hidden='true';
            }
        }
    </script>

</head>
<body align="center" onload="javascript:a(${status})">
<h1>${result.sub.title}</h1><br>
<h3>${result.sub.viewTimes}次查看,共有${result.sub.totalVotes}人投票</h3>
<form action="dovote.do" method="post">
    <input type="hidden" name="id" value="${result.sub.id}">
    <table bgcolor="#add8e6" width="300" align="center">
        <c:forEach var="op" items="${result.oplist}" varStatus="va">
            <tr>
                <td>${va.count}</td>
                <td>${op.optContent}</td>
                <td>${op.vote}票</td>
                <td><f:formatNumber pattern="0.00%">${op.vote/result.sub.totalVotes}</f:formatNumber></td>
            </tr>
        </c:forEach>
    </table>
    <a href="view.do">返回首页</a>
    ${status}
</form>
</body>
</html>
