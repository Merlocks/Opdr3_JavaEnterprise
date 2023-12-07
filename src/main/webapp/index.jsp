<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="be.ucll.nieuwjaarsfeest.DaysCalculator"%>
<% DaysCalculator daysCalculator = (DaysCalculator) application.getAttribute("daysCalculator");%>
<!DOCTYPE html>
<html>
  <head>
    <title>JSP - Hello World</title>
  </head>
  <body>
    <h1>Welkom op het inschrijfformulier voor het nieusjaarsfeestje</h1>
    <br/>
    <h2>Er zijn nog <%= daysCalculator.daysUntilNewYear() %> dagen tot het nieuwjaarsfeestje!</h2>
    <br>
    <a href=PartyServlet>Klik hier om naar het inschrijvingsformulier te gaan</a>
  </body>
</html>