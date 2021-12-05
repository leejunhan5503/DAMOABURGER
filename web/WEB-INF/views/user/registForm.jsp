<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../common/menubar.jsp"/>
	
	<!-- 회원 가입 양식 outer 영역 -->
	<div class="outer outer-member-insert">
		<br>
		<h2 align="center">회원 가입</h2>
		
		<!-- 회원 가입 폼 -->
		<form id="joinForm" action="${ pageContext.servletContext.contextPath }/user/signup" method="post">
			<table align="center">
				<tr>
					<td>사용자 이름</td>
					<td><input type="text" maxlength="10" name="userName" required></td>
					<td></td>
				</tr>
				<tr>
					<td width="200px"> 아이디 </td>
					<td><input type="text" maxlength="13" name="userId" id="userId" required></td>
					<td width="100px"><input type="button" value="중복확인" class="btn btn-or" id="duplicationCheck"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" maxlength="13" name="userPwd" required></td>
					<td></td>
				</tr>
				<tr>
					<td>회원가입 날짜</td>
					<td><input type="date" value="yyyy-mm-dd" name="date" required>
					</td>
				</tr>
				<tr>
					<td>이메일 </td>
					<td><input type="email" name="email"></td>
					<td></td>
				</tr>
			</table>
			
			<br>
			
			<div class="btns" align="center">
				<input type="reset" value="메인으로"  class="btn btn-yg" id="goMain">
				<input type="submit" value="가입하기" class="btn btn-or">
			</div>
		</form>
	</div>
</body>
</html>
