package com.example.android.courtcounter;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    int scoreb;
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void addThreeForTeamA(View view){
        score+=3;
        display(score);
        displayResult("");
    }
    public void addTwoForTeamA(View view){
        score+=2;
        display(score);
        displayResult("");
    }
    public void addOneForTeamA(View view){
        score+=1;
        display(score);
        displayResult("");
    }
    public void display (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamB(View view){
        scoreb+=3;
        displayb(scoreb);
        displayResult("");
    }
    public void addTwoForTeamB(View view){
        scoreb+=2;
        displayb(scoreb);
        displayResult("");
    }
    public void addOneForTeamB(View view){
        scoreb+=1;
        displayb(scoreb);
        displayResult("");
    }
    public void displayb(int number){
        TextView countViewer = (TextView)findViewById(R.id.team_b_score);
        countViewer.setText(""+ number);
    }


    public void result(View view) {
        if(score>scoreb){
            displayResult("Yaayy!! Team A Won");
        }
        else if(scoreb>score){
            displayResult("Wohoo!! Team B Won");
        }
        else if(score == scoreb){
            displayResult("Match Tied!!");
        }
    }

    public void displayResult(String message){
        TextView countViewer = (TextView)findViewById(R.id.resultText);
        countViewer.setText(""+ message);
    }

    public void reset(View view)
    {
        score=0;
        scoreb=0;
        display(score);
        displayb(scoreb);
        displayResult("");
    }
}