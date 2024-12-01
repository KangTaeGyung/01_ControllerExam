<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Dept</title>
	<script type="text/javascript" defer="defer">
		function fn_addView() {
			document.listForm.action="/dept/addition.do";
            document.listForm.submit();
        }
	    function fn_select(dno) {
			document.listForm.dno.value = dno;
			document.listForm.action="/dept/edition.do";
	        document.listForm.submit();
	    }
	</script>
</head>
<body>
<jsp:include page="/common/header.jsp"></jsp:include>
<form id="listForm" name="listForm" method="get" >
    <input type="hidden" name="dno" />
    
	<div class="container">
		<h2>전체 조회</h2>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">dno</th>
		      <th scope="col">dname</th>
		      <th scope="col">loc</th>
		    </tr>
		  </thead>
		  <tbody>
			<c:forEach var="data" items="${list}">
		    <tr>
		      <td>
				<a href="javascript:fn_select('<c:out value="${data.dno}"/>')">
				   <c:out value="${data.dno}"/>
				</a>
		      </td>
		      <td><c:out value="${data.dname}"/></td>
		      <td><c:out value="${data.loc}"/></td>
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



