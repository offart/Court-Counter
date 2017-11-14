package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import static com.example.android.courtcounter.R.id.durant_asists_counter;
import static com.example.android.courtcounter.R.id.durant_point_counter;
import static com.example.android.courtcounter.R.id.durant_rebound_counter;
import static com.example.android.courtcounter.R.id.lebron_asist_counter;
import static com.example.android.courtcounter.R.id.lebron_point_counter;
import static com.example.android.courtcounter.R.id.lebron_rebound_counter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    // @parm lebronScore = int variable
    // @parm lebronPoints = button onClick
    // @parm lebron_point_counter = text id

    int lebronScore = 0;
    int durtantScore = 0;
    /**
     * Increase the score for lebron by 1 point.
     */
    public void lebronPoints(View v) {
        lebronScore = lebronScore + 1;
        displayForLebronPointM(lebronScore);
    }

    /**
     * Displays the given score for lebron.
     */
    public void displayForLebronPointM(int score) {
        TextView scoreView = (TextView) findViewById(lebron_point_counter);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for durant by 1 point.
     */
    public void durantPoints(View v) {
        durtantScore = durtantScore + 1;
        displayForDurantPointM(durtantScore);
    }

    /**
     * Displays the given score for durant.
     */
    public void displayForDurantPointM(int score) {
        TextView scoreView = (TextView) findViewById(durant_point_counter);
        scoreView.setText(String.valueOf(score));
    }

    // @parm lebronReboundsMade = int variable
    // @parm lebronRebounds = button onClick
    // @parm lebron_rebound_counter = text id

    int lebronReboundsMade = 0;
    int durantReboundsMade = 0;

    /**
     * Increase the rebounds for lebron
     */
    public void lebronRebounds(View v) {
        lebronReboundsMade = lebronReboundsMade + 1;
        displayForLebronReboundM(lebronReboundsMade);
    }

    /**
     * Displays the given rebounds for lebron.
     */
    public void displayForLebronReboundM(int score) {
        TextView scoreView = (TextView) findViewById(lebron_rebound_counter);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the rebounds for durant
     */
    public void durantRebounds(View v) {
        durantReboundsMade = durantReboundsMade + 1;
        displayForDurantReboundsM(durantReboundsMade);
    }

    /**
     * Displays the given rebounds for durant.
     */
    public void displayForDurantReboundsM(int score) {
        TextView scoreView = (TextView) findViewById(durant_rebound_counter);
        scoreView.setText(String.valueOf(score));
    }

    // @parm lebroAsistsMade = int variable
    // @parm lebronAsists = button onClick
    // @parm lebron_asist_counter = text id

    int lebroAsistsMade = 0;
    int durantAsistsMade = 0;
    /**
     * Increase the asists for lebron
     */
    public void lebronAsists(View v) {
        lebroAsistsMade = lebroAsistsMade + 1;
        displayForLebronAsistsM(lebroAsistsMade);
    }

    /**
     * Displays the given asists for lebron.
     */
    public void displayForLebronAsistsM(int score) {
        TextView scoreView = (TextView) findViewById(lebron_asist_counter);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the asists for durant
     */
    public void durantAsists(View v) {
        durantAsistsMade = durantAsistsMade + 1;
        displayForDurantAsistsM(durantAsistsMade);
    }

    /**
     * Displays the given asists for durant.
     */
    public void displayForDurantAsistsM(int score) {
        TextView scoreView = (TextView) findViewById(durant_asists_counter);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * set the reset button for all artibutes to 0
    */
    public void reset(View V) {
        lebronScore = 0;
        durtantScore = 0;
        lebronReboundsMade = 0;
        durantReboundsMade = 0;
        lebroAsistsMade = 0;
        durantAsistsMade = 0;
        displayForLebronPointM(lebronScore);
        displayForDurantPointM(durtantScore);
        displayForLebronReboundM(lebronReboundsMade);
        displayForDurantReboundsM(durantReboundsMade);
        displayForLebronAsistsM(lebroAsistsMade);
        displayForDurantAsistsM(durantAsistsMade);
    }
}