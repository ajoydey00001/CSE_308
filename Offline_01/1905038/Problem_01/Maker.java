public abstract class Maker {
    protected PC pc = new PC();
    public abstract void addProcessor();
    public abstract void addCooler();
    public abstract void addBase();
    public abstract void addRAM(String s);
    public abstract void addGraphicCard(String s);
    public abstract void addDVD_Drive();

    public abstract void printPC();

}
