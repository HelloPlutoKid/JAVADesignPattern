package cpu;

import Inter.ICpu;

/**
 * HighCpu
 */
public class HighCpu implements ICpu{

    @Override
    public void cpuInfo() {
        System.out.println("High performance CPU");
    }
}