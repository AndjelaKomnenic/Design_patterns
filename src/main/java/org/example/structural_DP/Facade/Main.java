package org.example.structural_DP.Facade;

public class Main {
    public static void main(String[] args) {
        OverallComputerFacade overallFacade = new OverallComputerFacade();

        overallFacade.startOverallComputer();
        overallFacade.startOverallGamingComputer();
    }
}
