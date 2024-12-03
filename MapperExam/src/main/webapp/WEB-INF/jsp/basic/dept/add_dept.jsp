<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" defer="defer">
		function fn_save() {
            document.addForm.action = "<c:out value="/basic/dept/add.do" />";
            document.addForm.submit();
		}
    </script>
</head>
<body>
<jsp:include page="/common/header.jsp"/>
<div class="container">
	<form:form modelAttribute="deptVO" id="addForm" name="addForm" method="post">
        <div class="mb-3">
            <label for="dname" class="form-label">dname</label>
            <input  
            		class="form-control"
            		id="dname"
            		name="dname"
            		placeholder="dname" />
             &nbsp;<form:errors path="dname" />
        </div>
        <div class="mb-3">
            <label for="loc" class="form-label">loc</label>
            <input 
                   class="form-control"
                   id="loc"
                   name="loc"
                   placeholder="loc" />
             &nbsp;<form:errors path="loc" />
        </div>
        <div class="mb-3">
            <button class="btn btn-primary" onclick="fn_save()">저장</button>
        </div>
    </form:form>
</div>
<jsp:include page="/common/footer.jsp"/>
</body>
</html>
