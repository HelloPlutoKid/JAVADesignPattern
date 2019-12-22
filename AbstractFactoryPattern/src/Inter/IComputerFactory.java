package Inter;

/**
 * IPlayer
 */
public interface IComputerFactory {

        public ICpu cpu();
        public IGpu gpu();
        public IMemory memory();

}