<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Member</title>
	<script type="text/javascript" defer="defer">
		function fn_save() {
			document.addForm.action = "/member/add.do";
			document.addForm.submit();
		}
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
	<form id="addForm" name="addForm" method="post">
		<div class="mb-3">
		  <label for="ename" class="form-label">ename</label>
		  <input type="text" 
		         class="form-control" 
		         id="ename" 
		         name="ename"
		         placeholder="사원명">
		</div>
		
		<div class="mb-3">
		  <label for="job" class="form-label">job</label>
		  <input type="text" 
		         class="form-control" 
		         id="job" 
		         name="job"
		         placeholder="직위">
		</div>
		
		<div class="mb-3">
		  <label for="manager" class="form-label">manager</label>
		  <input type="text" 
		         class="form-control" 
		         id="manager" 
		         name="manager"
		         placeholder="관리자">
		</div>
				
		<div class="mb-3">
			<button type="button" 
			        class="btn btn-primary"
			        onclick="fn_save()"
			>저장</button>
		</div>
	</form>
</div>
<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>
