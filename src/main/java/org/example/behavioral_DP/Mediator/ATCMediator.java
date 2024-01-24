package org.example.behavioral_DP.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ATCMediator implements AirTrafficControl{
    private List<Flight> flights = new ArrayList<>();

    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void sendWarning(String msg, Flight sender) {
        for (Flight flight : flights) {
            if (flight != sender) {
                flight.sendMessage(msg);
            }
        }
    }
}
