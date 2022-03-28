package com.company.exception;

/**
 * проверяет корректность введённых команд
 */
public class UnknownCommandException extends Exception{
    private String command;
    public UnknownCommandException(String command) {
        this.command = command;
        System.out.println("Неизвестная команда " + command);
    }
}
