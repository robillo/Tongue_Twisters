package com.firstapp.robinpc.tongue_twisters;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LEVEL1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level1);
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
        oneonealert.setMessage("Denise sees the fleece, Denise sees the fleas. At least Denise could sneeze and feed and freeze the fleas.")
                .setTitle("Level 1 TT 1").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 2
    public void TT2(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("2.\tSanta’s short suit shrunk")
                .setTitle("Level 1 TT 2").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 3
    public void TT3(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("3.\tI scream, you scream, we all scream for ice cream.")
                .setTitle("Level 1 TT 3").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 4
    public void TT4(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("4.\tSix slimy snails sailed silently.")
                .setTitle("Level 1 TT 4").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 5
    public void TT5(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("5.\tSinging Sammy Sung Songs on Sinking sands.")
                .setTitle("Level 1 TT 5").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 6
    public void TT6(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("6.\tA big black bug bit a big black dog on his big black nose.")
                .setTitle("Level 1 TT 6").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 7
    public void TT7(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("7.\tTom threw Tim three thumbtacks.")
                .setTitle("Level 1 TT 7").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 8
    public void TT8(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("8.\tYelling yellow yelping yeti.")
                .setTitle("Level 1 TT 8").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 9
    public void TT9(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("9.\tA happy hippo hopped and hiccupped.")
                .setTitle("Level 1 TT 9").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 10
    public void TT10(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("10.\tHe threw three free throws.")
                .setTitle("Level 1 TT 10").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 11
    public void TT11(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("11.\tWayne went to wales to watch walruses.")
                .setTitle("Level 1 TT 11").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 12
    public void TT12(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("12.\tI wish to wash my Irish wristwatch.")
                .setTitle("Level 1 TT 12").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 13
    public void TT13(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("13.\tOn a lazy laser raiser lies a laser ray eraser.")
                .setTitle("Level 1 TT 13").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 14
    public void TT14(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("14.\tTwo tiny tigers take two taxis to town.")
                .setTitle("Level 1 TT 14").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 15
    public void TT15(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("15.\tI see sea down by the seashore.")
                .setTitle("Level 1 TT 15").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
}
