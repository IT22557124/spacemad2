package com.example.spacemad;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartUp extends AppCompatActivity {

    TextView tvHighScore;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startup);

        // Initialize TextView for high score
        tvHighScore = findViewById(R.id.tvHighScore);

        // Retrieve the high score from SharedPreferences
        int highScore = getHighScore();

        // Update the TextView to display the high score
        tvHighScore.setText(getString(R.string.high_score, highScore));
    }

    // Method to retrieve high score from SharedPreferences
    private int getHighScore() {
        SharedPreferences prefs = getSharedPreferences("HighScorePrefs", MODE_PRIVATE);
        return prefs.getInt("highScore", 0); // Default value is 0
    }

    public void startGame(View v) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


}