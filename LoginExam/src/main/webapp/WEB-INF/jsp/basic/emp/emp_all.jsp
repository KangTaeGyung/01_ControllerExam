<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript" defer="defer">
		function fn_egov_link_page(pageNo) {
			document.listForm.pageIndex.value = pageNo; 
			document.listForm.action = "<c:out value="/basic/emp.do" />";
			document.listForm.submit();
		}
		function fn_egov_selectList() {
			document.listForm.pageIndex.value = 1;
			document.listForm.action = "<c:out value="/basic/emp.do" />";
			document.listForm.submit();
		}
		function fn_select(eno) {
			document.listForm.eno.value = eno;
			document.listForm.action = "<c:out value="/basic/emp/edition.do" />";
			document.listForm.submit();
		}
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
		<form id="listForm" name="listForm" method="get">
		<input type="hidden" name="eno">
		<div class="input-group mb-3 mt-3">
		  <input type="text" 
		         class="form-control" 
		         id="searchKeyword"
		         name="searchKeyword"
		         placeholder="사원명입력"
		  >
		  <button class="btn btn-primary" 
		          type="button" 
		          onclick="fn_egov_selectList()"
		  >
		          검색
		  </button>
		</div>
	
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">eno</th>
		      <th scope="col">ename</th>
		      <th scope="col">job</th>
		      <th scope="col">manager</th>
		      <th scope="col">hiredate</th>
		      <th scope="col">salary</th>
		      <th scope="col">commission</th>
		      <th scope="col">dno</th>
		    </tr>
		  </thead>
		  <tbody>
		   <c:forEach var="data" items="${emps}">
	 		    <tr>
			      <td>
			      <a href="javascript:fn_select('<c:out value="${data.eno}" />')">
			      	<c:out value="${data.eno}" />
			      </a>
			      	
			      </td>
			      <td><c:out value="${data.ename}" /></td>
			      <td><c:out value="${data.job}" /></td>
			      <td><c:out value="${data.manager}" /></td>
			      <td><c:out value="${data.hiredate}" /></td>
			      <td><c:out value="${data.salary}" /></td>
			      <td><c:out value="${data.commission}" /></td>
			      <td><c:out value="${data.dno}" /></td>
			    </tr>
		   </c:forEach>
		  </tbody>
		</table>
		
		<div id="paging" class="text-center">
			<ui:pagination paginationInfo="${paginationInfo}" type="image"
				jsFunction="fn_egov_link_page" />
			<input type="hidden" id="pageIndex" name="pageIndex" />
		</div>
	</form>
	
</div>

<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>
