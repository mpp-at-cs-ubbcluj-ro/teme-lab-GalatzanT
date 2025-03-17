package tudor.domain;

public class Ticket extends Entity<Integer> {
    Client client;
    Match match;
    int numberOfSeats;
}
