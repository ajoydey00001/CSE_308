public class TestDemo {

    public static void main(String[] arg){

        Passenger passenger_01 = new Crewmate_01();
        Imposter imposter_01 = new Imposter_01();
        Passenger passenger_02 = new ImposterAdapter(imposter_01);
        Passenger passenger_03 = new Crewmate_02();
        Imposter imposter_02 = new Imposter_02();
        Passenger passenger_04 = new ImposterAdapter(imposter_02);

        
        System.out.println();
        System.out.println("----------------------Passenger 1 -------------------------");
        passenger_01.actualIdentity();
        passenger_01.doTask();
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("----------------------Passenger 2 ----------------------");
        passenger_02.actualIdentity();
        passenger_02.doTask();
        System.out.println("--------------------------------------------------------");
        System.out.println();
        System.out.println("-----------------------Passenger 3 --------------------------");
        passenger_03.actualIdentity();
        passenger_03.doTask();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        System.out.println("-----------------------Passenger 4 ---------------------------");
        passenger_04.actualIdentity();
        passenger_04.doTask();
        System.out.println("----------------------------------------------------------------------");

    }
}
