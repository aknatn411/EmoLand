package com.aknatn.emoland;

import java.util.List;

public class PoetryBuilder {
    List<String> Line1Options;
    List<String> Line2Options;
    List<String> Line3Options;
    List<String> Line4Options;

    public PoetryBuilder(){
        Line1Options.add("This is the start");
        Line2Options.add("This is line 2");
        Line3Options.add("This is line 3");
        Line4Options.add("This is the end");
    }
}
