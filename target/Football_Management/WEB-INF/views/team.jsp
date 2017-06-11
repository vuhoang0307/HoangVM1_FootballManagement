<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Team Page</title>
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
    Add a Team
</h1>

<c:url var="addAction" value="/team/add" ></c:url>

<form:form action="${addAction}" commandName="team">
    <table>
        <c:if test="${!empty team.teamName}">
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
                <form:label path="teamName">
                    <spring:message text="Team Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="teamName" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="score">
                    <spring:message text="Score"/>
                </form:label>
            </td>
            <td>
                <form:input path="score" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="numberOfWin">
                    <spring:message text="Number Of Win"/>
                </form:label>
            </td>
            <td>
                <form:input path="numberOfWin" />
            </td>
        </tr>
        <tr>
        <tr>
            <td>
                <form:label path="numberOfLost">
                    <spring:message text="Number Of Lost"/>
                </form:label>
            </td>
            <td>
                <form:input path="numberOfLost" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="numberOfDraw">
                    <spring:message text="Number Of Draw"/>
                </form:label>
            </td>
            <td>
                <form:input path="numberOfDraw" />
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
            <td colspan="2">
                <c:if test="${!empty team.teamName}">
                    <input type="submit"
                           value="<spring:message text="Edit Team"/>" />
                </c:if>
                <c:if test="${empty team.teamName}">
                    <input type="submit"
                           value="<spring:message text="Add Team"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>Teams List</h3>
<c:if test="${!empty listTeams}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Team Name</th>
            <th width="60">Score</th>
            <th width="120">Number Of Win</th>
            <th width="120">Number Of Lost</th>
            <th width="120">Number Of Draw</th>
            <th width="60">Logo</th>
            <th width="120">Action</th>
        </tr>
        <c:forEach items="${listTeams}" var="team">
            <tr>
                <td>${team.id}</td>
                <td>${team.teamName}</td>
                <td>${team.score}</td>
                <td>${team.numberOfWin}</td>
                <td>${team.numberOfLost}</td>
                <td>${team.numberOfDraw}</td>
                <td>${team.logo}</td>
                <td><a href="<c:url value='/team/edit/${team.id}' />"  class="button">Edit</a>
                    <a href="<c:url value='/team/remove/${team.id}' />"  class="btn">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>