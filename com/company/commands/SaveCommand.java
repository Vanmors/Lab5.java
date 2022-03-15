package com.company.commands;

import com.company.data.Flat;
import com.opencsv.CSVWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SaveCommand {
    static public void save(String f, Stack<Flat> st) throws IOException {

        List<String[]> list = creatCsvData(st);
        try (CSVWriter writer = new CSVWriter(new PrintWriter(f))) {
                writer.writeAll(list);
        System.out.println("Коллекция сохранена");
            }
        }

    private static List<String[]> creatCsvData(Stack<Flat> st) {
        ArrayList<Flat> copyOfCollection = new ArrayList<>(st);
        List<String[]> list = new ArrayList<>();
        for (Flat flat: copyOfCollection) {
            list.add(flat.toStringForSave());
        }
        return list;
    }
}

