package org.example.behavioral_DP.State;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.requestStateChange();  // Red to Green
        trafficLight.requestStateChange();  // Green to Yellow
        trafficLight.requestStateChange();  // Yellow to Red
    }
}
