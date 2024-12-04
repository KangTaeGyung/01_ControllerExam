<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" defer="defer">
		function fn_save() {
            document.addForm.action = "<c:out value="/basic/emp/add.do" />";
            document.addForm.submit();
		}
    </script>
</head>
<body>
<jsp:include page="/common/header.jsp"/>
<div class="container">
	<form:form modelAttribute="empVO" id="addForm" name="addForm" method="post">
        <div class="mb-3">
            <label for="ename" class="form-label">ename</label>
            <input  
            		class="form-control"
            		id="ename"
            		name="ename"
            		placeholder="ename" />
            		&nbsp;<form:errors path="ename" />
        </div>
        <div class="mb-3">
            <label for="job" class="form-label">job</label>
            <input 
                    class="form-control"
                    id="job"
            		name="job"
                   placeholder="job" />
                   &nbsp;<form:errors path="job" />
        </div>
        <div class="mb-3">
            <label for="manager" class="form-label">manager</label>
            <input 
                    class="form-control"
                    id="manager"
            		name="manager"
            		value="0"
                   placeholder="manager" />
                   &nbsp;<form:errors path="manager" />
        </div>
        <div class="mb-3">
            <label for="hiredate" class="form-label">hiredate</label>
            <input 
                    class="form-control"
                    id="hiredate"
                    name="hiredate"
                   placeholder="hiredate" />
                   &nbsp;<form:errors path="hiredate" />
        </div>
        <div class="mb-3">
            <label for="salary" class="form-label">salary</label>
            <input 
                    class="form-control"
                    id="salary"
                    name="salary"
                    value="0"
                   placeholder="salary" />
                   &nbsp;<form:errors path="salary" />
        </div>
        <div class="mb-3">
            <label for="commission" class="form-label">commission</label>
            <input 
                    class="form-control"
                    id="commission"
                    name="commission"
                    value="0"
                   placeholder="commission" />
                   &nbsp;<form:errors path="commission" />
        </div>
        <div class="mb-3">
            <label for="dno" class="form-label">dno</label>
            <input 
                    class="form-control"
                    id="dno"
                    name="dno"
                    value="0"
                   placeholder="dno" />
                   &nbsp;<form:errors path="dno" />
        </div>
        <div class="mb-3">
            <button class="btn btn-primary" onclick="fn_save()">저장</button>
        </div>
    </form:form>
</div>
<jsp:include page="/common/footer.jsp"/>
</body>
</html>
