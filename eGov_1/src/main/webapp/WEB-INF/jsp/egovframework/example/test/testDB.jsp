<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>목록페이지</h1>
<a href="enroll.do">등록페이지</a>
<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>수정일</th>
		</tr>
		<tbody>
			<c:forEach var="list" items="${list}">
				<tr>
					<td>${list.bno}</td>
					<td><a href="detailPage.do">${list.title}</a></td>
					<td>${list.content}</td>
				</tr>
			</c:forEach>
		</tbody>
</table>
</body>
</html>