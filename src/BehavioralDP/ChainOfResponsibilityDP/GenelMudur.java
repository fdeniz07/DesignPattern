package BehavioralDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver {


    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {

        System.out.println("Genel müdür onayladi...");
        System.out.println("************************");
        return true;

    }
}
