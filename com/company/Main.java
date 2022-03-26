package com.company;

import com.company.commands.CommandChecker;
import com.company.exception.UnknownCommandException;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, UnknownCommandException {
        CommandChecker com = new CommandChecker();
        while(true) {
            if (args.length == 1 && !args[0].equals("/dev/null") && !args[0].equals("/dev/random") && !args[0].equals("/dev/zero")) {
                com.exit(args[0]);
                break;
            } else {
                System.out.println("Введено больше одного файла или не введено вообще");
                break;
            }
        }
    }
}
