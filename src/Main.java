public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        double percent = 9.99;
        int amount = 24;
        double payment = service.calculate(sum, percent, amount);
        System.out.println((int) payment);
    }
}
