package com.example.android.footballscorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int goalTeamA = 0;
    int goalTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;
    int yellowTeamA = 0;
    int yellowTeamB = 0;
    int redTeamA = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void resetScore(View view) {
        goalTeamA = 0;
        goalTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        yellowTeamA = 0;
        yellowTeamB = 0;
        redTeamA = 0;
        redTeamB = 0;
        displayForTeamA(goalTeamA);
        displayForTeamB(goalTeamB);
        penaltyForTeamA(penaltyTeamA);
        penaltyForTeamB(penaltyTeamB);
        yellowForTeamA(yellowTeamA);
        yellowForTeamB(yellowTeamB);
        redForTeamA(redTeamA);
        redForTeamB(redTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void penaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void yellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    public void redForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red_card);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneGoalForA(View view) {
        goalTeamA++;
        displayForTeamA(goalTeamA);
    }

    public void addOnePenForA(View view) {
        penaltyTeamA++;
        penaltyForTeamA(penaltyTeamA);
    }

    public void addOneYellowForA(View view) {
        yellowTeamA++;
        yellowForTeamA(yellowTeamA);
    }

    public void addOneRedForA(View view) {
        redTeamA++;
        redForTeamA(redTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void penaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }

    public void yellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    public void redForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red_card);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneGoalForB(View view) {
        goalTeamB++;
        displayForTeamB(goalTeamB);
    }

    public void addOnePenForB(View view) {
        penaltyTeamB++;
        penaltyForTeamB(penaltyTeamB);
    }

    public void addOneYellowForB(View view) {
        yellowTeamB++;
        yellowForTeamB(yellowTeamB);
    }

    public void addOneRedForB(View view) {
        redTeamB++;
        redForTeamB(redTeamB);
    }
}
