package com.company.commands;

import com.company.data.Flat;
import com.company.exception.UnknownCommandException;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class ExecuteScriptCommand {
    /**
     * проверяет команды в скрипте и выполняет их
     * @param f имя скрипта
     * @param scr передаёт массив из названия команды и заданного числа
     * @param st объект коллекции Stack
     * @throws IOException
     */
    static public void executeScript(String f,String scr [],Stack<Flat> st) throws IOException {
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
                File file = new File(scr[1]);
                Scanner sc = new Scanner(file);
                try {
                    while (true) {
                        String command = sc.nextLine();
                        String[] n = command.split(" ");
                        if ((command.equals("exit"))) {
                            System.exit(0);
                        } else if (command.equals("help")) {
                            HelpCommand.help();
                        } else if (command.equals("show")) {
                            ShowCommand.showString(st);
                        } else if (command.equals("add")) {
                            AddScriptCommand.add(st,sc);
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
                        } else if (n[0].equals("update_id")) {
                            try {
                                UpdateIdScriptCommand.updateIdScriptCommand(st, sc, n);
                            }
                            catch (ArrayIndexOutOfBoundsException e){
                                System.out.println("Команда введена неверно");
                            }
                        } else if (n[0].equals("remove_lower")) {
                        try {
                            RemoveLowerCommand.removeLower(st, n);
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Команда введена неверно");
                        }
                        } else if (command.equals("add_if_min")) {
                            AddIfMinScriptCommand.addIfMinScriptCommand(st, sc);
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
                    break;
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
