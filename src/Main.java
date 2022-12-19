public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();


        int monthlyPayment1 = service.calculate(12, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж: " + monthlyPayment1);

        int monthlyPayment2 = service.calculate(24, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж: " + monthlyPayment2);

        int monthlyPayment3 = service.calculate(36, 9.99, 1_000_000);
        System.out.println("Ежемесячный платеж: " + monthlyPayment3);
    }
}
