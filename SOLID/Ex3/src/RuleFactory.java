import java.util.*;

public class RuleFactory {

    private final RuleInput cfg;

    public RuleFactory(RuleInput cfg) {
        this.cfg = cfg;
    }

    public List<EligibilityRule> build() {

        return List.of(
            new DisciplinaryRule(),
            new CgrRule(cfg.minCgr),
            new AttendanceRule(cfg.minAttendance),
            new CreditsRule(cfg.minCredits)
        );
    }
}