package com.aknatn.emoland;

import java.util.ArrayList;
import java.util.List;

public class PoetryBuilder {
    List<String> Line1Options;
    List<String> Line2Options;
    List<String> Line3Options;
    List<String> Line4Options;

    public PoetryBuilder(){
        Line1Options = new ArrayList<>();
        Line2Options = new ArrayList<>();
        Line3Options = new ArrayList<>();
        Line4Options = new ArrayList<>();
        Line1Options.add("This is the start 1");
        Line1Options.add("This is the start 2");
        Line1Options.add("This is the start 3");
        Line1Options.add("This is the start 4");
        Line2Options.add("This is line 2, 1");
        Line2Options.add("This is line 2, 2");
        Line2Options.add("This is line 2, 3");
        Line2Options.add("This is line 2, 4");
        Line3Options.add("This is line 3, 1");
        Line3Options.add("This is line 3, 2");
        Line3Options.add("This is line 3, 3");
        Line3Options.add("This is line 3, 4");
        Line4Options.add("This is the end, 1");
        Line4Options.add("This is the end, 2");
        Line4Options.add("This is the end, 3");
        Line4Options.add("This is the end, 4");
    }

    public String GeneratePoem(){
        String str = "";
        int min = 0;
        int max = 4;
        str = Line1Options.get((int)(Math.random()*(max-min)+min));
        str += "\n"  + Line2Options.get((int)(Math.random()*(max-min)+min));
        str += "\n"  + Line3Options.get((int)(Math.random()*(max-min)+min));
        str += "\n"  + Line4Options.get((int)(Math.random()*(max-min)+min));

        return str;
    }
}
