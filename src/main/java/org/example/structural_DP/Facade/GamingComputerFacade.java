package org.example.structural_DP.Facade;

public class GamingComputerFacade {
    private CPU cpu;
    private Memory memory;
    private GPU gpu;

    public GamingComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.gpu = new GPU();
    }

    public void startGamingComputer() {
        cpu.start();
        memory.load();
        gpu.powerOn();
        System.out.println("Gaming Computer started successfully.");
    }

    public void shutdownGamingComputer() {
        gpu.powerOff();
        cpu.shutdown();
        memory.unload();
        System.out.println("Gaming Computer shut down successfully.");
    }

    public void overclockGPU() {
        gpu.overclock();
        System.out.println("GPU overclocked.");
    }
}
