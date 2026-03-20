package DesignPatterns.FactoryDP;

public class GPay implements Payment {
    @Override
    public void pay() {
        System.out.println("Initiating GPay Payment");
    }
}
