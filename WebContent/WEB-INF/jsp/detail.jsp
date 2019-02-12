<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update.go" method="POST">
		<table class="table">
			<tr>
				<td align="center">글쓴이</td>
				<td>
					<input type="hidden" name="num" id="num" value="${user.num }">
					<input type="text" id="name" size="20" name="name" value="${user.name }">
						*20글자 이내
				</td>
			</tr>
			<tr>
				<td align="center">내용</td>
				<td>
					<input type="text" id="content" size="70" name="content" value="${user.content }">
						*70글자 이내
				</td>
			</tr>
			<tr>
				<td align="center">평가</td>
				<td>
					<input type="radio" name="grade" value="excellent" checked="checked">아주잘함(excellent)
					<input type="radio" name="grade" value="good">잘함(goood)
					<input type="radio" name="grade" value="normal">보통(normal)
					<input type="radio" name="grade" value="fail">노력(fail)
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="입력" id="send" class="btn btn-success">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>