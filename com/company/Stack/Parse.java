package com.company.Stack;

import com.company.data.Coordinates;
import com.company.data.Flat;
import com.company.data.House;
import com.company.data.View;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Stack;
import java.time.ZonedDateTime;

public class Parse {
    String FileName;
    public void parse(String FileName, Stack<Flat> st) throws IOException {
        this.FileName = FileName;
        FileInputStream f;
        while (true) {
            try {
                f = new FileInputStream(FileName);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден или у вас нет на него прав");
                System.exit(0);
            }
        }
        int c;
        int i = 0;
        while (f.available() != 0) {
            i += 1;
//            String word = String.valueOf(i) + ",";
            String word = "";
            while ((c = f.read()) != 13 && c != -1) {

                word = word + (char) c;
                word = word.trim();

            }
            String[] words = word.split(",");
            Coordinates inputCoordinate = new Coordinates(Integer.parseInt(words[2]), Long.parseLong(words[3]));
            House house = new House(words[9], Integer.parseInt(words[10]), Integer.parseInt(words[11]));
            Flat flat = new Flat(Integer.parseInt(words[0]), words[1], inputCoordinate, ZonedDateTime.now(), Integer.parseInt(words[4]), Long.parseLong(words[5]), Boolean.valueOf(words[6]), Long.parseLong(words[7]), View.valueOf(words[8]), house);
            st.push(flat);
        }

    }
}

