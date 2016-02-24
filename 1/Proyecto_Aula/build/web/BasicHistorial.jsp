<%-- 
    Document   : BasicHistorial
    Created on : oct 17, 2014, 1:18:44 p.m.
    Author     : AlvaroAlexander
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="soapdb.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        
                            <%
                                
                                //<br><br><br><br><h4 style="color: black">List: <select name="corridas"></select></h4>
                                
                Object idS = session.getAttribute("id");
                
                
                historyDB hisB = new historyDB();
                
                
                ArrayList<ArrayList> listA = hisB.getHistorial("1","1", "", "");
                
                Detail deta = new Detail();
                
                Object ob = listA.get(0).get(0);
                
                ArrayList l = deta.conect_db(String.valueOf(ob));
                
                for (Object o : l)
                {
                    out.println(o + "<br>");
                }
                
                
                int index = 0;
                /*
                for(ArrayList a : listA)
                {
                    for (Object o : a)
                    {
                        out.println(o);
                    }
                }
                
                for (int i = 0; i < listA.get(1).size(); i++)
                {
                    
                    //out.println("<option value\""+ listA.get(3).get(i) +"\">" + listA.get(3).get(i) + "</option>");

                }
                */
                /*for (ArrayList a : listA)
                {
                    int j = 0;
                    for (Object o : a)
                    {
                        if (index == 3)
                        {
                            out.println("<option value\""+ index +"\">" + o + "</option>");
                        }
                        j++;
                    }
                    index++;
                }
                */
                
                /*
                        historyDB history = new historyDB();
                
                ArrayList<ArrayList> list = history.getHistorial(String.valueOf(idS), "10", "", "");
                int index = 0;
                
                for (ArrayList a : list)
                {
                    for (int j = 0; j < a.size(); j++)
                    {
                        out.println("<option value\""+ index +"\">" + a.get(index) + "</option>");

                    }
                }
               */
                
            %>
    
</html>
