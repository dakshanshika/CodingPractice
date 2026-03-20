package DesignPatterns.FactoryDP;

public class PhonePay implements Payment{
    @Override
    public void pay() {
        System.out.println("Initiating PhonePay Payment");
    }
}
