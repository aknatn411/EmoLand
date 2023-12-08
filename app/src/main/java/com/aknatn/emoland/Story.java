package com.aknatn.emoland;

import android.view.View;

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
        }
    }

    public void showAllButtons() {
        gs.button1.setVisibility(View.VISIBLE);
        gs.button2.setVisibility(View.VISIBLE);
        gs.button3.setVisibility(View.VISIBLE);
        gs.button4.setVisibility(View.VISIBLE);
    }

    public void startingPoint() {
        gs.image.setImageResource(R.drawable.emokid2);
        gs.text.setText("You are in your room.");

        gs.button1.setText("Mope");
        gs.button2.setText("Cut Yourself");
        gs.button3.setText("Leave Room");
        gs.button4.setText("");

        nextPosition1 = "mope";
        nextPosition2 = "cutself";
        nextPosition3 = "leave";
        //nextPosition4 = "sign";
        showAllButtons();
        gs.button4.setVisibility(View.INVISIBLE);
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

        gs.button1.setText("Instagram");
        gs.button2.setText("");
        gs.button3.setText("");
        gs.button4.setText("");
        gs.button2.setVisibility(View.INVISIBLE);
        gs.button3.setVisibility(View.INVISIBLE);
        gs.button4.setVisibility(View.INVISIBLE);

        nextPosition1 = "post";
        nextPosition2 = "";
        nextPosition3 = "";
        nextPosition4 = "";
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

        nextPosition1 = "startingPoint";
        nextPosition2 = "startingPoint";
        nextPosition3 = "startingPoint";
        nextPosition4 = "";
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
