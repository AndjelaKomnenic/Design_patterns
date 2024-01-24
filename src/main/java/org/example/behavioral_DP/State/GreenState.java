package org.example.behavioral_DP.State;

public class GreenState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLight context) {
        System.out.println("Switching to YELLOW state");
        context.setState(new YellowState());
    }
}
