<%@ page language="java" pageEncoding="utf-8" %>
<!doctype html>
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap</title>
    <!-- loading bootstrap css -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
   	<style type="text/css">
   		#menu>div,#footer{
   			background-color:#e4e4e4;	
   		}
   	</style>
    <!-- loading bootstrap jquery -->
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <!-- loading bootstrap js -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
 </head>
  <body>
  <div class="container">
	  <div class="row" id="header">
	  <div class="col-md-12"><img src="https://www.bitcamp.co.kr/images/logo.png"></div>

	</div>
	<div class="row" id="menu">
	  <div class="col-md-3">&nbsp;</div>
	  <div class="col-md-2"><a href="index.action">HOME</a></div>
	  <div class="col-md-2"><a href="emp.action">EMP</a></div>
	  <div class="col-md-2"><a href="dept.action">DEPT</a></div>
	  <div class="col-md-3">&nbsp;</div>
	</div>
	<div class="row" id="content">
	  <div class="col-md-12">
	  <div class="jumbotron">
		  <h1>Hello, world!</h1>
		  <p>...</p>
		  <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a></p>
		</div>
	  </div>
	</div>
	<div class="row" id="footer">
	  <div class="col-md-12">
	  비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928<br/>
	(주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br/>
	통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br/>
	Copyright &copy; 비트캠프 All rights reserved.
	  </div>
	</div>
	</div>
  </body>
</html>