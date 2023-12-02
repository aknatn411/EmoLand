package com.aknatn.emoland;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        Button startB = (Button)findViewById(R.id.startButton);

        TextView title = (TextView)findViewById(R.id.titleTextView);
        title.setText("Emo Land");
        ImageView titleImage = (ImageView)findViewById(R.id.titleImageView);
        titleImage.setImageResource(R.drawable.emokid2);
    }
    public void goGameScreen(View view){
        Intent gameScreen = new Intent(this, GameScreen.class);
        startActivity(gameScreen);
    }
}