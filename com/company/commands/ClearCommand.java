package com.company.commands;

import com.company.data.Flat;

import java.util.Stack;

public class ClearCommand {
    /**
     * очищает коллекцию
     * @param st объект коллекции Stack
     */
    static public void clear(Stack<Flat> st){
        while(!st.empty()){
            st.pop();
        }
    }
}
