class ClubConsole {
    public static void run(FinanceOps finance,MinutesOps minutes,EventOps events,TreasurerTool t,SecretaryTool s,EventLeadTool e) {
        System.out.println("=== Club Admin ===");

        finance.addLedgerEntry(5000, "sponsor");
        minutes.addMinutes("Meeting at 5pm");
        events.createEvent("HackNight", 2000);

        System.out.println(
            "Summary: ledgerBalance=" + t.getBalance() +
            ", minutes=" + s.getMinutesCount() +
            ", events=" + e.getEventCount()
        );
    }
}