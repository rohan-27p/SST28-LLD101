class FileReportWriter implements ReportWriter {
    public void write(Submission submission, int totalScore) {
        System.out.println("Report written: report-" + submission.roll + ".txt");
    }
}