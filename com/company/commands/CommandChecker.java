package com.company.commands;

import com.company.Stack.Parse;
import com.company.data.Flat;

import com.company.exception.UnknownCommandException;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class CommandChecker {
    public void exit(String f) throws UnknownCommandException, IOException {
        Parse p = new Parse();
        Stack<Flat> st = new Stack<>();
        p.parse(f, st);
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                if (!sc.hasNext()){
                    System.exit(0);
                }
                String command = sc.nextLine();
                String n [] = command.split(" ");
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
                        ExecuteScriptFileNameCommand.executeScript(f, n);
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
                    else if(command.equals("update_id")){
                        UpdateIdCommand.updateID(st);
                    }
                    else if(command.equals("remove_lower")){
                        RemoveLowerCommand.removeLower(st);
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

