package food;

/**
 *  국수 음식 
 */
public class Food {
    private String source;
    private String meat;
    private String noodle;

    public Food(String source, String meat, String noodle){
        this.source = source;
        this.meat = meat;
        this.noodle = noodle;
    }

    /**
     * @param meat the meat to set
     */
    public void setMeat(String meat) {
        this.meat = meat;
    }

    /**
     * @param noodle the noodle to set
     */
    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the meat
     */
    public String getMeat() {
        return meat;
    }
    
    /**
     * @return the noodle
     */
    public String getNoodle() {
        return noodle;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    @Override
    public String toString() {
        return "source = >" + source + "," + "noodle = >" + noodle + "," + "meat = >" + meat;
    }
    
}
