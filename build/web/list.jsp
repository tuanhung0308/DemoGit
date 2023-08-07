<%-- 
    Document   : list
    Created on : Jul 14, 2023, 4:30:30 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Title</th>
                    <th>Published Date</th>
                    <th>is Open Access</th>
                </tr>
            </thead>      
            <tbody>
                <c:forEach var="l" items="${list}">
                    <tr>
                        <td>${l.aid}</td>
                        <td>${l.title}</td>
                        <td>${l.published_date}</td>
                        <td>
                            <c:if test="${l.open_access}">
                                <img src="img/open.png" alt=""/>
                            </c:if>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
