import java.util.ArrayList;

public class Gaming_PC extends Maker{

    public Gaming_PC(){
        pc.compulsory_part = new ArrayList<Constituent>();
        pc.optional_part = new ArrayList<Constituent>();
    }
    public void addProcessor(){
        pc.compulsory_part.add(new AMD_Ryzen_7_5700X());
    }
    public void addCooler(){
        return;
    }
    public void addBase(){
        pc.compulsory_part.add(new Base_Component());
    }
    public void addRAM(String s){
        if(s == null) return;
        if(s.equalsIgnoreCase("2666 MHz")){
            pc.optional_part.add(new DDR_RAM_1());
        }
        else if(s.equalsIgnoreCase("3200 MHz")){
            pc.optional_part.add(new DDR_RAM_2());
        }

    }
    public void addGraphicCard(String s){
        if(s==null) return;
        if(s.equalsIgnoreCase("2 GB")){
            pc.optional_part.add(new Graphic_Card_1());
        }
        else if(s.equalsIgnoreCase("4 GB")){
            pc.optional_part.add(new Graphic_Card_2());
        }
    }
    public void addDVD_Drive(){
        return;
    }
    public void printPC(){
        System.out.println();
        System.out.println("A Gaming PC");
        System.out.println();
        System.out.println("Compulsory Parts with price:");
        for (Constituent item : pc.compulsory_part){
            System.out.println("Name : "+item.getName());
            System.out.println("Price : "+item.getPrice() + " BDT");

        }
        System.out.println();
        System.out.println("Added components with price :");
        for (Constituent item : pc.optional_part){
            System.out.println("Name : "+item.getName());
            System.out.println("Price : "+item.getPrice()+ " BDT");

        }
        int cost = 0;
        for(Constituent item : pc.compulsory_part){
            cost+=item.getPrice();
        }
        for (Constituent item : pc.optional_part){
            cost+= item.getPrice();
        }
        System.out.println();
        System.out.println("The total cost of this pc is "+cost+" BDT");
    }
}
