<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- bootstrap 5.2 css cdn  -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<div class="container mt-3">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">eno</th>
					<th scope="col">ename</th>
					<th scope="col">job</th>
					<th scope="col">hiredate</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<!-- jsp 반복문 -->
					<c:forEach var="data" items="${list}">
						<td>${data}</td>
					</c:forEach>
				</tr>
			</tbody>
		</table>
	</div>

</body>
</html>