package com.aknatn.emoland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity {
    ImageView image;
    TextView text;
    Button button1, button2, button3, button4;
    Story story = new Story(this);
    int numFollowers;
    int minutesMoped;
    TextView numFollowersText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        image = (ImageView) findViewById(R.id.gameImageView);
        text = (TextView) findViewById(R.id.gameTextView);
        numFollowersText = (TextView) findViewById(R.id.followersTextView);
        button1 = (Button) findViewById(R.id.choiceButton1);
        button2 = (Button) findViewById(R.id.choiceButton2);
        button3 = (Button) findViewById(R.id.choiceButton3);
        button4 = (Button) findViewById(R.id.choiceButton4);

        story.startingPoint();
        updateFollowers(0);
    }
    public void button1(View view){
        story.selectPosition(story.nextPosition1);
    }

    public void button2(View view){
        story.selectPosition(story.nextPosition2);
    }

    public void button3(View view){
        story.selectPosition(story.nextPosition3);
    }

    public void button4(View view){
        story.selectPosition(story.nextPosition4);
    }

    public void goTitleScreen(){
        Intent ts = new Intent(this, TitleScreen.class);
        startActivity(ts);
    }

    public void updateFollowers(int newFollowers){
        numFollowers += newFollowers;
        numFollowersText.setText(numFollowers + " followers. Minutes moped: " + minutesMoped + ".");
    }
}