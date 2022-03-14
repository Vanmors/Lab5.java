package com.company.exception;

import java.util.Scanner;

public class UnknownCommandException extends Exception{
    private String command;
    public UnknownCommandException(String command) {
        this.command = command;
        System.out.println("Неизвестная команда " + command);
    }
}
