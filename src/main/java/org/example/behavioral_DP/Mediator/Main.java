package org.example.behavioral_DP.Mediator;

public class Main {
    public static void main(String[] args) {
        AirTrafficControl mediator = new ATCMediator();

        Flight flight1 = new Flight("ABC123", mediator);
        Flight flight2 = new Flight("XYZ789", mediator);

        mediator.registerFlight(flight1);
        mediator.registerFlight(flight2);

        flight1.sendWarning("Traffic alert: Altitude deviation detected.");
    }
}
