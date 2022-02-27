package com.company.exception;

public class UnknownCommandException extends Exception{
    private String command;
    public String getCommand() {
        return command;
    }
    public UnknownCommandException(String command) {
        this.command = command;
        System.out.println("Неизвестная команда " + command);
    }
}
