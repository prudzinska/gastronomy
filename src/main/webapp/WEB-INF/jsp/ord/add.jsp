<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="${pageContext.request.contextPath}" />


<form method="post" action="${context}/ord/added">
	<table>
		<thead>
			<tr>
				<th>Ingredient</th>
				<th>Quantity</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><select id="orderItems[0].ingredient"
					name="orderItems[0].ingredient">
						<c:forEach items="${ingredients}" var="ingredient">
							<option value="${ingredient.id}">${ingredient.name}</option>
						</c:forEach>
				</select></td>
				<td><input name="orderItems[0].quantity"
					id="orderItems[0].quantity" type="text" value="" /></td>
			</tr>
			<tr colspan="2">
				<td><input type="submit" value="Submit"></td>
			</tr>
		</tbody>
	</table>
</form>