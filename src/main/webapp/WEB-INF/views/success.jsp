<%@page import="com.saikrishna.FlightBookingApplication.entity.Flight"%>
<%@page import="java.util.List"%>

<html>
    <head>
        <title>Flights Results</title>
    </head>

    <body>

        <%
            List<Flight> listOfFlights=(List<Flight>)request.getAttribute("flightsList");
        %>
        <%
            for(Flight f:listOfFlights){
        %>

       <h1>Flight Number: <%= f.getFlightNumber()%></h1>
       <h1>Flight Source: <%= f.getSource()%></h1>
       <h1>Flight Number: <%= f.getDestination()%></h1>

       <%
            }
       %>

    </body>

</html>