package com.company.exception;

public class InvalidDataException extends Exception{
    //private String data;
    public InvalidDataException() {
        System.out.println("Некоректно введённые данные: " );
    }

}
