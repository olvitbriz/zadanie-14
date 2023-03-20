package ru.netology;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String from, String to) {

        super("Билеты из " +from+"в "+to + " не найдены");
    }

}