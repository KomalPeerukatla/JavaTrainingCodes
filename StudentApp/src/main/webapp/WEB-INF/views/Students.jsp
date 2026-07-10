<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Student List</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
</tr>

<c:forEach items="${list}" var="s">

<tr>
<td>${s.id}</td>
<td>${s.name}</td>
</tr>

</c:forEach>

</table>