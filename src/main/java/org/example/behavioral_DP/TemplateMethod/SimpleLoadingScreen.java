package org.example.behavioral_DP.TemplateMethod;

public class SimpleLoadingScreen extends GameLoadingScreen{
    @Override
    void showBackground() {
        System.out.println("Displaying a simple loading screen background.");
    }

    @Override
    void showGameLogo() {
        System.out.println("Displaying the game logo on the loading screen.");
    }

    @Override
    void showLoadingProgressBar() {
        System.out.println("Displaying a basic loading progress bar.");
    }

    @Override
    void showTips() {
        System.out.println("Displaying helpful tips for players.");
    }

    @Override
    void loadGameResources() {
        System.out.println("Loading essential game resources.");
    }
}
