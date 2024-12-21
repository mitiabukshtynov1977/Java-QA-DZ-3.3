
public class CreditPaymentService {
    public double calculate(int sum, double percent, int amount) {
        double payment;
        payment = sum * (percent / 12 / 100) * Math.pow((1 + (percent / 12 / 100)), amount) / ((Math.pow((1 + (percent / 12 / 100)), amount)) - 1);
        return payment;
    }
}