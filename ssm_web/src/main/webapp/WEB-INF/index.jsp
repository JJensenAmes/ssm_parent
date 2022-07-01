<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2022/6/14
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>

  </head>
  <body>
  <h1 style="color: coral">全部主题>>></h1>
  <table  width="800px" border="1" cellspacing="0" bgcolor="#add8e6">
    <tr>
      <th>序号</th>
      <th>主题</th>
      <th>投票/查看</th>
      <th>创建时间</th>
    </tr>
    <c:forEach var="su" items="${list}" varStatus="va">
      <tr>
      <td align="center">${va.count}</td>
        <td align="center"><a  href="tovote.do?id=${su.id}">${su.title}</a></td>
      <td align="center">${su.totalVotes}/${su.viewTimes}</td>
      <td align="center">${su.creatDate}</td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>
