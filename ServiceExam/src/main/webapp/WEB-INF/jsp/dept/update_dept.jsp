<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Dept</title>
	<script type="text/javascript">
		function fn_save() {
			document.detailForm.action = "<c:out value="/dept/edit.do"/>";
            document.detailForm.submit();
		}
		function fn_delete(){
			document.detailForm.action = "<c:out value="/dept/delete.do"/>";
            document.detailForm.submit();
		}
	</script>
</head>
<body>

<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
	<form id="detailForm" name="detailForm" method="post">
		<input type="hidden" name="dno" value="${deptVO.dno}" />
		<div class="mb-3">
		  <label for="dname" class="form-label">dname</label>
		  <input type="text" 
		         class="form-control" 
		         id="dname" 
		         name="dname"
		         value="${deptVO.dname}"
		         placeholder="부서명">
		</div>
		
		<div class="mb-3">
		  <label for="loc" class="form-label">loc</label>
		  <input type="text" 
		         class="form-control" 
		         id="loc" 
		         name="loc"
		         value="${deptVO.loc}"
		         placeholder="부서위치">
		</div>
		
		<div class="mb-3">
			<button type="button" 
			        class="btn btn-warning"
			        onclick="fn_save()"
			>
			   수정
			</button>
			<button type="button" 
			        class="btn btn-danger"
			        onclick="fn_delete()"
			>
			   삭제
			</button>
		</div>
	</form>

</div>
<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>



