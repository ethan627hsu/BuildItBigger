package com.udacity.gradle.builditbigger.jokedisplaylib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplay extends AppCompatActivity {

    public static final String EXTRA_JOKE_DATA = "joke_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        String jokeString = getIntent().getStringExtra(EXTRA_JOKE_DATA);
        if(jokeString == null){
            jokeString = "";
        }
        TextView jokeText = findViewById(R.id.joke_text);
        jokeText.setText(jokeString);
    }
}
