<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>회원 가입 </title>
</head>
<body>
<%--    머리말--%>
<jsp:include page="/common/header.jsp" />
	<div class="row justify-content-center">
		<div class="col-xl-10 col-lg-12 col-md-9">
			<div class="card mt-5">
				<div class="card-body p-0">
					<!-- Nested Row within Card Body -->
					<div class="row">
						<div class="col-lg-5">
							<img
								src="${pageContext.request.contextPath}/images/puppy-1920_1280.jpg"
								class="img-fluid">
						</div>
						<div class="col-lg-7">
							<div class="p-5">
								<div class="text-center">
									<h1 class="h4 text-gray-900 mb-4">회원 가입</h1>
								</div>
								<form class="user"
										action="${pageContext.request.contextPath}/register/addition.do"
										method="post"
								>
									<div class="form-group">
										<input type="email"
											class="form-control form-control-user mb-3"
											placeholder="이메일 입력" name="email" />
									</div>
									<div class="form-group row">
										<div class="col-sm-6 mb-3 mb-sm-0">
											<input type="password"
												class="form-control form-control-user mb-3"
												placeholder="패스워드 입력" name="password" />
										</div>
										<div class="col-sm-6">
											<input type="password"
												class="form-control form-control-user mb-3"
												id="exampleRepeatPassword" placeholder="Repeat Password"
												name="repassword" />
										</div>
										<div class="form-group">
											<input type="text"
												class="form-control form-control-user mb-3"
												placeholder="이름 입력" name="name" />
										</div>
									</div>
									<button type="submit"
										class="btn btn-primary btn-user w-100 mb-3">
										Register Account</button>
								</form>
								<hr />
								<div class="text-center">
									<a href="/login.do"> Already have an account? Login! </a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
<%--    꼬리말--%>
<jsp:include page="/common/footer.jsp" />
</body>
</html>