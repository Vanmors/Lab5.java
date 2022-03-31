package com.company.commands;

import com.company.data.Flat;
import java.util.ArrayList;
import java.util.Stack;

public class ShowCommand {
    /**
     * выводит в стандартный поток вывода все элементы коллекции в строковом представлении
     * @param st объект коллекции Stack
     */
    static public void showString(Stack<Flat> st) {
        if (!st.empty()){
            ArrayList<Flat> copyOfCollection = new ArrayList<>(st);
            for(Flat flat:copyOfCollection) {
                System.out.println(flat.toString() + "\n============");
            }
        }
        else{
            System.out.println("Коллекция пустая");
        }
    }
}

