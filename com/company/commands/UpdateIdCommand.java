package com.company.commands;

import com.company.data.Coordinates;
import com.company.data.Flat;
import com.company.data.House;
import com.company.data.View;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class UpdateIdCommand {
    static Scanner sc = new Scanner(System.in);
    static public void updateID(Stack<Flat> st) {
        System.out.println("Введите id");
        int id = sc.nextInt();
        Flat f = new Flat(id, setName(), setCoordinates(), setCreationDate(),
                setArea(), setNumberOfRooms(), setFurniture(), setTimeToMetroOnFoot(),
                setView(), setHouse());
        ArrayList<Flat> list = new ArrayList<>(st);
        list.set(id-1, f);
        while (!st.empty()){
            st.pop();
        }
        for(Flat flat: list){
            st.push(flat);
            System.out.println(flat);
        }
    }
    static public String setName(){
        System.out.println("Введите Name");
        String Name = sc.nextLine();
        return Name;
    }
    static public Coordinates setCoordinates() {
        System.out.println("Введите Coordinate X");
        int x = sc.nextInt();
        System.out.println("Введите Coordinate Y");
        long y = sc.nextLong();
        Coordinates cor = new Coordinates(x,y);
        return cor;
    }
    static public ZonedDateTime setCreationDate(){
        return ZonedDateTime.now();
    }
    static public int setArea(){
        System.out.println("Введите area");
        int area = sc.nextInt();
        return area;
    }
    static public Long setNumberOfRooms(){
        System.out.println("Введите number of rooms");
        Long numberOfRooms = sc.nextLong();
        return numberOfRooms;
    }
    static public Boolean setFurniture(){
        System.out.println("Введите furniture");
        Boolean furniture = sc.nextBoolean();
        return furniture;
    }
    static public Long setTimeToMetroOnFoot(){
        System.out.println("Введите time to metro on foot");
        Long timeToMetroOnFoot = sc.nextLong();
        return timeToMetroOnFoot;
    }
    static public View setView() {
        System.out.println("Введите view");
        String view = sc.nextLine();
        View v = null;
        if (view == "TERRIBLE"){
            v = View.TERRIBLE;
        }
        else if (view == "STREET"){
            v = View.STREET;
        }
        else if (view == "BAD"){
            v = View.BAD;
        }
        else if (view == "PARK"){
            v = View.PARK;
        }
        return v;
    }
    static public House setHouse(){
        System.out.println("Введите name of house");
        String Name = sc.nextLine();
        System.out.println("Введите year of house");
        Integer year = sc.nextInt();
        System.out.println("Введите number of flats on floor");
        Integer numberOfFlatsOnFloor = sc.nextInt();
        House house = new House(Name,year,numberOfFlatsOnFloor);
        return house;
    }
}
