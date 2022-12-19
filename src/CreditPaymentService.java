public class CreditPaymentService {
    public int calculate(int month, double percent, int sum) {
        double rate = percent / 12 / 100;
        double rateSum = 1 + rate;
        double coef = (rate * Math.pow(rateSum, month) / (Math.pow(rateSum, month) - 1));
        double result = coef * sum;
        return (int) result;
    }
}


