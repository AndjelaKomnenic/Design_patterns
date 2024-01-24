package org.example.behavioral_DP.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        GameLoadingScreen simpleLoadingScreen = new SimpleLoadingScreen();
        simpleLoadingScreen.displayLoadingScreen();

        System.out.println("-------------------------");

        GameLoadingScreen advancedLoadingScreen = new AdvancedLoadingScreen();
        advancedLoadingScreen.displayLoadingScreen();
    }
}
