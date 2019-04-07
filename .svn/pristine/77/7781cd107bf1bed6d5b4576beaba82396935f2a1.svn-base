<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ingredient" items="${ingredients}">
				<tr>
					<td>${ingredient.name}</td>
					<td><a href="${context}/ingredient/edit/${ingredient.id}">Edit</a></td>
					<td><a href="${context}/ingredient/delete/${ingredient.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


