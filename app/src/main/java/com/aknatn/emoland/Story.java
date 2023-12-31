package com.aknatn.emoland;

import android.view.View;

import java.util.List;

public class Story {
    GameScreen gs;
    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
    boolean masterSword = false;
    boolean killedPlant = false;
    public Story(GameScreen gs){
        this.gs = gs;
    }
    public void selectPosition(String position){
        switch(position){
            case "startingPoint": startingPoint(); break;
            case "goTitleScreen": gs.goTitleScreen(); break;
            case "leave": leave(); break;
            case "mope": mope(); break;
            case "mope5min": mope5min();  break;
            case "mope1hour": mope1hour();  break;
            case "cutself": cutself(); break;
            case "ouch": ouch(); break;
            case "post": post(); break;
            case "posted": posted(); break;
            case "poetry": poetry(); break;
        }
    }

    public void showAllButtons() {
        gs.button1.setVisibility(View.VISIBLE);
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.VISIBLE);
    }

    public void startingPoint() {
        gs.image.setImageResource(R.drawable.newemoroom);
        gs.text.setText("You are in your room.");

        gs.button1.setText("Mope");
        gs.button2.setText("Cut Yourself");
        gs.button3.setText("Leave Room");
        gs.button4.setText("Write Poetry");

        nextPosition1 = "mope";
        nextPosition2 = "cutself";
        nextPosition3 = "leave";
        nextPosition4 = "poetry";
        showAllButtons();
        if(gs.minutesMoped > 240){
            gs.text.setText("You are in your room. You have now moped enough to write poetry.");
            gs.button4.setVisibility(View.VISIBLE);
        }else{
            gs.button4.setVisibility(View.INVISIBLE);
        }
    }

    public void poetry() {
        gs.image.setImageResource(R.drawable.think);

        PoetryBuilder pb = new PoetryBuilder();
        String poem = pb.GeneratePoem();
        gs.text.setText(poem);
        gs.button1.setText("Post to Y");
        gs.button2.setText("Post to ProfileBook");
        gs.button3.setText("Post to QuickPhotoGram");
        gs.button4.setText("Post to Jizzle");

        nextPosition1 = "posted";
        nextPosition2 = "posted";
        nextPosition3 = "posted";
        nextPosition4 = "posted";
        showAllButtons();
    }

    public void cutself(){
        gs.image.setImageResource(R.drawable.think);
        gs.text.setText("How deep do you want to cut yourself?");

        gs.button1.setText("Just enough to show");
        gs.button2.setText("Deep enough to scar");
        gs.button3.setText("Deep enough to stop the pain");
        gs.button4.setText("");
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "ouch";
        nextPosition2 = "ouch";
        nextPosition3 = "ouch";
        nextPosition4 = "";
    }

    public void ouch() {
        gs.image.setImageResource(R.drawable.cutpalm);
        gs.text.setText("\"Ouch!\"\nYou cut yourself (there is a little blood visible on the  scratch). Where do you want to post the photo?");

        gs.button1.setText("Y (Formerly known as Twattle)");
        gs.button2.setText("ProfileBook");
        gs.button3.setText("QuickPhotoGram");
        gs.button4.setText("Jizzle");
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.VISIBLE);

        nextPosition1 = "post";
        nextPosition2 = "post";
        nextPosition3 = "post";
        nextPosition4 = "post";
    }

    public void post() {
        gs.image.setImageResource(R.drawable.think);
        gs.text.setText("What should the caption be?");

        gs.button1.setText("This is the only way I can feel anything!");
        gs.button2.setText("I hurt more on the inside.");
        gs.button3.setText("I don't need your attention.");
        gs.button4.setText("");
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "posted";
        nextPosition2 = "posted";
        nextPosition3 = "posted";
        nextPosition4 = "";
    }

    public void posted() {
        int min = 1;
        int max = 5;
        int num = (int)(Math.random()*(max-min+1)+min);
        gs.updateFollowers(num);
        selectPosition("startingPoint");
    }

    public void mope(){
        gs.image.setImageResource(R.drawable.think);
        gs.text.setText("How long do you want to mope?");

        gs.button1.setText("5 Minutes");
        gs.button2.setText("1 Hour");
        gs.button3.setText("Mope Later");
        gs.button4.setText("");
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "mope5min";
        nextPosition2 = "mope1hour";
        nextPosition3 = "startingPoint";
        nextPosition4 = "";
    }

    public void mope5min(){
        gs.image.setImageResource(R.drawable.think);
        gs.text.setText("5 minutes later....\n\nI'm bored...\n\nContinue to mope?");

        gs.minutesMoped += 5;
        gs.updateFollowers(0);

        gs.button1.setText("Yes");
        gs.button2.setText("No");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "mope";
        nextPosition2 = "startingPoint";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void mope1hour(){
        gs.image.setImageResource(R.drawable.think);
        gs.text.setText("1 hour later....\n\nI'm bored...\n\nContinue to mope?");

        gs.minutesMoped += 60;
        gs.updateFollowers(0);

        gs.button1.setText("Yes");
        gs.button2.setText("No");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "mope";
        nextPosition2 = "startingPoint";
        nextPosition3 = "";
        nextPosition4 = "";
    }

    public void leave(){
        gs.image.setImageResource(R.drawable.think);
        gs.text.setText("Nah, I have stuff to do in here.");

        gs.button1.setText("Back");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "startingPoint";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
    }
}
