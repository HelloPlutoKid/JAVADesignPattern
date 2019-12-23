
import Inter.IComputerFactory;
import Inter.ICpu;
import Inter.IGpu;
import Inter.IMemory;
import cpu.HighCpu;
import cpu.MidCpu;
import gpu.notUseGpu;
import gpu.useGpu;
import memory.EightGB;
import memory.FourGB;
import memory.SixTeenGB;

/**
 * ComputerA
 */
public class ComputerB implements IComputerFactory{

	@Override
	public ICpu cpu() {
		return new HighCpu();
	}

	@Override
	public IGpu gpu() {
		return new useGpu();
	}

	@Override
	public IMemory memory() {
		return new EightGB();
	}

    
}
