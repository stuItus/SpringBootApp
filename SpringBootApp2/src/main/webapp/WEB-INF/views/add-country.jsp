<%@ include file="/WEB-INF/taglib.jsp" %>
<style>
	.error {
		color:red;
	}
</style>

<form:form method="POST" modelAttribute="countryModel" action="/add-country">
	
	Country Name: <form:input path="name"/> <form:errors path="name" cssClass="error"/>
	<input type="submit" value="Add country">
</form:form>