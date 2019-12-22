package gpu;

import Inter.IGpu;

/**
 * useGpu
 */
public class useGpu implements IGpu{

    @Override
    public void gpuInfo() {
        System.out.println("GPU use");
    }
}