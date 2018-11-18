<%-- 
    Document   : Home
    Created on : Nov 17, 2018, 10:53:03 PM
    Author     : Alucard
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee</h1>
        <table border="1">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Contact No</th>
                <th>Date</th>
                <th>Status</th>
            </tr>
            
            <c:forEach var="s" items="${requestScope.employees}">
                <tr>
                    <td>${s.firstName} ${s.lastName}</td>
                    <td>${s.email}</td>
                    <td>${s.contact}</td>
                    <td>${s.addedDate}</td>
                    <td>${s.status}</td>
                </tr>
                
            </c:forEach>
        </table>
    </body>
</html>
