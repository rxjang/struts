<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 파일 업로</title>
</head>
<body>
	<form action="upload.jsp" method="post"  enctype="multipart/form-data">
		파일: <input type="file" name="file"><br>
		<input type="submit" value="업로드"><br>
	</form>
	<br>
	<a href="fileDownload.jsp">파일 다운로드 페이</a>
</body>
</html>