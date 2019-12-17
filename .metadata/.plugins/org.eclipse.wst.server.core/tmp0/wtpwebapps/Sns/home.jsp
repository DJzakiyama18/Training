<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home画面</title>
</head>
<body>
	<s:form action = "LoginAction">
		<s:textfield name = "user_name" placeholder = "ID"  label = "ログインID"></s:textfield>

		<s:password name = "user_pass" placeholder = "password" label = "パスワード"></s:password>

		<s:submit value = "ログイン"/>
	</s:form>
</body>
</html>