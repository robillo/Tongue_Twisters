package com.firstapp.robinpc.tongue_twisters;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LEVEL5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level5);
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
        oneonealert.setMessage("1.\tHow many berries could a bare berry carry, if a bare berry could carry berries? Well they can’t carry berries but a bare berry carried is more scary.")
                .setTitle("Level 5 TT 1").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 2
    public void TT2(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("2.\tFresh French fried fly fritters.")
                .setTitle("Level 5 TT 2").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 3
    public void TT3(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("3.\tChester Cheetah chews a chunk of cheap cheddar cheese.")
                .setTitle("Level 5 TT 3").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 4
    public void TT4(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("4.\tYally Bally had a jolly golliwog. Feeling folly, Yally Bally Bought his jolly golli’ a dollie made of holly! The golli’, feeling jolly named the holly dollie, Polly. Yally Bally’s jolly golli’s holly dollie Polly’s also jolly!")
                .setTitle("Level 5 TT 4").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 5
    public void TT5(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("5.\tPail of ale aiding ailing Al’s Travalis.")
                .setTitle("Level 5 TT 5").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 6
    public void TT6(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("6.\tI eat eel while you peel eel.")
                .setTitle("Level 5 TT 6").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 7
    public void TT7(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("7.\tIf you understand, say “understand”. But if you don’t understand, say “don’t understand”. But if you understand and say “don’t understand”. How do I understand that you understand. Understand!")
                .setTitle("Level 5 TT 7").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 8
    public void TT8(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("8.\tLove’s a feeling you feel when you feel you’re going to feel the feeling you’ve never felt before.")
                .setTitle("Level 5 TT 8").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 9
    public void TT9(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("9.\tA pessimistic pest exists amidst us.")
                .setTitle("Level 5 TT 9").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 10
    public void TT10(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("10.\tHow much myrtle would a wood turtle hurdle if a would turtle could hurdle myrtle? – A wood turtle would hurdle as much myrtle as a wood turtle could hurdle if a wood turtle could hurdle myrtle.")
                .setTitle("Level 5 TT 10").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 11
    public void TT11(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("11.\tShut up the shutters and sit in the shop.")
                .setTitle("Level 5 TT 11").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 12
    public void TT12(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("12.\tA black bloke’s back brake-block broke.")
                .setTitle("Level 5 TT 12").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 13
    public void TT13(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("13.\t Come, come stay calm, stay calm, no need for alarm, it only hums, it doesn’t harm.")
                .setTitle("Level 5 TT 13").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 14
    public void TT14(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("14.\tWhile we were walking, we were watching window washers wash washington’s windows with warm washing water.")
                .setTitle("Level 5 TT 14").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
    // DIALOG FOR TT NUMBER 15
    public void TT15(View view)
    {
        AlertDialog.Builder oneonealert=new AlertDialog.Builder(this);
        oneonealert.setMessage("15.\tMr. See owned a saw and Mr. Soar owned a seasaw. Now See’s saw sawed Soar’ seesaw before soar saw see.")
                .setTitle("Level 5 TT 15").setIcon(R.drawable.dialog).create();
        oneonealert.show();
    }
}
