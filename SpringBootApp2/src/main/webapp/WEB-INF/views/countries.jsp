<%@ include file="/WEB-INF/taglib.jsp" %>

<c:forEach items="${ countriesList }" var="country">
	${country.id } | ${country.name } <br>
</c:forEach>