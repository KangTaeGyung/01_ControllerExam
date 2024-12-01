<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Dept</title>
	<script type="text/javascript" defer="defer">
		function fn_addView() {
			document.listForm.action="/member/addition.do";
            document.listForm.submit();
        }
	    function fn_select(eno) {
			document.listForm.eno.value = eno;
			document.listForm.action="/member/edition.do";
	        document.listForm.submit();
	    }
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<form id="listForm" name="listForm" method="get">
    <input type="hidden" name="eno" />
    
	<div class="container">
		<h2>전체 조회</h2>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">eno</th>
		      <th scope="col">ename</th>
		      <th scope="col">job</th>
		      <th scope="col">manager</th>
		    </tr>
		  </thead>
		  <tbody>
			<c:forEach var="data" items="${list}">
		    <tr>
		    
		      <td>
		      	<a href="javascript:fn_select('<c:out value="${data.eno}"/>')">
				   <c:out value="${data.eno}"/>
				</a>
		      </td>

		      <td><c:out value="${data.ename}"/></td>
		      <td><c:out value="${data.job}"/></td>
		      <td><c:out value="${data.manager}"/></td>
		    </tr>
			</c:forEach>
		  </tbody>
		</table>

		<div class="text-center">
			<a href="javascript:fn_addView()" class="btn btn-primary">추가</a> 
		</div>
	</div>
</form>

<jsp:include page="/common/footer.jsp"></jsp:include>
</body>
</html>
