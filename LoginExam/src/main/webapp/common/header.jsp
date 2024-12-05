<%--
  Created by IntelliJ IDEA.
  User: GGG
  Date: 2024-03-13
  Time: 오후 5:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <!--    bootstrap css cdn -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <%--    main.css import --%>
    <link href="/css/main.css" rel="stylesheet">
    <%-- 전자 정부 프레임워크 --%>
<!--     <link type="text/css" rel="stylesheet" href="/css/egovframework/sample.css"/> -->
</head>
<body>
<%-- 부트스트랩 메뉴 --%>
<%-- 찾기 : ctrl + f --%>
<%-- 찾기/바꾸기 : ctrl + r --%>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <%--     1번째 메뉴 : Navbar -> Simple   --%>
        <a class="navbar-brand" href="/">
            <%--     TODO: 이미지 넣기 --%>
            <img src="/images/simple-coding.png" width="20" height="20"/>
            simple-coding
        </a>
        <%-- 부트스트랩 메뉴 : 화면이 작아지면 단축메뉴로 바뀜 : 아래 태그 --%>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <%--  메뉴 시작  --%>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <%--            부서  #1 --%>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Dept(부서)
                    </a>
                    <%--                   소메뉴 --%>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/basic/dept.do">Dept</a></li>
                        <li><a class="dropdown-item" href="/basic/dept/addition.do">Add Dept</a></li>
                    </ul>
                </li>

                <%--            Emp(사원) #2 --%>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Emp(사원)
                    </a>
                    <%--                   소메뉴 --%>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/basic/emp.do">Emp</a></li>
                        <li><a class="dropdown-item" href="/basic/emp/addition.do">Add Emp</a></li>
                    </ul>
                </li>

                <%--            Faq #3 --%>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Faq(종합문제)
                    </a>
                    <%--                   소메뉴 --%>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/basic/faq.do">Faq</a></li>
                        <li><a class="dropdown-item" href="/basic/faq/addition.do">Add Faq</a></li>
                    </ul>
                </li>

                <%--            FileDb #4 --%>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        FileDb
                    </a>
                    <%--                   소메뉴 --%>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/advanced/fileDb.do">FileDb</a></li>
                        <li><a class="dropdown-item" href="/advanced/fileDb/addition.do">Add FileDb</a></li>
                    </ul>
                </li>

                <%--            Gallery #5 --%>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Gallery
                    </a>
                    <%--                   소메뉴 --%>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/advanced/gallery.do">Gallery</a></li>
                        <li><a class="dropdown-item" href="/advanced/gallery/addition.do">Add Gallery</a></li>
                    </ul>
                </li>
            </ul>
            
          <!-- 메뉴(오른쪽) -->
          <ul class="navbar-nav">
            <!-- {/* 로그인 시작 */} -->
            <li class="nav-item">
              <a class="nav-link active" href="/register.do"> 회원가입 </a>
            </li>
            <c:if test="${sessionScope.memberVO == null}">
	            <li class="nav-item">
	              <a class="nav-link active" href="/login.do"> 로그인 </a>
	            </li>
            </c:if>
            <!-- {/* 로그인 끝 */} -->

            <!-- {/* 로그아웃 시작 */} -->
            <c:if test="${sessionScope.memberVO != null}">
	            <li class="nav-item">
	              <a href="/logout.do" class="nav-link active"> 로그아웃
	              </a>
	            </li>
            </c:if>
            <!-- {/* 로그아웃 끝 */} -->
          </ul>
        
        </div>
    </div>
</nav>
</body>
</html>
