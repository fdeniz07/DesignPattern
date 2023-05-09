package BehavioralDP.ChainOfResponsibilityDP;

//Yetki dagilimi icin abstract sinif
public abstract class Approver {

    Approver chief;

    //parametreli const.
    public Approver(Approver chief) {
        this.chief = chief;
    }

    //onaylanabilecek kredi limiti
    abstract boolean approveLoan(int amount);
}
