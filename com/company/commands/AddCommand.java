package com.company.commands;

import com.company.data.Coordinates;
import com.company.data.Flat;
import com.company.data.House;
import com.company.data.View;

import java.time.ZonedDateTime;
import java.util.Scanner;
import java.util.Stack;

public class AddCommand {
    static Scanner sc = new Scanner(System.in);
    static void add(Stack<Flat> st){
        Flat f = new Flat(setId(), setName(), setCoordinates(), setCreationDate(),
                setArea(), setNumberOfRooms(), setFurniture(), setTimeToMetroOnFoot(),
                setView(), setHouse());
        st.push(f);
        System.out.println("Объект добавлен в коллекцию");
    }
    static public int setId(){
        System.out.println("id");
        int id = 3;
        return id;
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
        System.out.println("Введите view: TERRIBLE, STREET, BAD, PARK");
        String view = sc.next();
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
