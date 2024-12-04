<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" defer="defer">
    	function fn_save() {
			document.detailForm.action = "<c:out value="/basic/emp/edit.do" />";
			document.detailForm.submit();
		}
		function fn_delete() {
			document.detailForm.action = "<c:out value="/basic/emp/delete.do" />";
			document.detailForm.submit();
		}
    </script>
</head>
<body>
<jsp:include page="/common/header.jsp"/>
<div class="container">
    <form id="detailForm" name="detailForm" method="post">
    	<input type="hidden" name="eno" value="<c:out value="${empVO.eno}" />">
        <div class="mb-3">
            <label for="ename" class="form-label">ename</label>
            <input 
                   class="form-control"
                   id="ename"
                   name="ename"
                   value="<c:out value="${empVO.ename}" />"
                   placeholder="제목입력" />
        </div>
        <div class="mb-3">
            <label for="job" class="form-label">job</label>
            <input 
                   class="form-control"
                   id="job"
                   name="job"
                   value="<c:out value="${empVO.job}" />"
                   placeholder="내용입력" />
        </div>
        <div class="mb-3">
            <label for="manager" class="form-label">manager</label>
            <input 
                   class="form-control"
                   id="manager"
                   name="manager"
                   value="<c:out value="${empVO.manager}" />"
                   placeholder="제목입력" />
        </div>
        <div class="mb-3">
            <label for="hiredate" class="form-label">hiredate</label>
            <input 
                   class="form-control"
                   id="hiredate"
                   name="hiredate"         
                   value="<c:out value="${empVO.hiredate}" />"          
                   placeholder="내용입력" />
        </div>
        <div class="mb-3">
            <label for="salary" class="form-label">salary</label>
            <input 
                   class="form-control"
                   id="salary"
                   name="salary"
                   value="<c:out value="${empVO.salary}" />" 
                   placeholder="제목입력" />
        </div>
        <div class="mb-3">
            <label for="commission" class="form-label">commission</label>
            <input 
                   class="form-control"
                   id="commission"
                   name="commission"
                   value="<c:out value="${empVO.commission}" />" 
                   placeholder="내용입력" />
        </div>
        <div class="mb-3">
            <label for="dno" class="form-label">dno</label>
            <input 
                   class="form-control"
                   id="dno"
                   name="dno"
                   value="<c:out value="${empVO.dno}" />"
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
