package com.firstapp.robinpc.tongue_twisters;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LEVEL2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Master this app, Master your pronunciation skills!", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });
    }

    // DIALOG FOR TT NUMBER 1
    public void TT1(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("1.\tHow can a clam cram in a clean cream can?")
                .setTitle("Level 2 TT 1").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 2
    public void TT2(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("2.\tSend toast to ten tense stout saints’ ten tall tents.")
                .setTitle("Level 2 TT 2").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 3
    public void TT3(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("3.\tRobillo ran rings around the roman ruins.")
                .setTitle("Level 2 TT 3").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 4
    public void TT4(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("4.\tSix sick hicks nick six slick bricks with pricks and sticks.")
                .setTitle("Level 2 TT 4").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 5
    public void TT5(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("5.\tOne-one was a race horse, two-two was one too. One-one won a race. Two-two won one too.")
                .setTitle("Level 2 TT 5").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 6
    public void TT6(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("6.\tPickford’s packers packed a packet of crisps.")
                .setTitle("Level 2 TT 6").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 7
    public void TT7(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("7.\tGobbling gorgoyles gobbled gobbling gobblings.")
                .setTitle("Level 2 TT 7").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 8
    public void TT8(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("8.\tMr. tongue twister tried to train his tongue to twist and turn, and twit and twat, to learn the letter “T”.")
                .setTitle("Level 2 TT 8").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 9
    public void TT9(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("9.\tShe saw Sherif’s shoes on the sofa. She was sure she saw Sherif’s shoes on the sofa.")
                .setTitle("Level 2 TT 9").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 10
    public void TT10(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("10.\tBirdie birdie in the sky laid a turdie in my eye, If cows could fly I’d have a cow pie in my eye.")
                .setTitle("Level 2 TT 10").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 11
    public void TT11(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("11.\tFour furious friends fought for the phone.")
                .setTitle("Level 2 TT 11").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 12
    public void TT12(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("12.\tAs I was in Arkansas I saw a saw that could outsaw any saw I ever saw. If you happen to see a saw that could outsaw the saw I saw, I’d like to see the saw you saw.")
                .setTitle("Level 2 TT 12").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 13
    public void TT13(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("13.\tI thought, I thought of thinking of thanking you.")
                .setTitle("Level 2 TT 13").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 14
    public void TT14(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("14.\tThe great greek grape growers grow great greek grapes.")
                .setTitle("Level 2 TT 14").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 15
    public void TT15(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("15.\tSounding by sounds is a sound method of sounding sounds.")
                .setTitle("Level 2 TT 15").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
}
