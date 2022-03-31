package com.company.commands;

import com.company.Stack.Parse;
import com.company.data.Flat;

import com.company.exception.UnknownCommandException;

import java.io.IOException;
import java.util.*;


public class CommandChecker {
    /**
     * проверяет введёные пользователем данные и вызывает нужный метод
     * @param f имя файла с коллекцией
     * @throws IOException
     */
    public void exit(String f) throws IOException {
        Parse p = new Parse();
        Stack<Flat> st = new Stack<>();
        p.parse(f, st);
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                if (!sc.hasNext()){
                    System.exit(0);
                }
                ArrayList<String> list = new ArrayList<>();
                String command = sc.nextLine();
                String[] n = command.split(" ");
                if ((command.equals("exit"))) {
                        System.exit(0);
                    } else if (command.equals("help")) {
                        HelpCommand.help();
                    } else if (command.equals("show")) {
                        ShowCommand.showString(st);
                    }
                    else if (command.equals("add")) {
                        AddCommand.add(st);
                    }
                    else if (command.equals("remove_by_id")) {
                        RemoveByIdCommand.removeById(st);
                    } else if (command.equals("clear")) {
                        ClearCommand.clear(st);
                    } else if (command.equals("average_of_number_of_rooms")) {
                        AverageOfNumberOfRooms.average(st);
                    } else if (command.equals("reorder")) {
                        ReorderCommand.reorder(st);
                    } else if (n[0].equals("execute_script")){
                        ExecuteScriptCommand.executeScript(f, n,st, list);
                    } else if(command.equals("max_by_furniture")){
                        MaxByFurnitureCommand.maxFurniture(st);
                    }
                    else if(command.equals("info")){
                        InfoCommand.info(st);
                    }
                    else if(command.equals("save")){
                        SaveCommand.save(f, st);
                    }
                    else if(command.equals("remove_all_by_house")){
                        RemoveAllByHouseCommand.removeAllByHouse(st);
                    }
                    else if(n[0].equals("update_id")){
                        try {
                            UpdateIdCommand.updateID(st, n);
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Команда введена неверно");
                        }
                    }
                    else if(n[0].equals("remove_lower")){
                    try {
                        RemoveLowerCommand.removeLower(st, n);
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("Команда введена неверно");
                    }
                    }
                    else if (command.equals("add_if_min")){
                        AddIfMinCommand.addIfMin(st);
                    }
                    else{
                        throw new UnknownCommandException(command);
                    }
                } catch (UnknownCommandException e) {
                    e.getMessage();
                }
            }
        }
}

