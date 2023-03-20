package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {
    @Test
    public void findZeroTicketTest() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Ticket ticket1 = new Ticket(1, 3200, "MSK", "SPB", 120);
        Ticket ticket2 = new Ticket(2, 6102, "UFA", "MSK", 325);
        Ticket ticket3 = new Ticket(3, 3200, "MSK", "SPB", 120);
        Ticket ticket4 = new Ticket(4, 5623, "PSK", "SPB", 243);
        Ticket ticket5 = new Ticket(5, 3200, "MSK", "SPB", 120);
        Ticket ticket6 = new Ticket(6, 3200, "MSK", "SPB", 120);
        Ticket ticket7 = new Ticket(7, 4624, "EKB", "KDR", 313);
        Ticket ticket8 = new Ticket(8, 3200, "MSK", "SPB", 120);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);



        Assertions.assertThrows(NotFoundException.class, () -> manager.findAll("SPB","MSK"));
    }

    @Test
    public void findOneTicketTest() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Ticket ticket1 = new Ticket(1, 3200, "MSK", "SPB", 120);
        Ticket ticket2 = new Ticket(2, 6102, "UFA", "MSK", 325);
        Ticket ticket3 = new Ticket(3, 3200, "MSK", "SPB", 120);
        Ticket ticket4 = new Ticket(4, 5623, "PSK", "SPB", 243);
        Ticket ticket5 = new Ticket(5, 3200, "MSK", "SPB", 120);
        Ticket ticket6 = new Ticket(6, 3200, "MSK", "SPB", 120);
        Ticket ticket7 = new Ticket(7, 4624, "EKB", "KDR", 313);
        Ticket ticket8 = new Ticket(8, 3200, "MSK", "SPB", 120);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2};
        Ticket[] actual = manager.findAll("UFA","MSK");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findFiveSortTicketTest() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Ticket ticket1 = new Ticket(1, 3200, "MSK", "SPB", 120);
        Ticket ticket2 = new Ticket(2, 6102, "UFA", "MSK", 325);
        Ticket ticket3 = new Ticket(3, 3795, "MSK", "SPB", 120);
        Ticket ticket4 = new Ticket(4, 5623, "PSK", "SPB", 243);
        Ticket ticket5 = new Ticket(5, 4103, "MSK", "SPB", 120);
        Ticket ticket6 = new Ticket(6, 4236, "MSK", "SPB", 120);
        Ticket ticket7 = new Ticket(7, 4624, "EKB", "KDR", 313);
        Ticket ticket8 = new Ticket(8, 5002, "MSK", "SPB", 120);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket1, ticket3, ticket5,ticket6, ticket8 };
        Ticket[] actual = manager.findAll("MSK","SPB");

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findFiveNotSortTicketTest() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Ticket ticket1 = new Ticket(1, 5200, "MSK", "SPB", 120);
        Ticket ticket2 = new Ticket(2, 6102, "UFA", "MSK", 325);
        Ticket ticket3 = new Ticket(3, 3520,  "MSK", "SPB", 120);
        Ticket ticket4 = new Ticket(4, 5623, "PSK", "SPB", 243);
        Ticket ticket5 = new Ticket(5, 3520, "MSK", "SPB", 120);
        Ticket ticket6 = new Ticket(6, 4216, "MSK", "SPB", 120);
        Ticket ticket7 = new Ticket(7, 4624, "EKB", "KDR", 313);
        Ticket ticket8 = new Ticket(8, 3789, "MSK", "SPB", 120);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket3, ticket5, ticket8,ticket6,ticket1 };
        Ticket[] actual = manager.findAll("MSK","SPB");

        Assertions.assertArrayEquals(expected, actual);
    }
}
