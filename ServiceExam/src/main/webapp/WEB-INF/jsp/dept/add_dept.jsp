<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Dept</title>
	<script type="text/javascript" defer="defer">
		function fn_save() {
			document.addForm.action = "<c:out value="/dept/add.do"/>";
			document.addForm.submit();
		}
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
	<form id="addForm" name="addForm" method="post">
		<div class="mb-3">
		  <label for="dname" class="form-label">dname</label>
		  <input type="text" 
		         class="form-control" 
		         id="dname" 
		         name="dname"
		         placeholder="부서명">
		</div>
		
		<div class="mb-3">
		  <label for="loc" class="form-label">loc</label>
		  <input type="text" 
		         class="form-control" 
		         id="loc" 
		         name="loc"
		         placeholder="부서위치">
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



