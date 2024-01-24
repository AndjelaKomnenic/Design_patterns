package org.example.behavioral_DP.TemplateMethod;

public class AdvancedLoadingScreen extends GameLoadingScreen{
    @Override
    void showBackground() {
        System.out.println("Displaying an advanced loading screen background with animations.");
    }

    @Override
    void showGameLogo() {
        System.out.println("Displaying an animated game logo on the loading screen.");
    }

    @Override
    void showLoadingProgressBar() {
        System.out.println("Displaying a detailed loading progress bar with additional information.");
    }

    @Override
    void showTips() {
        System.out.println("Displaying advanced game tips and hints.");
    }

    @Override
    void loadGameResources() {
        System.out.println("Loading additional game resources for advanced features.");
    }

    @Override
    void hideLoadingScreen() {
        System.out.println("Performing additional cleanup. Advanced loading screen hidden.");
    }
}
