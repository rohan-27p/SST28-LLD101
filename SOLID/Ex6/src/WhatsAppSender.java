public class WhatsAppSender implements NotificationSender {
    private final AuditLog audit;

    public WhatsAppSender(AuditLog audit) {
        this.audit = audit;
    }

    @Override
    public void send(Notification n) {
        if (n.phone == null || !n.phone.startsWith("+")) {
            throw new IllegalArgumentException(
                "phone must start with + and country code"
            );
        }

        System.out.println("WA -> to=" + n.phone + " body=" + n.body);
        audit.add("wa sent");
    }
}