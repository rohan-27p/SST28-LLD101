import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Placement Eligibility ===");
        StudentProfile s = new StudentProfile("23BCS1001", "Ayaan", 8.10, 72, 18, LegacyFlags.NONE);
        RuleInput cfg = new RuleInput();

        RuleFactory factory =new RuleFactory(cfg);

        EligibilityEngine engine =new EligibilityEngine(new FakeEligibilityStore(),factory.build());
        engine.runAndPrint(s);
    }
}
