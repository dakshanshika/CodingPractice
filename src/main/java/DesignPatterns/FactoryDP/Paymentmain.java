package DesignPatterns.FactoryDP;

public class Paymentmain {

    public static void main(String[] args) {
        Payment gpay = new PaymentFactory().getPaymentType("dsfsf");
        gpay.pay();
    }
}
