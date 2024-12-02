<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" defer="defer">
    	function fn_save() {
			document.detailForm.action = "<c:out value="/basic/dept/edit.do" />";
			document.detailForm.submit();
		}
		function fn_delete() {
			document.detailForm.action = "<c:out value="/basic/dept/delete.do" />";
			document.detailForm.submit();
		}
    </script>
</head>
<body>
<jsp:include page="/common/header.jsp"/>
<div class="container">
    <form id="detailForm" name="detailForm" method="post">
    	<input type="hidden" name="dno" value="<c:out value="${deptVO.dno}" />">
        <div class="mb-3">
            <label for="dname" class="form-label">dname</label>
            <input 
                   class="form-control"
                   id="dname"
                   name="dname"
                   value="<c:out value="${deptVO.dname}" />"
                   placeholder="제목입력" />
        </div>
        <div class="mb-3">
            <label for="loc" class="form-label">loc</label>
            <input 
                   class="form-control"
                   id="loc"
                   name="loc"
                   value="<c:out value="${deptVO.loc}" />"
                   placeholder="내용입력" />
        </div>
        <div class="mb-3">
            <button class="btn btn-warning" onclick="fn_save()">수정</button>
                        
            <button class="btn btn-danger" onclick="fn_delete()">삭제</button>
        </div>
    </form>
</div>
<jsp:include page="/common/footer.jsp"/>
</body>
</html>
