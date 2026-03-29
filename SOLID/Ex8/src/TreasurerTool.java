class TreasurerTool implements FinanceOps {
    private int ledgerBalance = 0;

    public void addLedgerEntry(int amount, String source) {
        ledgerBalance += amount;
        System.out.println("Ledger: +" + amount + " (" + source + ")");
    }

    public int getBalance() {
        return ledgerBalance;
    }
}