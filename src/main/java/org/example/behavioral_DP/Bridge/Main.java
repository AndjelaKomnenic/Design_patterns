package org.example.behavioral_DP.Bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new Television();
        Device radio = new Radio();

        RemoteControl remote1 = new BasicRemoteControl(tv);
        RemoteControl remote2 = new BasicRemoteControl(radio);


        remote1.turnOn();
        remote1.setChannel(5);
        remote1.turnOff();

        remote2.turnOn();
        remote2.setChannel(101);
        remote2.turnOff();
    }
}
