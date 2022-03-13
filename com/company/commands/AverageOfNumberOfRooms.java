package com.company.commands;

import com.company.data.Flat;

import java.util.ArrayList;
import java.util.Stack;

public class AverageOfNumberOfRooms {
    static public void average(Stack<Flat> st) {
        double average = 0;
        int count = 0;
        if (!st.empty()) {
            ArrayList<Flat> copyOfCollection = new ArrayList<>(st);
            for (Flat flat : copyOfCollection) {
                count += 1;
                average += flat.getNumberOfRooms();
            }
            System.out.println(average / count);
        }
    }
}
