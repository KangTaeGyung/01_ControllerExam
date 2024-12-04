<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<html>
<head>
<title>Title</title>
<script type="text/javascript" defer="defer">
//    검색 버튼 클릭시 실행 함수
	function fn_egov_selectList() {
		document.listForm.pageIndex.value = 1;
		document.listForm.action = "<c:out value="/advanced/fileDb.do" />";
		document.listForm.submit();
	}
//		페이지 번호 클릭시 실행될 함수
	function fn_egov_link_page(pageNo) {
//			1) 새로운 페이지번호를 받기 : 0 -> 1,2(클릭), pageNo(클릭한 번호)
		document.listForm.pageIndex.value = pageNo; // 컨트롤러로 전송됨
		document.listForm.action = "<c:out value="/advanced/fileDb.do" />";
		document.listForm.submit();
	}
	// 삭제 버튼 클릭시 실행 함수 : uuid(기본키)
	function fn_delete(id) {
		document.listForm.uuid.value = id; // jsp -> java 전송(uuid)
		// get -> post 변경
		document.listForm.method="post";
		document.listForm.action = "<c:out value="/advanced/fileDb/delete.do" />";
		document.listForm.submit();
	}
</script>
</head>
<body>
	<%--    머리말 --%>
	<jsp:include page="/common/header.jsp" />
	<%--    본문--%>
	<div class="container">
		<form id="listForm" name="listForm" method="get">
<!-- 			uuid 전송용 -->
			<input type="hidden" name="uuid" >
			<!-- 		검색어 입력양식 -->
			<div class="input-group mb-3 mt-3">
				<input type="text" class="form-control" 
				    id="searchKeyword"
					name="searchKeyword" 
					placeholder="검색어입력">
				<button class="btn btn-primary" 
				        type="button"
				        onclick="fn_egov_selectList();"
				>
				  검색
				</button>
			</div>
			
<!-- 			부트스트랩 1행 -->
			<div class="row">
<!-- 			   부트스트랩 1열:3칸 => TODO: 열 반복 -->
               <c:forEach var="data" items="${fileDBs}">
				   <div class="col-3">
				   		<%--        TODO: 카트  --%>
						<div class="card" style="width: 18rem;">
							<img src="<c:out value="${data.fileUrl}" />" class="card-img-top"
								alt="이미지">
							<div class="card-body">
								<h5 class="card-title"><c:out value="${data.fileTitle}" /></h5>
								<p class="card-text"><c:out value="${data.fileContent}" /></p>
								<a href="#" class="btn btn-danger" onclick="fn_delete('${data.uuid}')">삭제</a>
							</div>
						</div>
				   </div>
			   </c:forEach>
			</div>
			<!-- 	페이징 번호 : 전자정부프레임워크 페이지소스 :
		       (참고) https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:rte:ptl:view:paginationtag 
		 -->
			<div id="paging" class="text-center">
				<ui:pagination paginationInfo="${paginationInfo}" type="image"
					jsFunction="fn_egov_link_page" />
				<input type="hidden" id="pageIndex" name="pageIndex" />
			</div>
			<%--    꼬리말--%>
		</form>
	</div>

	<jsp:include page="/common/footer.jsp" />

</body>
</html>
