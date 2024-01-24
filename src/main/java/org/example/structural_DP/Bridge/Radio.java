package org.example.structural_DP.Bridge;

public class Radio implements Device{
    private int channel;

    @Override
    public void turnOn() {
        System.out.println("TV: Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV: Turning off");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("TV: Setting channel to " + channel);
    }
}
