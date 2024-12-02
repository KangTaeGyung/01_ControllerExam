<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!--    bootstrap css cdn -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <%--    main.css import --%>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">
            <img src="/images/simple-coding.png" width="20" height="20"/>
            Simple
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Dept(부서)
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/basic/dept">Dept</a></li>
                        <li><a class="dropdown-item" href="/basic/dept/addition">Add Dept</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Emp(사원)
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/basic/emp">Emp</a></li>
                        <li><a class="dropdown-item" href="/basic/emp/addition">Add Emp</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Faq(종합문제)
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/basic/faq">Faq</a></li>
                        <li><a class="dropdown-item" href="/basic/faq/addition">Add Faq</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        FileDb
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/advanced/fileDb">FileDb</a></li>
                        <li><a class="dropdown-item" href="/advanced/fileDb/addition">Add FileDb</a></li>
                    </ul>
                </li>

                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Gallery
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="/advanced/gallery">Gallery</a></li>
                        <li><a class="dropdown-item" href="/advanced/gallery/addition">Add Gallery</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
