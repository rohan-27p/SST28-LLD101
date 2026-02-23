public class FeeBreakup {

    public final Money monthly;
    public final Money deposit;

    public FeeBreakup(
            Money monthly,
            Money deposit) {

        this.monthly = monthly;
        this.deposit = deposit;
    }
}