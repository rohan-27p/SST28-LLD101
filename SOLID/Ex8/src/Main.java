public class Main {
    public static void main(String[] args) {
        TreasurerTool t = new TreasurerTool();
        SecretaryTool s = new SecretaryTool();
        EventLeadTool e = new EventLeadTool();

        ClubConsole.run(t, s, e, t, s, e);
    }
}