package ru.netology;

import java.util.Arrays;

public class Manager {
    private Repository repository;

    public Manager(Repository repository) {

        this.repository = repository;
    }

    public void add(Ticket ticket) {

        repository.add(ticket);
    }


    public Ticket[] findAll(String from, String to) {


        Ticket[] result = new Ticket[0];

        for (Ticket ticket : repository.findAll()) {

            if (matches(ticket, from, to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];

                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }


        }
        if (result.length == 0) {
            throw new NotFoundException(from, to);

        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Ticket ticket, String from, String to) {
        if (ticket.getFrom().equals(from)) {
            if (ticket.getTo().equals(to)) {
                return true;
            }
        }
        return false;
    }
}