public class Main {
    public static void main(String[] args) {

        Submission sub = new Submission("24BCS10212","print(gogo gaga)","cpp.java");

        PlagiarismChecker checker = new SimplePlagiarismChecker();
        CodeGrader grader = new SimpleCodeGrader();
        ReportWriter writer = new FileReportWriter();

        EvaluationPipeline pipeline =
            new EvaluationPipeline(checker, grader, writer);

        pipeline.evaluate(sub);
    }
}