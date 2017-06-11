<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Leage Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc; cellpadding:10;
            cellspacing:10;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333; cellpadding:10;
            cellspacing:10;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0; cellpadding:10;
            cellspacing:10;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Add a Leage
</h1>

<c:url var="addAction" value="/leage/add" ></c:url>

<form:form action="${addAction}" commandName="leage">
    <table>
        <c:if test="${!empty leage.leageName}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="id" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="leageName">
                    <spring:message text="Leage Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="leageName" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="logo">
                    <spring:message text="Logo"/>
                </form:label>
            </td>
            <td>
                <form:input path="logo" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="prize">
                    <spring:message text="Prize"/>
                </form:label>
            </td>
            <td>
                <form:input path="prize" />
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <c:if test="${!empty leage.leageName}">
                    <input type="submit"
                           value="<spring:message text="Edit Leage"/>" />
                </c:if>
                <c:if test="${empty leage.leageName}">
                    <input type="submit"
                           value="<spring:message text="Add Leage"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>Leages List</h3>
<c:if test="${!empty listLeages}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Leage Name</th>
            <th width="60">Logo</th>
            <th width="60">Prize</th>
            <th width="60" colspan="2">Action</th>
        </tr>
        <c:forEach items="${listLeages}" var="leage">
            <tr>
                <td>${leage.id}</td>
                <td>${leage.leageName}</td>
                <td>${leage.logo}</td>
                <td>${leage.prize}</td>
                <td><a href="<c:url value='/leage/edit/${leage.id}' />"  class="button">Edit</a>
                    <a href="<c:url value='/leage/remove/${leage.id}' />"  class="btn">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>