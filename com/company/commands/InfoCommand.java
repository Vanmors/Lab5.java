package com.company.commands;

import com.company.data.Flat;

import java.util.ArrayList;
import java.util.Stack;

public class InfoCommand {
    /**
     * выводит в стандартный поток вывода информацию о коллекции
     * @param st объект коллекции Stack
     */
    static public void info(Stack<Flat> st) {
        ArrayList<Flat> list = new ArrayList<>(st);
        java.time.ZonedDateTime initializationDate = null;
        int count = 0;
        for (Flat flat : list) {
            initializationDate = flat.getCreationDate();
            count += 1;
        }
        System.out.println("Тип коллекции: Stack" +
                "\nДата инициализации: " + initializationDate +
                "\nКоличество эллементов: "+ count);
    }
}
