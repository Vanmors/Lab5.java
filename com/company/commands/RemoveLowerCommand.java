package com.company.commands;

import com.company.data.Flat;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class RemoveLowerCommand {
    static public void removeLower(Stack<Flat> st) {
        if (!st.empty()) {
            while (true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите число комнат");
                    int maxNumberOfRooms = sc.nextInt();
                    ArrayList<Flat> copyOfCollection = new ArrayList<>(st);
                    for (Flat flat : copyOfCollection) {
                        if (flat.getNumberOfRooms() < maxNumberOfRooms) {
                            st.remove(st.get(flat.getId() - 1));
                        }
                    }
                    if (maxNumberOfRooms>=0) {
                        break;
                    }
                    else{
                        System.out.println("Некорректно введённые данные");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Некорректно введены данные");
                }
            }
        }
    }
}
