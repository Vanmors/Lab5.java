package com.company.Stack;

import com.company.data.House;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Stack;

public class Parse {
    String FileName;
    //public Stack<House> st = new Stack<>();
    public void parse(String FileName, Stack<House> st) throws IOException {
        this.FileName = FileName;
        FileInputStream f = new FileInputStream(FileName);
        int c;
        int i = 0;
        while (f.available() != 0) {
            i += 1;
            //String word = "\"" + String.valueOf(i) + "\",";
            String word = String.valueOf((char) f.read());
            while ((c = f.read()) != 13 && c != 10 && c != -1) {
                word = word + (char) c;

            }
            String[] words = word.split(",");
            House house = new House(words[0], Integer.parseInt(words[1]), Integer.parseInt(words[2]));
            st.push(house);
        }
        //st.pop();
        //System.out.println(st);

    }
}

