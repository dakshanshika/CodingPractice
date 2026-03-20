package DesignPatterns.FactoryDP;

public class PaymentFactory {

    public Payment getPaymentType(String paymentType){
        return switch (paymentType.toLowerCase()){
            case "gpay"-> new GPay();
            case "phonepay" -> new PhonePay();
            default -> new Others();
        };
    }
}
