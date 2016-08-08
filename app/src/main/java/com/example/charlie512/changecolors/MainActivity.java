package com.example.charlie512.changecolors;

import android.graphics.Color;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {



    LinearLayout background;
    Button btnGreen;
    Button btnBlue;
    Button btnYellow;
    Button btnRed;
    Button btnPurple;
    Button btnRestart;

    private final String TAG = "TKT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (LinearLayout) findViewById(R.id.background);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        btnBlue = (Button) findViewById(R.id.btnBlue);
        btnYellow = (Button) findViewById(R.id.btnYellow);
        btnRed = (Button) findViewById(R.id.btnRed);
        btnPurple = (Button) findViewById(R.id.btnPurple);
        btnRestart = (Button) findViewById(R.id.btnRestart);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click button code turns green
                background.setBackgroundColor(Color.parseColor("#0dc75d"));

            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click button code turns yellow
                background.setBackgroundColor(Color.parseColor("#c7b80d"));

            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click button code turns blue
                background.setBackgroundColor(Color.parseColor("#006699"));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click button code turns red
                background.setBackgroundColor(Color.parseColor("#991815"));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click button code turns red
                background.setBackgroundColor(Color.parseColor("#991815"));
            }
        });

        btnPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click button code turns red
                background.setBackgroundColor(Color.parseColor("#6c1499"));
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //on click button code turns red
                background.setBackgroundColor(Color.parseColor("#343434"));
            }
        });

    }





    /* (non-Javadoc)
    * @see android.app.Activity#onDestroy()
    */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "On Destroy .....");
    }
    /* (non-Javadoc)
    * @see android.app.Activity#onPause()
    */
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "On Pause .....");
    }

    /* (non-Javadoc)
    * @see android.app.Activity#onRestart()
    */
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "On Restart .....");
    }

    /* (non-Javadoc)
    * @see android.app.Activity#onResume()
    */
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "On Resume .....");
    }

    /* (non-Javadoc)
    * @see android.app.Activity#onStart()
    */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "On Start .....");
    }
    /* (non-Javadoc)
    * @see android.app.Activity#onStop()
    */
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "On Stop .....");
    }


}
