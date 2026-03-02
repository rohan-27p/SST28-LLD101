import com.example.tickets.IncidentTicket;
import com.example.tickets.TicketService;

// import java.util.List;

/**
 * Starter demo that shows why mutability is risky.
 *
 * After refactor:
 * - direct mutation should not compile (no setters)
 * - external modifications to tags should not affect the ticket
 * - service "updates" should return a NEW ticket instance
 */
public class TryIt {
    public static void main(String[] args) {

        TicketService service = new TicketService();

        IncidentTicket ticket = service.createTicket("INC-001","rohan@foo.com","Payment gateway not working");

        System.out.println("Original: " + ticket.getTitle());
        IncidentTicket updated = service.assignTicket(ticket, "agent@example.com");

        System.out.println("Assignee: " + updated.getAssigneeEmail());
        try {
            ticket.getTags().add("bug");
        } catch (UnsupportedOperationException e) {
            System.out.println("Tags list is immutable!");
        }

        System.out.println("Original assignee: " + ticket.getAssigneeEmail());
    }
}