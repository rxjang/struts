/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.105
 * Generated at: 2020-08-24 04:57:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bitjeju.member.model.MemberDto;

public final class teacher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/template/lmsheader.jspf", Long.valueOf(1597416394000L));
    _jspx_dependants.put("/template/footer.jspf", Long.valueOf(1597416394000L));
    _jspx_dependants.put("/template/lmshead.jspf", Long.valueOf(1597416394000L));
    _jspx_dependants.put("/template/menu.jspf", Long.valueOf(1597416394000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bitgrid.css\">   \n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.12.4.min.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("$(function (){\n");
      out.write(" \t$('.gotolms').on('click', function(){ //LMS접속 버튼 눌렀을 때 처리\n");
      out.write("\t\t\n");
      out.write("\t   if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"==''){\t//세션에 회원정보가 없으면 로그인 필요.\n");
      out.write("\t\t\tconsole.log('로그인필요');\t\n");
      out.write("\t    \talert('로그인이 필요합니다.');\n");
      out.write("\t   } else if(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.lvl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"<2){ //로그인되어있는 회원의 권한레벨이 낮으면 접속불가\n");
      out.write("\t    \n");
      out.write("\t\t\tconsole.log('권한부족');\t\n");
      out.write("\t    \talert('권한이 부족합니다.');\n");
      out.write("\t   } else{ //접속성공\n");
      out.write("\t    \n");
      out.write("\t\t\tconsole.log('lms로 이동');\t\n");
      out.write("\t\t\tlocation.href=\"lms.bit\";\t\t\t\t\n");
      out.write("\t   }\n");
      out.write("\t});//lms접속버튼\n");
      out.write("\t\n");
      out.write("\t$('#formlogin').submit(function(){ //로그인버튼 눌렀을 때 이벤트.\n");
      out.write("\t\tvar emailVal = $(\"#emailid\").val();//id창에 입력된 값\n");
      out.write("\t\tvar regExp = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;//정규표현식 이메일\n");
      out.write("\t\tvar param = 'emailid='+$('#emailid').val()+'&pw='+$('#pw').val();//ajax로 보낼 파라미터 id, pw\n");
      out.write("\t\t\n");
      out.write("\t\tif($('#emailid').val()==\"\" || $('#pw').val()==\"\"){//아이디나 비번 입력안한경우.\n");
      out.write("\t\t\talert(\"아이디 혹은 비밀번호를 확인해주세요.\");\n");
      out.write("\t\t}else if(emailVal.match(regExp) == null){ //이메일 양식이 맞는지 클라이언트에서 먼저체크.\n");
      out.write("\t\t\talert(\"아이디는 이메일 형식입니다.\");\t\t\t\n");
      out.write("\t\t}else{\n");
      out.write("\t\t\t$.ajax('login.bit',{\n");
      out.write("\t\t\t\t'method':'post',\n");
      out.write("\t\t\t\t'data':param,\n");
      out.write("\t\t\t\t'success':function(data){\n");
      out.write(" \t\t\t\t\tif($(data).find('fail').text()=='fail'){\n");
      out.write("\t\t\t\t\tconsole.log('로그인실패')\n");
      out.write("\t\t\t\t\talert('아이디와 비밀번호를 확인해주세요');\n");
      out.write("\t\t\t\t\t//id pw를 서버에 보냈으나 회원정보와 일치하지 않음\n");
      out.write("\t\t\t\t\t\tlocation.replace('main.bit');\n");
      out.write("\t\t\t\t\t}else{\n");
      out.write("\t\t\t\t\t\tlocation.href='main.bit';//login성공\n");
      out.write("\t\t\t\t\t\t//비동기통신이므로 강제로 페이지 이동시켜주지않으면 로그인창이 '환영합니다'로 안바뀜 \n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t} //success\n");
      out.write("\t\t\t});//ajax\n");
      out.write("\t\t}//else\n");
      out.write("\t\treturn false;\n");
      out.write("\t});//submit\n");
      out.write("\t\n");
      out.write("\t//createaccount 회원가입 버튼\n");
      out.write("\t$('#createaccount').on('click',function(){\n");
      out.write("\t\tlocation.href='signupagree.bit'; //********개인정보동의 체크 페이지로 이동\n");
      out.write("\t});\n");
      out.write("});//document.Ready\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("     #header{\n");
      out.write("        height: 110px;\n");
      out.write("    }\n");
      out.write("    .logo{\n");
      out.write("        margin: 10px auto;로고위치 밑으로 내림\n");
      out.write("    }\n");
      out.write("    .logo>img{\n");
      out.write("        height : 87px;\n");
      out.write("        margin-left: 200px;\n");
      out.write("    }\n");
      out.write("    #menu{\n");
      out.write("        height: 70px;/*메뉴 크기*/\n");
      out.write("        border-top: 1px solid #e4e4e4;\n");
      out.write("        border-bottom: 1px solid #e4e4e4;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("    #menu>.grid6>ul{\n");
      out.write("        list-style: none;\n");
      out.write("        margin: 23px 30px;\n");
      out.write("    }\n");
      out.write("    #menu>.grid6>ul>li{\n");
      out.write("        text-align: center;\n");
      out.write("        float: left;\n");
      out.write("        width: 130px;\n");
      out.write("        padding: 0 40px;\n");
      out.write("    }\n");
      out.write("    #menu>.grid6>ul>li>a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: black;\n");
      out.write("        font-weight: bold;\n");
      out.write("    }\n");
      out.write("    #menu>.grid6>ul>li>a:hover{\n");
      out.write("        color:mediumblue;\n");
      out.write("    }\n");
      out.write("    #contents{/*내용+사이드바*/\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("    #content{\n");
      out.write("        border-left: 1px solid #e4e4e4;\n");
      out.write("        border-right: 1px solid #e4e4e4;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #lmsmenu{\n");
      out.write("        margin-top: 20px;\n");
      out.write("        margin-left: 45px;\n");
      out.write("        width: 200px;\n");
      out.write("        border:3px solid white;\n");
      out.write("/*        background-color: #F6F6F6;*/\n");
      out.write("    }\n");
      out.write("    .bigletter{\n");
      out.write("        font-size: 18px;\n");
      out.write("        font-weight: 600;\n");
      out.write("    }\n");
      out.write("    #lmsmenu>p{\n");
      out.write("        line-height: 30px;\n");
      out.write("        color: #505050;\n");
      out.write("        font-weight: 800;\n");
      out.write("        font-size: 21px;\n");
      out.write("        border-bottom: 1px solid #e4e4e4;\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("        padding-left: 40px; \n");
      out.write("    }\n");
      out.write("    #lmsmenu>ul{\n");
      out.write("        list-style: none;\n");
      out.write("        color: #505050;\n");
      out.write("    }\n");
      out.write("    #lmsmenu>ul>li{\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("        color: #505050;\n");
      out.write("        color: \n");
      out.write("    }\n");
      out.write("    #lmsmenu>ul>li>a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: #505050;\n");
      out.write("    }\n");
      out.write("    #lmsmenu>ul>li>a:hover{\n");
      out.write("        color:#000069;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    #signin{/*로그인창 텍스트 패딩*/\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 20px;\n");
      out.write("        font-weight: 600;\n");
      out.write("        padding-top: 50px;\n");
      out.write("        padding: 30px;\n");
      out.write("        border-bottom: 1px solid #e4e4e4;\n");
      out.write("    }\n");
      out.write("    #loginmsg{/*  로그인 했을 때 보이는 메세지. XX님환영합니다.  */\n");
      out.write("    \tfont-size:15px;\n");
      out.write("    \tmargin-top:30px;\n");
      out.write("    \tmargin-bottom:13px;\n");
      out.write("    \tfont-weight: 400;\n");
      out.write("    \twidth: 240px;\n");
      out.write("    \theight: 23px;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    #emailid, #pw{/*아이디,비밀번호*/\n");
      out.write("        width: 230px;\n");
      out.write("        height: 23px;\n");
      out.write("        margin: 7px;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        border: 1px solid #969696;\n");
      out.write("    }\n");
      out.write("    #login{/*로그인버튼*/\n");
      out.write("        background-color: #000069;\n");
      out.write("        border:1px solid #000069;\n");
      out.write("        color:white;\n");
      out.write("        margin: 7px;\n");
      out.write("        width: 235px;\n");
      out.write("        height: 35px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    #logout{/*로그아웃버튼*/\n");
      out.write("        background-color: #000069;\n");
      out.write("        border:1px solid #000069;\n");
      out.write("        color:white;\n");
      out.write("        margin: 7px;\n");
      out.write("        width: 235px;\n");
      out.write("        height: 35px;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    #login:hover{\n");
      out.write("        background-color: white;\n");
      out.write("        color: #000069;\n");
      out.write("    }\n");
      out.write("    #logout:hover{\n");
      out.write("        background-color: white;\n");
      out.write("        color: #000069;\n");
      out.write("    }\n");
      out.write("    #createaccount{/*회원가입버튼*/\n");
      out.write("        background-color: #1E3269;\n");
      out.write("        border: 1px solid #1E3269;\n");
      out.write("        color: white;\n");
      out.write("        margin: 5px;\n");
      out.write("        width: 235px;\n");
      out.write("        height: 35px;\n");
      out.write("    }\n");
      out.write("    #mypage{/*내정보버튼*/\n");
      out.write("        background-color: #1E3269;\n");
      out.write("        border: 1px solid #1E3269;\n");
      out.write("        color: white;\n");
      out.write("        margin: 5px;\n");
      out.write("        width: 235px;\n");
      out.write("        height: 35px;\n");
      out.write("    }\n");
      out.write("    #createaccount:hover{\n");
      out.write("        background-color: white;\n");
      out.write("        color: #1E3269;\n");
      out.write("    }\n");
      out.write("    #mypage:hover{\n");
      out.write("        background-color: white;\n");
      out.write("        color: #1E3269;\n");
      out.write("    }\n");
      out.write("    .gotolms{/*LMS이동버튼*/\n");
      out.write("        background-color: #E56D29;\n");
      out.write("        border: 1px solid #E56D29;\n");
      out.write("        color:white;\n");
      out.write("        margin: 5px;\n");
      out.write("        width: 235px;\n");
      out.write("        height: 35px;\n");
      out.write("    }\n");
      out.write("    .gotolms:hover{\n");
      out.write("        background-color: white;\n");
      out.write("        color: #E56D29;\n");
      out.write("    }\n");
      out.write("    #campus{\n");
      out.write("        padding: 15px 60px;\n");
      out.write("        border-bottom: 1px solid #e4e4e4;\n");
      out.write("    }\n");
      out.write("    #campustitle{\n");
      out.write("        padding-left: 10px;\n");
      out.write("    }\n");
      out.write("    #campusinfo>tbody>tr>td{\n");
      out.write("        text-align: right;\n");
      out.write("    }\n");
      out.write("    #open{\n");
      out.write("        font-size: 11px;\n");
      out.write("        text-align: right;\n");
      out.write("    }\n");
      out.write("    #signin>p{\n");
      out.write("        margin: 0px 10px;\n");
      out.write("        text-align: right;\n");
      out.write("    }\n");
      out.write("    #signin>p>a{\n");
      out.write("        font-size: 13px;\n");
      out.write("        text-align: right;\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: #646464;\n");
      out.write("    }\n");
      out.write("    #signin>p>a:hover{\n");
      out.write("        color: black;\n");
      out.write("    }\n");
      out.write("    #footer{\n");
      out.write("        width: 100%;\n");
      out.write("        height: 180px;\n");
      out.write("        background-color: #e4e4e4;\n");
      out.write("        bottom:0px;\n");
      out.write("    }\n");
      out.write("    #footercon{/*푸터사진+내용*/\n");
      out.write("        width: 880px;\n");
      out.write("        margin: 20px 380px;\n");
      out.write("    }\n");
      out.write("    #footer>#footercon>img{\n");
      out.write("        float: left;\n");
      out.write("        width: 170px;\n");
      out.write("        margin-left: 50px;\n");
      out.write("    }\n");
      out.write("    #footer>#footercon>p{\n");
      out.write("        float: right;\n");
      out.write("        width: 630px;\n");
      out.write("        color:#787878;\n");
      out.write("        font-size: 15px;\n");
      out.write("    }\n");
      out.write("</style>");
      out.write("\n");
      out.write("<title>BITCAMP JEJU: LMS강사</title>\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("#lecname{\n");
      out.write("\tcolor: #787878;\n");
      out.write("\tfont-size:14px;\n");
      out.write("\tfont-weight:bold;\n");
      out.write("\tline-height:15px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"containerw\">\n");
      out.write("   <div id=\"header\">\n");
      out.write("       <div class=\"grid4\"><div class=\"logo\">&nbsp;</div></div>\n");
      out.write("       <div class=\"grid4 logo\">\n");
      out.write("          <img src=\"img/lmslogo.png\"/> \n");
      out.write("       </div>\n");
      out.write("       <div class=\"grid4\">&nbsp;</div>\n");
      out.write("    </div><!--header-->  ");
      out.write('\n');
      out.write("\n");
      out.write("   <div id=\"menu\">   \n");
      out.write("        <div class=\"grid3\">&nbsp;</div>\n");
      out.write("        <div class=\"grid6\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\">비트캠프</a></li>\n");
      out.write("                <li><a href=\"#\">교육과정</a></li>\n");
      out.write("                <li><a href=\"#\">취업지원</a></li>\n");
      out.write("                <li><a href=\"#\">고객센터</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"grid3\">&nbsp;</div>\n");
      out.write("   </div><!--menu-->\n");
      out.write("\n");
      out.write("   <div id=\"contents\">\n");
      out.write("   <!--*****************lms메뉴******************-->\n");
      out.write("       <div class=\"grid2\">\n");
      out.write("        <div id=\"lmsmenu\">\n");
      out.write("             <p>강사<br><span id=\"lecname\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.lecture }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></p>\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"bigletter\">출결관리</li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"lmsteacherattendance.bit\">출석체크</a>    \n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"lmsteacherattlist.bit\">출석조회</a>    \n");
      out.write("                </li>\n");
      out.write("                <li class=\"bigletter\">수강생관리</li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"lmsteacherstulist.bit\">수강생정보</a>    \n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"lmsteacherstugrade.bit\">성적입력</a>    \n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" class=\"bigletter\">자료실</a>    \n");
      out.write("                </li>\n");
      out.write("                <li></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("        <!--*****************lms메뉴******************-->\n");
      out.write("       <div  id=\"content\" class=\"grid6\">\n");
      out.write("       <!--*************content start****************-->\n");
      out.write("       <img src=\"img/capture.PNG\">\n");
      out.write("       <!--*************content end******************-->\n");
      out.write("\n");
      out.write("       </div>\n");
      out.write("       <div class=\"grid2 sidebar\">\n");
      out.write("       <div id=\"signin\">\n");
      out.write("     \n");
      out.write("     ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("       </div><!--signin-->\n");
      out.write("       <div id=\"campus\">\n");
      out.write("        <p id=\"campustitle\">\n");
      out.write("\t        <strong>비트캠프</strong> 대표문의\n");
      out.write("        </p>\n");
      out.write("        <table id=\"campusinfo\">\n");
      out.write("            <tr>\n");
      out.write("                <th>서초본원</th>\n");
      out.write("                <td>02.3486.9600</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>강남센터</th>\n");
      out.write("                <td>02.3453.5404</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>신촌센터</th>\n");
      out.write("                <td>02.707.1480</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>종로센터</th>\n");
      out.write("                <td>02.722.1481</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"2\" id=\"open\">\n");
      out.write("                   <br>\n");
      out.write("                    <Strong>평일</Strong> AM 09:00 - PM 21:00<br/>\n");
      out.write("                    <Strong>토/일/공휴일</Strong> AM 10:00 - PM 18:00\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("       </div><!--campus-->\n");
      out.write("       </div><!--sidebar-->\n");
      out.write("       <div class=\"grid2\">&nbsp;</div>\n");
      out.write("   </div><!--contents-->\n");
      out.write("   <div id=\"footer\" class=\"grid12\">\n");
      out.write("        <div id=\"footercon\">\n");
      out.write("           <img src=\"img/logo.png\"/>\n");
      out.write("           <p>\n");
      out.write("            비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)｜ 사업자등록번호 : 214-85-24928\n");
      out.write("            (주)비트컴퓨터 서초본원 대표이사 : 조현정 / 문의 : 02-3486-9600 / 팩스 : 02-6007-1245<br>\n");
      out.write("            통신판매업 신고번호 : 제 서초-00098호 / 개인정보보호관리책임자 : 최종진<br>\n");
      out.write("            Copyright &copy; 비트캠프 All rights reserved.\n");
      out.write("           </p>\n");
      out.write("        </div><!--footercon-->\n");
      out.write("   </div><!--footer-->\n");
      out.write("</div><!--containerW-->");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    \t ");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("\t    ");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("  \t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /template/footer.jspf(7,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty login}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("     \n");
          out.write("\t       <form id=\"formlogin\" action=\"login.bit\" method=\"post\">\n");
          out.write("\t           <span>비트캠프 로그인</span>\n");
          out.write("\t           <input type=\"text\" id=\"emailid\" name=\"emailid\" placeholder=\" 아이디\">\n");
          out.write("\t           <input type=\"password\" placeholder=\" 비밀번호\" id=\"pw\" name=\"pw\">\n");
          out.write("\t           <button id=\"login\" type=\"submit\">로그인</button>\n");
          out.write("\t           <button id=\"createaccount\" type=\"button\">회원가입</button>\n");
          out.write("\t           <button class=\"gotolms\" type=\"button\">LMS system</button>\n");
          out.write("\t \t  </form>\n");
          out.write("\t \t   <p><a href=\"#\">아이디/비밀번호 찾기</a></p>\n");
          out.write("  \t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /template/footer.jspf(19,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty login}", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("\t       <form id=\"formlogout\"  action=\"logout.bit\" method=\"post\">\n");
          out.write("\t           <span>비트캠프 로그인</span>\n");
          out.write("\t         \t<br/><br/>\n");
          out.write("\t           <label>&nbsp;</label>\t\t\t\t\t           \n");
          out.write("\t           <label id=\"loginmsg\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${login.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("님 환영합니다♡</label>\n");
          out.write("\t           <label>&nbsp;</label>\t\t\t\t\t           \n");
          out.write("\t         \t<br/><br/>\n");
          out.write("\t           <button id=\"logout\" type=\"submit\">로그아웃</button>\n");
          out.write("\t           <button id=\"mypage\" type=\"button\">내정보</button>\n");
          out.write("\t           <button class=\"gotolms\" type=\"button\">LMS system</button>\n");
          out.write("\t \t  </form>\n");
          out.write("\t    \t\n");
          out.write("\t    \n");
          out.write("  \t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }
}
