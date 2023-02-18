<%@ page contentType="text/html; charset=utf-8" %>
<%
	pageContext.setAttribute("num", 100);
	request.setAttribute("num", 200);
	application.setAttribute("num",300);
	//request.setAttribute("num2",300);
%>
<%-- ${num == 200 ? '200입니다' : '200이아닙니다'} --%>
${num}<br>
page : ${pageScope.num}<br>
request : ${requestScope.num}<br>
application : ${applicationScope.num}