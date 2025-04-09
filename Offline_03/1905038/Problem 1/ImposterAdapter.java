public class ImposterAdapter implements Passenger{

    Imposter imposter;

    public ImposterAdapter(Imposter i){
        imposter = i;
    }
    @Override
    public void actualIdentity(){
        imposter.imposterIdentity();
    }

    @Override
    public void doTask(){
        imposter.doDisguisedTask();
    }

}
