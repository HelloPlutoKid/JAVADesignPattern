
import Inter.IComputerFactory;
import Inter.ICpu;
import Inter.IGpu;
import Inter.IMemory;
import cpu.MidCpu;
import gpu.notUseGpu;
import memory.SixTeenGB;

/**
 * ComputerA
 */
public class ComputerA implements IComputerFactory{

	@Override
	public ICpu cpu() {
		return new MidCpu();
	}

	@Override
	public IGpu gpu() {
		return new notUseGpu();
	}

	@Override
	public IMemory memory() {
		return new SixTeenGB();
	}

    
}
