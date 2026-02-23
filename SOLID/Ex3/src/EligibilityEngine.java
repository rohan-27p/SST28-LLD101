import java.util.*;

public class EligibilityEngine {

    private final FakeEligibilityStore store;
    private final List<EligibilityRule> rules;

    public EligibilityEngine(
            FakeEligibilityStore store,
            List<EligibilityRule> rules) {

        this.store = store;
        this.rules = rules;
    }

    public void runAndPrint(StudentProfile s) {

        ReportPrinter p = new ReportPrinter();
        EligibilityEngineResult r = evaluate(s);
        p.print(s, r);
        store.save(s.rollNo, r.status);
    }

    public EligibilityEngineResult evaluate(
            StudentProfile s) {

        for (EligibilityRule r : rules) {

            if (r.fails(s)) {
                return new EligibilityEngineResult(
                        "NOT_ELIGIBLE",
                        List.of(r.reason()));
            }
        }

        return new EligibilityEngineResult(
                "ELIGIBLE",
                List.of());
    }
}