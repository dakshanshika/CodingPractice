package DesignPatterns.AdapterDP;

public class PaymentAdapter implements PaymentProcessor{
    private ExternalPaymentAPI externalPaymentAPI;

    public PaymentAdapter(ExternalPaymentAPI externalPaymentAPI){
        this.externalPaymentAPI = externalPaymentAPI;
    }

    @Override
    public void pay(double amt) {
        externalPaymentAPI.makePayment(amt);
    }
}
