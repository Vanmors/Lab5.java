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
    /**
     * считывает комнаду add со скрипта
     * @param st объект коллекции Stack
     * @param file файл со скриптом
     * @throws IOException
     */
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

    /**
     * считывает и возвращает Name
     * @param file файл со скриптом
     * @return Name
     */
    static public String setName(Scanner file)  {
        String Name = file.nextLine();
        if ((Name.trim()).equals("")){
            return null;
        }
        else{
            return Name;
        }
    }
    /**
     * считывает и возвращает Coordinates
     * @param file файл со скриптом
     * @return Coordinates
     */
    static public Coordinates setCoordinates(Scanner file) {
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
    /**
     * возвращает CreationDate
     * @return CreationDate
     */
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
    /**
     * считывает и возвращает NumberOfRooms
     * @param file файл со скриптом
     * @return NumberOfRooms
     */
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
    /**
     * считывает и возвращает Furniture
     * @param file файл со скриптом
     * @return Furniture
     */
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
    /**
     * считывает и возвращает TimeToMetroOnFoot
     * @param file файл со скриптом
     * @return TimeToMetroOnFoot
     */
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
    /**
     * считывает и возвращает View
     * @param file файл со скриптом
     * @return View
     */
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
    /**
     * считывает и возвращает House
     * @param file файл со скриптом
     * @return House
     */
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