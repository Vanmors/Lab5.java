package com.company.commands;

import com.company.data.House;

import java.util.ArrayList;
import java.util.Stack;

public class Reorder {
    static public void reorder(Stack<House> st) {
        ArrayList<House> list = new ArrayList<>(st);
        ClearCommand.clear(st);
        int i;
        while(!list.isEmpty()){
            i = list.size()-1;
            st.push(list.get(i));
            list.remove(i);
        }
    }
}
