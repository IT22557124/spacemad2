package com.example.spacemad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GameOver extends AppCompatActivity {

    TextView tvPoints;
    TextView tvHighScore;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);

        int points = getIntent().getIntExtra("points", 0); // Retrieve points from intent extras
        int highScore = getIntent().getIntExtra("highScore", 0); // Retrieve high score from intent extras

        tvPoints = findViewById(R.id.tvPoints);
        tvPoints.setText(getString(R.string.points, points)); // Display points

        tvHighScore = findViewById(R.id.tvHighScore); // Initialize TextView for high score
        tvHighScore.setText(getString(R.string.high_score, highScore)); // Display high score
    }

    public void restart(View view) {
        Intent intent = new Intent(GameOver.this, com.example.spacemad.StartUp.class);
        startActivity(intent);
        finish();
    }

    public void exit(View view) {
        finishAffinity();
    }


}