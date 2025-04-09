public class Base_Component implements Constituent{
    @Override
    public String getName() {
        return " CPU , Motherboard , 1 TB HDD ";
    }

    @Override
    public int getPrice() {
        return 70000;
    }
}
