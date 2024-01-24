package org.example.behavioral_DP.TemplateMethod;

public abstract class GameLoadingScreen {
    public final void displayLoadingScreen() {
        showBackground();
        showGameLogo();
        showLoadingProgressBar();
        showTips();
        loadGameResources();
        hideLoadingScreen();
    }

    abstract void showBackground();
    abstract void showGameLogo();
    abstract void showLoadingProgressBar();
    abstract void showTips();
    abstract void loadGameResources();

    void hideLoadingScreen() {
        System.out.println("Loading screen hidden. Game is ready to play!");
    }
}
