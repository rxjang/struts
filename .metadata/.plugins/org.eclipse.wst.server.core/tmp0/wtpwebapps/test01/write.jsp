<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form method="post" action="writeAction.jsp">
			<table>
				<thead>
					<tr>
						<th colspan="2">게시판 글쓰기 양식</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><input type="text" placeholder="글 제목" maxlength="50" name="bbsTitle"></td>
					</tr>
					<tr>
						<td><textarea placeholder="글 내용" maxlength="2048" name="bbsContent"></textarea></td>
					</tr>
				</tbody>
			</table>
		<button>글쓰기</button>
		</form>
	</div>
</body>
</html>