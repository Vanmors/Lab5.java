package com.company.commands;

import com.company.data.House;

import java.util.Scanner;
import java.util.Stack;

public class AddCommand {
    static Scanner sc = new Scanner(System.in);
    static void add(Stack<House> st){
        House h = new House(setName(), setAge(), setNumberOfFlatsOnFloor());
        st.push(h);
        System.out.println("Объект добавлен в коллекцию");
        }
    static public String setName(){
        System.out.println("Введите Name");
        String Name = sc.nextLine();
        return Name;
    }
    static public int setAge(){
        System.out.println("Введите age");
        int age = sc.nextInt();
        return age;
    }
    static public int setNumberOfFlatsOnFloor(){
        System.out.println("Введите numberOfFlatsOnFloor");
        int numberOfFlatsOnFloor = sc.nextInt();
        return numberOfFlatsOnFloor;
    }
}
