package cpu;

import Inter.ICpu;

/**
 * HighCpu
 */
public class MidCpu implements ICpu{

    @Override
    public void cpuInfo() {
        System.out.println("Mid performance CPU");
    }
}