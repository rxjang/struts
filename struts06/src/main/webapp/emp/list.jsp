<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>리스트 페이지</h1>
	<table>
		<tr>
			<th>EMPNO</th>
			<th>sub</th>
			<th>NAME</th>
			<th>NALJA</th>
			<th>PAY</th>
		</tr>
		<c:forEach items="${list }" var="bean">
		<tr>
			<td><a href="detail.action?empno=${bean.empno }">${bean.empno }</a></td>
			<td><a href="detail.action?empno=${bean.empno }">${bean.sub }</a></td>
			<td><a href="detail.action?empno=${bean.empno }">${bean.name }</a></td>
			<td><a href="detail.action?empno=${bean.empno }">${bean.nalja }</a></td>
			<td><a href="detail.action?empno=${bean.empno }">${bean.pay }</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href="add.action">입 력</a>
</body>
</html>