<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Basic Sample</title>
	<script type="text/javascript" defer="defer">
		function fn_back() {
			history.back(); // 이전 페이지 이동
		}
	</script>
</head>

<body>
	<jsp:include page="/common/header.jsp" />
	<div class="container mt-3">
		<div class="text-bg-danger p-3">
			<c:out value="${errors}"></c:out>
		</div>
		<button type="button" class="btn btn-success mt-3"
			onclick="fn_back()"
		>이전</button>
	</div>
	<jsp:include page="/common/footer.jsp" />
</body>
</html>