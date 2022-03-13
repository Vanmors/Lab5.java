package com.company.commands;

import com.company.data.Flat;

import java.util.ArrayList;
import java.util.Stack;

public class ReorderCommand {
    static public void reorder(Stack<Flat> st) {
        ArrayList<Flat> list = new ArrayList<>(st);
        ClearCommand.clear(st);
        int i;
        while(!list.isEmpty()){
            i = list.size()-1;
            st.push(list.get(i));
            list.remove(i);
        }
    }
}
