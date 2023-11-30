package com.aknatn.emoland;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class TitleScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        TextView title = (TextView)findViewById(R.id.titleTextView);
        title.setText("Emo Land");
        ImageView titleImage = (ImageView)findViewById(R.id.titleImageView);
        titleImage.setImageResource(R.drawable.emokid2);
    }

}