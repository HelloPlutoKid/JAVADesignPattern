
import Inter.IComputerFactory;
import Inter.ICpu;
import Inter.IGpu;
import Inter.IMemory;
import cpu.HighCpu;
import cpu.LowCpu;
import cpu.MidCpu;
import gpu.notUseGpu;
import gpu.useGpu;
import memory.EightGB;
import memory.FourGB;
import memory.SixTeenGB;

/**
 * ComputerA
 */
public class ComputerC implements IComputerFactory{

	@Override
	public ICpu cpu() {
		return new LowCpu();
	}

	@Override
	public IGpu gpu() {
		return new notUseGpu();
	}

	@Override
	public IMemory memory() {
		return new FourGB();
	}

    
}
