package DesignPatterns.FactoryDP;

public class Others implements Payment{
    @Override
    public void pay() {
        System.out.println("Initiating Others Payment");
    }
}
