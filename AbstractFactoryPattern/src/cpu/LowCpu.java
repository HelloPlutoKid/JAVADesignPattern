package cpu;

import Inter.ICpu;

/**
 * LowCpu
 */
public class LowCpu implements ICpu{

    @Override
    public void cpuInfo() {
        System.out.println("Low performance CPU");
    }
}