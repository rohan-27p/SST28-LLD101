public class AttendanceRule implements EligibilityRule {

    private final int min;

    public AttendanceRule(int min) {
        this.min = min;
    }

    @Override
    public boolean fails(StudentProfile s) {
        return s.attendancePct < min;
    }

    @Override
    public String reason() {
        return "attendance below " + min;
    }
}