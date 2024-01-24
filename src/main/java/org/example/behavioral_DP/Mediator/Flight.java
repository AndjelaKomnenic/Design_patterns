package org.example.behavioral_DP.Mediator;

public class Flight {
    private String flightNumber;
    private AirTrafficControl mediator;

    public Flight(String flightNumber, AirTrafficControl mediator) {
        this.flightNumber = flightNumber;
        this.mediator = mediator;
    }

    public void sendMessage(String message) {
        System.out.println("Flight " + flightNumber + " receives message: " + message);
    }

    public void sendWarning(String message) {
        System.out.println("Flight " + flightNumber + " sends warning: " + message);
        mediator.sendWarning(message, this);
    }
}
