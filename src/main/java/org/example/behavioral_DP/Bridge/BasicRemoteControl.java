package org.example.behavioral_DP.Bridge;

public class BasicRemoteControl extends RemoteControl{
    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Remote: Turning on");
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Remote: Turning off");
        device.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Remote: Setting channel to " + channel);
        device.setChannel(channel);
    }
}
