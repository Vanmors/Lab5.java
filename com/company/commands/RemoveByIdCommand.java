package com.company.commands;

import com.company.data.Flat;
import com.company.data.House;
import com.company.exception.UnknownCommandException;

import java.util.Scanner;
import java.util.Stack;

public class RemoveByIdCommand {
    static Scanner sc = new Scanner(System.in);
    static public void removeById(Stack<Flat> st)  {
        System.out.println("Введите id элемента, который хотите удалить");
        int k = sc.nextInt();
        st.remove(st.get(k-1));
        System.out.println("Элемент удалён");
    }
}
