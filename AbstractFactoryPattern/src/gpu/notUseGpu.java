package gpu;

import Inter.IGpu;

/**
 * notUseGpu
 */
public class notUseGpu implements IGpu{

    @Override
    public void gpuInfo() {
        System.out.println("GPU don't use");
    }
}