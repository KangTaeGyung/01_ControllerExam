<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" defer="defer">
//     	저장 버튼 클릭시 실행할 함수
		function fn_save() {
            document.addForm.action = "<c:out value="/advanced/fileDb/add.do" />";
            document.addForm.submit();
		}
    </script>
</head>
<body>
<%--    머리말--%>
<jsp:include page="/common/header.jsp"/>
<%--    TODO: 파일업로드 : form 태그 : enctype="multipart/form-data" 추가 --%>
<div class="container">
	<form id="addForm" 
	      name="addForm" 
	      method="post"
	      enctype="multipart/form-data"
	      >
        <div class="mb-3">
            <%--            제목 입력양식 --%>
            <label for="fileTitle" class="form-label">fileTitle</label>
            <input  
            		class="form-control"
            		id="fileTitle"
            		name="fileTitle"
            		placeholder="제목" />
        </div>
        <div class="mb-3">
            <%--            내용 입력양식 --%>
            <label for="fileContent" class="form-label">fileContent</label>
            <input 
                   class="form-control"
                   id="fileContent"
                   name="fileContent"
                   placeholder="내용입력" />
        </div>
		<div class="input-group">
		  <input type="file" 
		         class="form-control" 
		         id="image"
		         name="image"
		         >
		  <button class="btn btn-primary" 
		          type="button"
		          onclick="fn_save()"
		          >저장</button>
		</div>
    </form>
</div>
<%--    꼬리말--%>
<jsp:include page="/common/footer.jsp"/>
</body>
</html>
