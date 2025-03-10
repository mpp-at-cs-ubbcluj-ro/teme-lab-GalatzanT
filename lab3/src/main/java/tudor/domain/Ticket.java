package tudor.domain;

public class Ticket extends Entity<Long> {
    Client client;
    Match match;
    int numberOfSeats;
}
