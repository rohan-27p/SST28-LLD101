public class SimplePaymentGateway implements PaymentGateway {
    public String pay(double amount) {
        String txn = "TXN-9001";
        System.out.println("Payment=PAID txn=" + txn);
        return txn;
    }
}