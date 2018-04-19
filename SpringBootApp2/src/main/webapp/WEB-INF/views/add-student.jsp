<%@ include file="/WEB-INF/taglib.jsp" %>

<style>
	.error {
		color:red;
	}
</style>

<form:form method="POST" modelAttribute="studentModel" action="/add-student">
	
	Student Name: <form:input path="fullName"/> <form:errors path="fullName" cssClass="error"/> <br>
	
	Student Age: <form:input path="age"/> <form:errors path="age" cssClass="error"/> <br>

	Student Email: <form:input path="email"/><form:errors path="email" cssClass="error"/>  <br>
	
	Country : <form:select path="country">
				<form:options items="${ countries }" itemLabel="name" itemValue="id"/>
			  </form:select> <form:errors path="country" cssClass="error"/> 
	
	<input type="submit" value="Add country">
</form:form>