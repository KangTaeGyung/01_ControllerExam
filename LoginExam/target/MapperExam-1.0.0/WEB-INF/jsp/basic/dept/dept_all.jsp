<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<html>
<head>
	<title>Dept</title>
	<script type="text/javascript" defer="defer">
		function fn_egov_link_page(pageNo) {
			document.listForm.pageIndex.value = pageNo; 
			document.listForm.action = "<c:out value="/basic/dept.do" />";
			document.listForm.submit();
		}
		function fn_egov_selectList() {
			document.listForm.pageIndex.value = 1;
			document.listForm.action = "<c:out value="/basic/dept.do" />";
			document.listForm.submit();
		}
		function fn_select(dno) {
			document.listForm.dno.value = dno;
			document.listForm.action = "<c:out value="/basic/dept/edition.do" />";
			document.listForm.submit();
		}
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<div class="container">
	<form id="listForm" name="listForm" method="get">
	    <input type="hidden" name="dno">
	    
		<div class="input-group mb-3 mt-3">
		  <input type="text" 
		         class="form-control" 
		         id="searchKeyword"
		         name="searchKeyword"
		         placeholder="부서명입력"
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
		      <th scope="col">dno</th>
		      <th scope="col">dname</th>
		      <th scope="col">loc</th>
		    </tr>
		  </thead>
		  <tbody>
		   <c:forEach var="data" items="${depts}">
	 		    <tr>
			      <td>
			      	<a href="javascript:fn_select('<c:out value="${data.dno}" />')">
			      		<c:out value="${data.dno}" />
			      	</a>
			      </td>
			      <td><c:out value="${data.dname}" /></td>
			      <td><c:out value="${data.loc}" /></td>
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



