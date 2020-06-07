<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
    String path = request.getContextPath();
    String basepath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<base href="<%=basepath %>" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Insert title here</title>
</head>
<body>

	<shiro:authenticated>
		<shiro:principal property="usercode" ></shiro:principal>
	</shiro:authenticated>
	<shiro:notAuthenticated>
		<a href="login.jsp" >请登录</a>
	</shiro:notAuthenticated>
	
	<!-- 自动讲name的值跟用户拥有的权限做匹配，如果用户拥有这个权限，则标签之内的内容会被显示 -->
	<shiro:hasPermission name="paper:create">
		<a href="question/addQuestion?question=1111&answer=222">添加问题</a>
	</shiro:hasPermission>
	
	
</body>
</html>
