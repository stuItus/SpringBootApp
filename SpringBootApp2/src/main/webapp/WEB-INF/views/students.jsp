<%@ include file="/WEB-INF/taglib.jsp" %>

<c:forEach items="${ studentsList }" var="student">
	${student.id } | ${student.fullName } | ${student.country.name } <br>
</c:forEach>