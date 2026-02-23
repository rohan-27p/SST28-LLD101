public class CgrRule implements EligibilityRule {

    private final double min;

    public CgrRule(double min) {
        this.min = min;
    }

    @Override
    public boolean fails(StudentProfile s) {
        return s.cgr < min;
    }

    @Override
    public String reason() {
        return "CGR below " + min;
    }
}