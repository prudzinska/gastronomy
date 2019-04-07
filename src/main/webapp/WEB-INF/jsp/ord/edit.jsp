<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />

<form method="POST" action="${context}/ord/edited">
	<table>
		<thead>
			<tr>
				<th>ingredient</th>
				<th>quantity</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><select id="ingredient" name="ingredient">
								<c:forEach items="${ingredients}" var="ingredient">
									<c:choose>
										<c:when test="${ingredient.id==ord.orderItem.ingredient.id}">
											<option value="${ingredient.id}" selected>${ingredient.name}
											</option>
										</c:when>
										<c:otherwise>
											<option value="${ingredient.id}">${ingredient.name}</option>
										</c:otherwise>
									</c:choose>
								</c:forEach>
				</select></td>
				<td><input id="quantity" name="quantity" type="text"
					value="${ord.orderItem.quantity}" /></td>
				<td><input type="submit" value="Submit"></td>
				<input id="id" name="id" type="hidden" value="${ord.id}" />
			</tr>
		</tbody>
	</table>
</form>