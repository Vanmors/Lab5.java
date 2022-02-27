package com.company.commands;

import com.company.data.House;

import java.util.ArrayList;
import java.util.Stack;

public class AverageOfNumberOfRooms {
    static public void average(Stack<House> st) {
        double average = 0;
        int count = 0;
        if (!st.empty()) {
            ArrayList<House> copyOfCollection = new ArrayList<>(st);
            for (House house : copyOfCollection) {
                count += 1;
                average += house.getYear();
            }
            System.out.println(average / count);
        }
    }
}
