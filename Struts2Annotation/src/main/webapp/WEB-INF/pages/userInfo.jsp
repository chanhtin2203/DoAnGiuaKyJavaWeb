<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>User Info</title>
</head>

<body>
   <jsp:include page="_menu.jsp" />
   
   <h2>Hello, ${loginedUsername}...!</h2>
</body>
</html>