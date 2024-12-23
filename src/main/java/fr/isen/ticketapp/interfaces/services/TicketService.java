package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.TicketModel;

public interface TicketService {
    List<TicketModel> getAllTicket();

    TicketModel getTicketById(final int id);

    TicketModel addTicket(final TicketModel ticket);

    boolean removeTicket(final int ticketId);

    TicketModel updateTicket(final TicketModel newTicket);

}
