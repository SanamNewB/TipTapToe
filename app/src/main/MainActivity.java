package com.sanamshikalgar.tiptaptoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int scoreMe = 0;
    int scoreYou = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayMe(0);
        displayYou(0);
    }

    /**
     * Displays the given score for Team Me.
     */
    public void displayMe(int score) {
        TextView scoreView = (TextView) findViewById(R.id.me_score);
        scoreView.setText(String.valueOf(score));
    }

    public void randomMEtip(View view) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(5);
        scoreMe = scoreMe + randomNumber;
        displayMe(scoreMe);
    }

    public void randomMEtap(View view) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(4);
        scoreMe = scoreMe + randomNumber;
        displayMe(scoreMe);
    }

    public void randomMEtoe(View view) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);
        scoreMe = scoreMe + randomNumber;
        displayMe(scoreMe);
    }

    /**
     * Displays the given score for Team You.
     */

    public void displayYou(int score) {
        TextView scoreView = (TextView) findViewById(R.id.you_score);
        scoreView.setText(String.valueOf(score));
    }

    public void randomYOUtip(View view) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(5);
        scoreYou = scoreYou + randomNumber;
        displayYou(scoreYou);
    }

    public void randomYOUtap(View view) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(4);
        scoreYou = scoreYou + randomNumber;
        displayYou(scoreYou);
    }

    public void randomYOUtoe(View view) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);
        scoreYou = scoreYou + randomNumber;
        displayYou(scoreYou);
    }

    public void resetScore(View view) {
        scoreMe = 0;
        scoreYou = 0;
        displayMe(0);
        displayYou(0);

    }
}