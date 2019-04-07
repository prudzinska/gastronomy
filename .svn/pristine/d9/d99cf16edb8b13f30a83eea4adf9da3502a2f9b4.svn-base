<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<table>
	<thead>
		<tr>
			<th>ingredient</th>
			<th>quantity</th>
			<th></th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="ord" items="${ords}">
			<c:forEach var="orderItem" items="${ord.orderItems}">
				<tr>
					<td>${orderItem.ingredient.name}</td>
					<td>${orderItem.quantity}</td>
					<td><a href="${context}/ord/edit/${ord.id}">Edit</a></td>
					<td><a href="${context}/ord/delete/${ord.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:forEach>
	</tbody>
</table>