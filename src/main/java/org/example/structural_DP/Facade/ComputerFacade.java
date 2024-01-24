package org.example.structural_DP.Facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private BIOS bios;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.bios = new BIOS();
    }

    // Simplified methods for the client
    public void startComputer() {
        cpu.start();
        memory.load();
        bios.accessSettings();
        System.out.println("Computer started successfully.");
    }

    public void shutdownComputer() {
        cpu.shutdown();
        memory.unload();
        System.out.println("Computer shut down successfully.");
    }
}
