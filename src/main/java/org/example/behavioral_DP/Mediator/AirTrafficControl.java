package org.example.behavioral_DP.Mediator;

public interface AirTrafficControl {
    void registerFlight(Flight flight);
    void sendWarning(String msg, Flight sender);
}
