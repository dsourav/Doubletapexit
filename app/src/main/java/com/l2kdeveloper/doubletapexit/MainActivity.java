package com.l2kdeveloper.doubletapexit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static int time_delay=2000;//setting the delay time
    private static long back_pressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //method for handling back button
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==event.KEYCODE_BACK){
            //checking if back button is pressed twice between 2000 milisecond if so then exit
            if (back_pressed+time_delay>System.currentTimeMillis()){
                finish();
            }
            else {
                //if back button is not pressed twice between 2000 milisecond then initialize back_pressed to current time
                back_pressed=System.currentTimeMillis();
                Toast.makeText(this, "press again to exit", Toast.LENGTH_SHORT).show();
            }
        }
        return true;
    }
}
