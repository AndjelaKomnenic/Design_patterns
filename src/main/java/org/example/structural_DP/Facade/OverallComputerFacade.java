package org.example.structural_DP.Facade;

// facade
public class OverallComputerFacade {
    private ComputerFacade computerFacade;
    private GamingComputerFacade gamingComputerFacade;

    public OverallComputerFacade() {
        this.computerFacade = new ComputerFacade();
        this.gamingComputerFacade = new GamingComputerFacade();
    }

    public void startOverallComputer() {
        System.out.println("Starting overall computer...");
        computerFacade.startComputer();
    }

    public void startOverallGamingComputer() {
        System.out.println("Starting overall gaming computer...");
        gamingComputerFacade.startGamingComputer();
    }
}
