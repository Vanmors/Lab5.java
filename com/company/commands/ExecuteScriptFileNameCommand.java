package com.company.commands;

import com.company.exception.UnknownCommandException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteScriptFileNameCommand {
    static public void executeScript() {
        try {
            FileReader fr = new FileReader("script.txt");
            BufferedReader reader = new BufferedReader(fr);
            CommandChecker ch = new CommandChecker();
            String command = reader.readLine();
            while (command != null) {
                ch.exit();
                command = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnknownCommandException e) {
            e.printStackTrace();
        }
    }
}
