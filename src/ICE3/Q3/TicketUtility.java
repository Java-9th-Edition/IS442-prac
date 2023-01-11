package ICE3.Q3;

import java.util.ArrayList;

public class TicketUtility {

    public static double calculateAverageTicketPrice(ArrayList<Ticket> tickets) {
        if (tickets == null || tickets.size() == 0) {
            return 0.0;
        }

        double averageTicketPrice = 0.0;

        for (Ticket ticket : tickets) {
            averageTicketPrice += ticket.calculatePrice();
        }
        return averageTicketPrice / tickets.size();
    }
}
