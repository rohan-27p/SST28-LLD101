class EvaluationPipeline {
    private PlagiarismChecker checker;
    private CodeGrader grader;
    private ReportWriter writer;

    public EvaluationPipeline(PlagiarismChecker checker,CodeGrader grader,ReportWriter writer) {
        this.checker = checker;
        this.grader = grader;
        this.writer = writer;
    }

    public void evaluate(Submission submission) {
        System.out.println("=== Evaluation Pipeline ===");

        int pScore = checker.check(submission);
        int cScore = grader.grade(submission);

        int total = pScore + cScore;

        writer.write(submission, total);

        String result = total >= 50 ? "PASS" : "FAIL";
        System.out.println("FINAL: " + result + " (total=" + total + ")");
    }
}
