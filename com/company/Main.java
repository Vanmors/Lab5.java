package com.company;

import com.company.commands.CommandChecker;

import java.io.*;

/**
 * Main class
 * <img src="doc-files/ITMO_VT.jpg" alt="bla"/>
 */
public class Main {
    /**
     * метод, создающий экземпляр класса CommandChecker и вызывающий метод exit, запускающий работу программы
     * @param args аргумент командной строки
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        /**
         * создание экземпляр класса CommandChecker
         */
        CommandChecker com = new CommandChecker();
        while(true) {
            if (args.length == 1 &&
                    !args[0].equals("/dev/null") &&
                    !args[0].equals("/dev/random") &&
                    !args[0].equals("/dev/zero")) {
                com.exit(args[0]);
                break;
            } else {
                System.out.println("Введено больше одного файла или не введено вообще");
                break;
            }
        }
    }
}
