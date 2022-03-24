package com.company.commands;

import com.company.Stack.Parse;
import com.company.data.Flat;
import com.company.exception.UnknownCommandException;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class ExecuteScriptFileNameCommand {
    static public void executeScript(String f,String n [],Stack<Flat> st) throws IOException {
//        Parse p = new Parse();
//        Stack<Flat> st = new Stack<>();
//        p.parse(f, st);
        while (true) {
            try {
                //Scanner sc = new Scanner(System.in);
                //System.out.println("Введите название файла");
//                String n = sc.nextLine();
//                String sp [] = n.split(" ");
//                FileReader fr = new FileReader(n[1]);
//                BufferedReader reader = new BufferedReader(fr);
                File file = new File(n[1]);
                Scanner sc = new Scanner(file);
                String command = sc.nextLine();
                try {
                    while (true) {
                        if ((command.equals("exit"))) {
                            System.exit(0);
                        } else if (command.equals("help")) {
                            HelpCommand.help();
                        } else if (command.equals("show")) {
                            ShowCommand.showString(st);
                        } else if (command.equals("add")) {
                            AddScriptCommand.add(st,sc);
//                            for (int i=0; i<10; i++){
//                                if (sc.hasNextLine()) {
//                                String s = sc.nextLine();}
//                            }
                        } else if (command.equals("remove_by_id")) {
                            RemoveByIdCommand.removeById(st);
                        } else if (command.equals("clear")) {
                            ClearCommand.clear(st);
                        } else if (command.equals("average_of_number_of_rooms")) {
                            AverageOfNumberOfRooms.average(st);
                        } else if (command.equals("reorder")) {
                            ReorderCommand.reorder(st);
                        } else if (command.equals("max_by_furniture")) {
                            MaxByFurnitureCommand.maxFurniture(st);
                        } else if (command.equals("info")) {
                            InfoCommand.info(st);
                        } else if (command.equals("save")) {
                            SaveCommand.save(f, st);
                        }
                    else if (command.equals("execute_script")) {
                            System.out.println("Вызовет рекурсию");
                        }else if (command.equals("remove_all_by_house")) {
                            RemoveAllByHouseCommand.removeAllByHouse(st);
                        } else if (command.equals("update_id")) {
                            UpdateIdCommand.updateID(st);
                        } else if (command.equals("remove_lower")) {
                            RemoveLowerCommand.removeLower(st);
                        } else if (command.equals("add_if_min")) {
                            AddIfMinCommand.addIfMin(st);
                        } else {
                            throw new UnknownCommandException(command);
                        }
                        if (sc.hasNextLine()) {
                            command = sc.nextLine();
                        } else {
                            break;
                        }
                    }
                    break;
                } catch (UnknownCommandException e) {
                    e.getMessage();
//                    break;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Такого файла не существует");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
