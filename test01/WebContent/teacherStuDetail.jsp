<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BITCAMP JEJU: LMS강사-수강생 상세정보</title>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">
	var attRate ="${bean.attRate()}";	//출석률
	var classRate = "${bean.classProgress()}"; //수업진행률
	 $(function(){
		$('#attRange').prop('value',attRate);
		$('#classRange').prop('value',classRate);		 
	 });
</script>
</head>
<body>
				<c:set value="${bean }" var="bean" />
				<table id="lecturetable">
					<tr>
						<th>개강일</th>
						<td>${bean.start_day }</td>
					</tr>
					<tr>
						<th>종강일</th>
						<td>${bean.end_day }</td>
					</tr>
					<tr>
						<th>수업 진행률</th>
						<td><progress id="classRange" max="100"></progress>${bean.calTilToday()}/${bean.calAttDays()},&nbsp;${bean.classProgress()}%</td>
					</tr>
					<tr>
						<th>출석률</th>
						<td><progress id="attRange" max="100"></progress>${bean.cntAtt()}/${bean.calAttDays()},&nbsp;${bean.attRate()}%</td>
					</tr>
					<tr>
						<th>출석</th>
						<td>${bean.cntAtt() }회</td>
					</tr>
					<tr>
						<th>지각</th>
						<td>${bean.cntLate() }회</td>
					</tr>
					<tr>
						<th>조퇴</th>
						<td>${bean.cntEarly() }회</td>
					</tr>
					<tr>
						<th>결석</th>
						<td>${bean.cntAbsent() }회</td>
					</tr>
				</table>
</body>
</html>