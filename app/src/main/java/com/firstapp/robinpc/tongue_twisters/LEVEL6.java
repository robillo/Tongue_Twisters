package com.firstapp.robinpc.tongue_twisters;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LEVEL6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level6);
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
        oneonealert.setMessage("1.\tTommy tucker tried to tie Tammy Turtle’s tie.")
                .setTitle("Level 6 TT 1").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 2
    public void TT2(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("2.\tExcited executioner exercising his excising powers excessively.")
                .setTitle("Level 6 TT 2").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 3
    public void TT3(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("3.\tI saw Esau kissing Kate. I saw Esau, he saw me, she saw I saw Esau.")
                .setTitle("Level 6 TT 3").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 4
    public void TT4(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("4.\tSeven sleazy shysters in sharkskin suits sold sheared sealskins to seasick sailors.")
                .setTitle("Level 6 TT 4").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 5
    public void TT5(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("5.\tA gazillion gigantic grapes gushed gradually giving gophers goey guts.")
                .setTitle("Level 6 TT 5").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 6
    public void TT6(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("6.\tThe seething sea ceaseth; thus the seething sea sufficth us.")
                .setTitle("Level 6 TT 6").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 7
    public void TT7(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("7.\tBut she as far surpasseth sycorax, As a great’st does least.")
                .setTitle("Level 6 TT 7").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 8
    public void TT8(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("8.\tThe batter with the butter is the batter that is better.")
                .setTitle("Level 6 TT 8").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 9
    public void TT9(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("9.\tDon’t trouble trouble, until trouble troubles you! If you trouble trouble triple trouble troubles you.")
                .setTitle("Level 6 TT 9").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 10
    public void TT10(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("10.\tA smart fella, a fella smart. It takes a smart fella to say a fella smart.")
                .setTitle("Level 6 TT 10").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 11
    public void TT11(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("11.\tDon’t spring on the inner-spring this spring or there will be an offspring next spring.")
                .setTitle("Level 6 TT 11").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 12
    public void TT12(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("12.\tWe will learn why her lowly lone, worn yarn loom will rarely earn immoral money.")
                .setTitle("Level 6 TT 12").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 13
    public void TT13(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("13.\tA stunk sat on a stump and thunk the stump stunk, but the stump thunk the skunk stunk.")
                .setTitle("Level 6 TT 13").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 14
    public void TT14(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("14.\tLarry Hurley, a burly squirrel hurler, hurled a furry squirrel through a curly grill.")
                .setTitle("Level 6 TT 14").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 15
    public void TT15(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("15.\tI thought a thought. But the thought I thought wasn’t the thought I thought I thought. If the thought I thought I thought, had been the thought I thought, I wouldn’t have thought I thought.")
                .setTitle("Level 6 TT 15").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
}
