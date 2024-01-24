package org.example.behavioral_DP.State;

public class YellowState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLight context) {
        System.out.println("Switching to RED state");
        context.setState(new RedState());
    }
}
