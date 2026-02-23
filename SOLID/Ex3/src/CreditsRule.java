public class CreditsRule implements EligibilityRule {

    private final int min;

    public CreditsRule(int min) {
        this.min = min;
    }

    @Override
    public boolean fails(StudentProfile s) {
        return s.earnedCredits < min;
    }

    @Override
    public String reason() {
        return "credits below " + min;
    }
}