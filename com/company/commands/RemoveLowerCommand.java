package com.company.commands;

import com.company.data.Flat;
import com.company.exception.InvalidDataException;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class RemoveLowerCommand {
    static public void removeLower(Stack<Flat> st) {
        Scanner sc = new Scanner(System.in);
        if (!st.empty()) {
            System.out.println("Введите число комнат");
//            try {
                int maxNumberOfRooms = sc.nextInt();
                ArrayList<Flat> copyOfCollection = new ArrayList<>(st);
                for (Flat flat : copyOfCollection) {
                    if (flat.getNumberOfRooms() < maxNumberOfRooms) {
                        st.remove(st.get(flat.getId() - 1));
                    }
                }
//            }
//            catch (InvalidDataException e){
//                throw new InvalidDataException();
//                e.getMessage();
//            }
        }
    }
}
