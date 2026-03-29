class SimplePlagiarismChecker implements PlagiarismChecker {
    public int check(Submission submission) {
        int score = 12; //same lgic
        System.out.println("PlagiarismScore=" + score);
        return score;
    }
}