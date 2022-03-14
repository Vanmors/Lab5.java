package com.company;

import com.company.commands.CommandChecker;
import com.company.exception.UnknownCommandException;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, UnknownCommandException {
        CommandChecker com = new CommandChecker();
            com.exit();

    }
}
