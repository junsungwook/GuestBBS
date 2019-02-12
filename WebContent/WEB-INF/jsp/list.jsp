<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>댓글목록</h1>
<h3><a href="insert.go">댓글쓰기</a></h3>
<table>
	<tr>
	<th>번호</th>
	<th>이름</th>
	<th>내용</th>
	<th>등급</th>
	<th>작성날짜</th>
	<th>ip</th>
	</tr>
	<c:forEach items="${list }" var="user">
	<tr>
	<td>${user.num }</td>
	<td>${user.name }</td>
	<td><a href="detail.go?num=${user.num }">${user.content }</a></td>
	<td>${user.grade }</td>
	<td>${user.created }</td>
	<td>${user.ipaddr }</td>
	<td><a href="delete.go?num=${user.num }">삭제</a></td>
	</tr>
	</c:forEach>
</table>
</div>
</body>
</html>