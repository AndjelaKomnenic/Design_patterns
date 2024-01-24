package org.example.behavioral_DP.State;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        // Initial state: Red
        currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void requestStateChange() {
        currentState.handleRequest(this);
    }
}
