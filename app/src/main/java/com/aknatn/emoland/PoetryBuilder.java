package com.aknatn.emoland;

import java.util.List;

public class PoetryBuilder {
    List<String> Line1Options;
    List<String> Line2Options;
    List<String> Line3Options;
    List<String> Line4Options;

    public PoetryBuilder(){
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

    public List<Integer> randLine1(){
        List<Integer> opts = null;
        int min = 0;
        int max = Line1Options.size();
        for (int i=0; opts.size() < 2; i++){
            int num = (int)(Math.random()*(max-min+1)+min);
            if(! opts.contains(num)){
                opts.add(num);
            }
        }

        return opts;
    }
}
