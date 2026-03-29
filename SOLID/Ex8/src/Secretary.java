class SecretaryTool implements MinutesOps {
    private int minutesCount = 0;

    public void addMinutes(String text) {
        minutesCount++;
        System.out.println("Minutes added: \"" + text + "\"");
    }

    public int getMinutesCount() {
        return minutesCount;
    }
}