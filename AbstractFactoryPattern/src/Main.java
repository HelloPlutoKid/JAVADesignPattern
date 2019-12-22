import Inter.IComputerFactory;
import Inter.ICpu;
import Inter.IGpu;
import Inter.IMemory;
import computerList.ComputerA;
import computerList.ComputerB;
import computerList.ComputerC;

public class Main {
    public static void main(String[] args) {
        
        IComputerFactory computer = new ComputerA();
        ICpu cpu = computer.cpu();
        IGpu gpu = computer.gpu();
        IMemory memory = computer.memory();

        System.out.println("=======================");
        System.out.println("COMPUTER A SPEC");
        cpu.cpuInfo();
        gpu.gpuInfo();
        memory.memoryInfo();
        System.out.println("=======================");

        computer = new ComputerB();
        cpu = computer.cpu();
        gpu = computer.gpu();
        memory = computer.memory();

        System.out.println("=======================");
        System.out.println("COMPUTER B SPEC");
        cpu.cpuInfo();
        gpu.gpuInfo();
        memory.memoryInfo();
        System.out.println("=======================");

        computer = new ComputerC();
        cpu = computer.cpu();
        gpu = computer.gpu();
        memory = computer.memory();

        System.out.println("=======================");
        System.out.println("COMPUTER C SPEC");
        cpu.cpuInfo();
        gpu.gpuInfo();
        memory.memoryInfo();
        System.out.println("=======================");

    }
}
