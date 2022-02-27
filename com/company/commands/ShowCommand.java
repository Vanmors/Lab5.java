package com.company.commands;

import com.company.Stack.Parse;
import com.company.data.House;

import java.io.Console;
import java.util.ArrayList;
import java.util.Stack;

public class ShowCommand {

    static public void showString(Stack<House> st) {
        if (!st.empty()){
            ArrayList<House> copyOfCollection = new ArrayList<>(st);
            for(House house:copyOfCollection) {
            System.out.println(house.toString() + "\n============");
        }
        }
        else{
            System.out.println("Коллекция пустая");
        }
    }
}

