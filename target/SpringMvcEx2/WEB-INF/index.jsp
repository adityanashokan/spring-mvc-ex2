<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<body>
    <form:form method="post" modelAttribute="user">
        <table>
                    <tr>
                    <td>Name</td>
                    <td><form:input path="name" /></td>
                    </tr>
                    <tr>
                    <td>Password</td>
                    <td><form:password path="password"/></td>
                    </tr>
                    <tr>
                    <td colspan="3"><input type="submit" value="Add User"/></td>
                    </tr>
                </table>
    </form:form>

</body>
</html>
