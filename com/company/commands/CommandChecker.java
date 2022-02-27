package com.company.commands;

import com.company.Stack.Parse;
import com.company.data.House;
import com.company.exception.UnknownCommandException;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class CommandChecker  {
    Scanner sc = new Scanner(System.in);
    public void exit() throws UnknownCommandException, IOException {
        Parse p =  new Parse();
        Stack<House> st = new Stack<>();
        p.parse("notes.txt", st);
        while (true) {
            String command = sc.nextLine();
                if (command.equals("exit")){
                    System.exit(0);
                }
                else if(command.equals("help")){
                    HelpCommand.help();
                }
                else if(command.equals("show")){
                    ShowCommand.showString(st);
                }
                else if(command.equals("add")){
                    AddCommand.add(st);
                }
                else if(command.equals("remove_by_id")){
                    RemoveByIdCommand.removeById(st);
                }
                else if(command.equals("clear")){
                    ClearCommand.clear(st);
                }
                else if(command.equals("average_of_number_of_rooms")){
                    AverageOfNumberOfRooms.average(st);
                }
                else if(command.equals("reorder")){
                    Reorder.reorder(st);
                }
                else{
                    throw new UnknownCommandException(command);
                    //command = sc.nextLine();
                }
        }
    }
}
