package org.example.behavioral_DP.State;

public class RedState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLight context) {
        System.out.println("Switching to GREEN state");
        context.setState(new GreenState());
    }
}
