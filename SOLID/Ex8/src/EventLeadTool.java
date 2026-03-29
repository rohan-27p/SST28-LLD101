class EventLeadTool implements EventOps {
    private int eventCount = 0;

    public void createEvent(String name, int budget) {
        eventCount++;
        System.out.println("Event created: " + name + " (budget=" + budget + ")");
    }

    public int getEventCount() {
        return eventCount;
    }
}