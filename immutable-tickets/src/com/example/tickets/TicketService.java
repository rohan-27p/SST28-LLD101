package com.example.tickets;

// import java.util.ArrayList;
// import java.util.List;

/**
 * Service layer that creates tickets.
 *
 * CURRENT STATE (BROKEN ON PURPOSE):
 * - creates partially valid objects
 * - mutates after creation (bad for auditability)
 * - validation is scattered & incomplete
 *
 * TODO (student):
 * - After introducing immutable IncidentTicket + Builder, refactor this to stop mutating.
 */
public class TicketService {

    public IncidentTicket createTicket(String id, String email, String title) {
        return IncidentTicket.builder()
                .id(id)
                .reporterEmail(email)
                .title(title)
                .priority("MEDIUM")
                .customerVisible(true)
                .build();
    }

    public IncidentTicket assignTicket(IncidentTicket ticket, String assigneeEmail) {
        return ticket.toBuilder()
                .assigneeEmail(assigneeEmail)
                .build();
    }

    public IncidentTicket addTag(IncidentTicket ticket, String tag) {
        return ticket.toBuilder()
                .addTag(tag)
                .build();
    }
}