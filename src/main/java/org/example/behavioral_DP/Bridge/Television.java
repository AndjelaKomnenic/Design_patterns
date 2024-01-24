package org.example.behavioral_DP.Bridge;

public class Television implements Device{
    private int channel;

    @Override
    public void turnOn() {
        System.out.println("Radio: Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio: Turning off");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Radio: Setting channel to " + channel);
    }
}
