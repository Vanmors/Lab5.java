package com.company.commands;

import com.company.Stack.Parse;
import com.company.data.Flat;
import com.company.exception.UnknownCommandException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ExecuteScriptFileNameCommand {
    static public void executeScript(String f,String n []) throws IOException {
        Parse p = new Parse();
        Stack<Flat> st = new Stack<>();
        p.parse(f, st);
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                //System.out.println("Введите название файла");
//                String n = sc.nextLine();
//                String sp [] = n.split(" ");
                FileReader fr = new FileReader(n[1]);
                BufferedReader reader = new BufferedReader(fr);
                String command = reader.readLine();
                try {
                    while (command != null) {
                        if ((command.equals("exit"))) {
                            System.exit(0);
                        } else if (command.equals("help")) {
                            HelpCommand.help();
                        } else if (command.equals("show")) {
                            ShowCommand.showString(st);
                        } else if (command.equals("add")) {
                            AddCommand.add(st);
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
                        command = reader.readLine();
                    }
                    break;
                } catch (UnknownCommandException e) {
                    e.getMessage();
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
