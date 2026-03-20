package DesignPatterns.Proxy;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving Bike");
    }
}
