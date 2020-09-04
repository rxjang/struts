<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!doctype html>
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>EMP LIST PAGE!</title>
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
	<script type="text/javascript">
		$(function(){
			if('${title}' =='detail'){
				$('#content h1').text('상세페이지');
				$('#content form').children().last().hide();
				$('#content form input').prop('readonly',true);
				$('#content form .form-group').show();
				$('#content a').show();
			}else if('${title}' =='edit'){
				$('#content h1').text('수정페이지');
				$('#content form').attr('action','eupdate.action');
				$('#content form').children().last().show();
				$('#content form input').first().prop('readonly',true);
				$('#content form input').first().siblings().prop('readonly',false);
				$('#content a').hide();
				$('#content form .form-group').show();
			}else{
				$('#content h1').text('입력페이지');
				$('#content form').attr('action','einsert.action');
				$('#content form').children().last().show();
				$('#content a').hide();
				$('#content form .form-group').eq(0).hide().next().next().next().hide();
			}
		});
	</script>	 
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
	 	 <div class="page-header">
 	 		<h1>상세페이지 <small>${bean.empno }</small></h1>
		</div>
	  	<form class="form-horizontal">
		  <div class="form-group">
		    <label for="empno" class="col-sm-2 control-label">EMPNO</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="empno" id="empno" placeholder="사번" value="${bean.empno }">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="name" class="col-sm-2 control-label">NAME</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="name" id="name" placeholder="이름" value="${bean.name }">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="sub" class="col-sm-2 control-label">sub</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="sub" id="sub" placeholder="제목" value="${bean.sub }">
		  </div>
		  </div>
		  <div class="form-group">
		    <label for="nalja" class="col-sm-2 control-label">nalja</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="nalja" id="nalja" placeholder="날짜" value="${bean.nalja }">
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="pay" class="col-sm-2 control-label">pay</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="pay" id="pay" placeholder="금액" value="${bean.pay }">
		    </div>
		  </div>
		  <div class="form-group">
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary btn-block">submit</button>
		      <button type="submit" class="btn btn-default btn-block">reset</button>
		    </div>
		  </div>
		</form>
		<a href="eedit.action?empno=${bean.empno }&title=edit" class="btn btn-primary" role="btn">수정</a>
		<a href="edelete.action?empno=${bean.empno }" class="btn btn-danger" role="btn">삭제</a>
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