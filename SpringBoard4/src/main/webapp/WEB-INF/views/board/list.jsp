<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<style>
#list {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}
#list td, #list th {
  border: 1px solid #ddd;
  padding: 8px;
  text-align:center;
}
#list tr:nth-child(even){background-color: #f2f2f2;}
#list tr:hover {background-color: #ddd;}
#list th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #006bb3;
  color: white;
}
</style>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deletepost.jsp?id=' + id;
	}
</script>
</head>
<body>
<h1>자유게시판</h1>

<table id="list" width="90%">
<tr>
	<th>Id</th>
	<th>Title</th>
	<th>Writer</th>
	<th>Director</th>
	<th>Actor</th>
	<th>영화 한줄(대사)</th>
	<th>후기</th>
	<th>추천</th>
	<th>Edit</th>
	<th>Delete</th>

</tr>

<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.seq}</td>
		<td>${u.title()}</td>
		<td>${u.writer()}</td>
		<td>${u.director()}</td>
		<td>${u.actor()}</td>
		<td>${u.dialogue()}</td>
		<td>${u.content()}</td>
		<td>${u.recommend()}</td>
		<td><a href="editform/${u.seq}">글수정</a></td>
		<td><a href="javascript:delete_ok('${u.seq}')">글삭제</a></td>
	</tr>
</c:forEach>
</table>


<br/><button type="button" onclick="location.href='addpostform'">새 글쓰기</button>

</body>
</html>