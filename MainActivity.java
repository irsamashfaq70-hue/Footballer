package com.arby.footballer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulsTeamA = 0;
    private int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Increase the score for Team A by 1 point
     */
    public void addPointForTeamA(View v) {
        scoreTeamA += 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Increase the fouls number for Team A by 1
     */
    public void addFoulsForTeamA(View v) {
        foulsTeamA += 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    /**
     * Displays the given score for Team A
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls number for Team A
     */
    public void displayFoulsForTeamA(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_a_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Increase the score for Team B by 1 point
     */
    public void addPointForTeamB(View v) {
        scoreTeamB += 1;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Increase the fouls number for Team B by 1
     */
    public void addFoulsForTeamB(View v) {
        foulsTeamB += 1;
        displayFoulsForTeamB(foulsTeamB);
    }

    /**
     * Displays the given score for Team B
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the fouls number for Team B
     */
    public void displayFoulsForTeamB(int fouls) {
        TextView foulsView = (TextView) findViewById(R.id.team_b_fouls);
        foulsView.setText(String.valueOf(fouls));
    }

    /**
     * Resets the given score for Team B and Team A
     */
    public void reset(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayScoreForTeamB(scoreTeamB);
        displayScoreForTeamA(scoreTeamA);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }
}
