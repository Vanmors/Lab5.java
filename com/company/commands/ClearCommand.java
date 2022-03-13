package com.company.commands;

import com.company.data.Flat;

import java.util.Stack;

public class ClearCommand {
    static public void clear(Stack<Flat> st){
        while(!st.empty()){
            st.pop();
        }
        System.out.println("Коллекция очистилась");
    }
}
