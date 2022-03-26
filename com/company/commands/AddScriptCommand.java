package com.company.commands;

import com.company.data.Coordinates;
import com.company.data.Flat;
import com.company.data.House;
import com.company.data.View;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class AddScriptCommand {
    static String add(Stack<Flat> st, Scanner file) throws IOException {
        String name = setName(file);
        Coordinates coordinates = setCoordinates(file);
        int area = setArea(file);
        long numberOfRooms = setNumberOfRooms(file);
        Boolean furniture = setFurniture(file);
        long timeToMetro = setTimeToMetroOnFoot(file);
        View view = setView(file);
        House house = setHouse(file);
        if (name == null ||
                coordinates == null ||
                area == -1 ||
                numberOfRooms == -1 ||
                furniture == null ||
                timeToMetro == -1 ||
                view == null ||
                house == null) {
            return "Неверно введён скрипт";
        }
        else {
            Flat f = new Flat(st.peek().getId() + 1, name, coordinates, setCreationDate(),
                    area, numberOfRooms, furniture, timeToMetro,
                    view, house);
            st.push(f);
            System.out.println("Объект добавлен в коллекцию");
            return null;
        }
    }

    static public String setName(Scanner file) throws IOException {
        String Name = file.nextLine();
        if ((Name.trim()).equals("")){
            return null;
        }
        else{
            return Name;
        }
    }
    static public Coordinates setCoordinates(Scanner file) throws IOException {
        while(true) {
            try {
                int x = file.nextInt();
                long y = file.nextLong();
                if (x>=0 && y>=0) {
                    return new Coordinates(x,y);
                }
                else{
                    System.out.println("Неверно введён скрипт");
                    break;
                }
            }
            catch (NoSuchElementException e){
                System.out.println("Неверно введён скрипт");
                break;
            }
        }
        return null;
    }
    static public ZonedDateTime setCreationDate(){
        return ZonedDateTime.now();
    }
    static public int setArea(Scanner file){
        while (true) {
            try {
                int area = file.nextInt();
                if (area>=0) {
                    return area;
                }
                else{
                    System.out.println("Неверно введён скрипт");
                    break;
                }
            }
            catch (NoSuchElementException e){
                System.out.println("Неверно введён скрипт");
                break;
            }
        }
        return -1;
    }
    static public Long setNumberOfRooms(Scanner file){
        while(true) {
            try {
                Long numberOfRooms = file.nextLong();
                if (numberOfRooms>=0) {
                    return numberOfRooms;
                }
                else{
                    System.out.println("Неверно введён скрипт");
                    break;
                }
            }
            catch (NoSuchElementException e){
                System.out.println("Неверно введён скрипт");
                break;
            }
        }
        return (long) -1;
    }
    static public Boolean setFurniture(Scanner file){
        while(true) {
            try {
                Boolean furniture = file.nextBoolean();
                return furniture;
            }
            catch (NoSuchElementException e){
                System.out.println("Неверно введён скрипт");
                break;
            }
        }
        return null;
    }
    static public Long setTimeToMetroOnFoot(Scanner file){
        while(true) {
            try {
                Long timeToMetroOnFoot = file.nextLong();
                if (timeToMetroOnFoot>=0) {
                    return timeToMetroOnFoot;
                }
                else {
                    System.out.println("Неверно введён скрипт");
                }
            }
            catch (NoSuchElementException e){
                System.out.println("Неверно введён скрипт");
                break;
            }
        }
        return (long) -1;
    }
    static public View setView(Scanner file) {
        View v = null;
        while (true) {
            try {
                String view = file.nextLine();
                view = file.nextLine();
                if (view.equals("TERRIBLE")) {
                    v = View.TERRIBLE;
                    break;
                } else if (view.equals("STREET")) {
                    v = View.STREET;
                    break;
                } else if (view.equals("BAD")) {
                    v = View.BAD;
                    break;
                } else if (view.equals("PARK")) {
                    v = View.PARK;
                    break;
                }
                return v;
            }
        catch (NoSuchElementException e){
            System.out.println("Неверно введён скрипт");
            break;
            }
        }
        return v;
    }
    static public House setHouse(Scanner file){
        while (true) {
            try {
                //Scanner houseSc = new Scanner(System.in);
                String Name = file.nextLine();
                Integer year = file.nextInt();
                Integer numberOfFlatsOnFloor = file.nextInt();
                if (year>=0 && numberOfFlatsOnFloor>=0) {
                    return new House(Name, year, numberOfFlatsOnFloor);
                }
                else{
                    System.out.println("Неверно введён скрипт");
                }
            }
            catch (NoSuchElementException e){
                System.out.println("Неверно введён скрипт");
                break;
            }
        }
        return null;
    }
}