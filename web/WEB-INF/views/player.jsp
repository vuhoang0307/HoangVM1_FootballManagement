<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Player Page</title>
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
    Add a Player
</h1>

<c:url var="addAction" value="/player/add" ></c:url>

<form:form action="${addAction}" commandName="player">
    <table>
        <c:if test="${!empty player.name}">
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
                <form:label path="name">
                    <spring:message text="Name"/>
                </form:label>
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="age">
                    <spring:message text="Age"/>
                </form:label>
            </td>
            <td>
                <form:input path="age" />
            </td>
        </tr>
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
                <form:label path="position">
                    <spring:message text="Position"/>
                </form:label>
            </td>
            <td>
                <form:input path="position" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="goal">
                    <spring:message text="Goal"/>
                </form:label>
            </td>
            <td>
                <form:input path="goal" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="photo">
                    <spring:message text="Photo"/>
                </form:label>
            </td>
            <td>
                <form:input path="photo" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <c:if test="${!empty player.name}">
                    <input type="submit"
                           value="<spring:message text="Edit Player"/>" />
                </c:if>
                <c:if test="${empty player.name}">
                    <input type="submit"
                           value="<spring:message text="Add Player"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>Players List</h3>
<c:if test="${!empty listPlayers}">
    <table class="tg">
        <tr>
            <th width="80">ID</th>
            <th width="120">Player Name</th>
            <th width="60">Age</th>
            <th width="60">Team Name</th>
            <th width="60">Position</th>
            <th width="40">Goal</th>
            <th width="60">Photo</th>
            <th width="120">Action</th>

        </tr>
        <c:forEach items="${listPlayers}" var="player">
            <tr>
                <td>${player.id}</td>
                <td>${player.name}</td>
                <td>${player.age}</td>
                <td>${player.teamName}</td>
                <td>${player.position}</td>
                <td>${player.goal}</td>
                <td>${player.photo}</td>
                <td><a href="<c:url value='/edit/${player.id}' />"  class="button">Edit</a>
                    <a href="<c:url value='/remove/${player.id}' />"  class="btn">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>