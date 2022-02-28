package com.company.commands;

import com.company.data.Flat;
import com.company.data.House;
import com.sun.org.apache.bcel.internal.generic.FLOAD;

import java.util.Stack;

public class ClearCommand {
    static public void clear(Stack<Flat> st){
        while(!st.empty()){
            st.pop();
        }
        System.out.println("Коллекция очистилась");
    }
}
