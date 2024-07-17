package services;

public class PaypalService implements PaymentService{

    public static final double SIMPLE_INTEREST_RATE = 0.01;
    public static final double PAYMENT_FEE_RATE = 0.02;

    @Override
    public double interest(double amount, int months) {
        return amount * SIMPLE_INTEREST_RATE * months;
    }

    @Override
    public double paymentFee(double amount) {
        return amount * PAYMENT_FEE_RATE;
    }

}
