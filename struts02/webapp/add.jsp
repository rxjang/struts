<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>입력페이지</h2>
	<form action="insert.action" method="post">
		<div>
			<label for="dname">dname</label>
			<input type="text" name="dname" id="dname"/>
		</div>
		<div>
			<label for="loc">loc</label>
			<input type="text" name="loc" id="loc"/>
		</div>
		<div>
			<button>입력</button>		
		</div>
	</form>
</body>
</html>