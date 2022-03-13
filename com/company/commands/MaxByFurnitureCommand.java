package com.company.commands;

import com.company.data.Flat;

import java.util.ArrayList;
import java.util.Stack;

public class MaxByFurnitureCommand {
    static public void maxFurniture(Stack<Flat> st) {
        if (!st.empty()) {
            ArrayList<Flat> copyOfCollection = new ArrayList<>(st);
            for (Flat flat : copyOfCollection) {
                if (flat.getFurniture()) {
                    System.out.println(flat);
                    break;
                }
            }
        }
    }
}
