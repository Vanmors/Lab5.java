package com.company.commands;

import com.company.data.House;

import java.util.Stack;

public class ClearCommand {
    static public void clear(Stack<House> st){
        while(!st.empty()){
            st.pop();
        }
        System.out.println("Коллекция очистилась");
    }
}
