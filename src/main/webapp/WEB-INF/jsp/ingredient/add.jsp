<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<form method="POST" action="${context}/ingredient/added">
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><input id="name" name="name" type="text" value="" /></td>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</tbody>
	</table>
</form>


