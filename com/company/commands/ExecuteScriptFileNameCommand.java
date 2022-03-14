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
    static public void executeScript() throws IOException {
        Parse p = new Parse();
        Stack<Flat> st = new Stack<>();
        p.parse("notes.txt", st);
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите название файла");
                String n = sc.nextLine();
                FileReader fr = new FileReader(n);
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
                            SaveCommand.save(st);
                        } else if (command.equals("remove_all_by_house")) {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
