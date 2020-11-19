package com.example.gameofdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //test cube
        roll = (Button) findViewById(R.id.roll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Player player1 = new Player();
                player1.createDices();
                player1.sumOfPoints();
                player1.showPoints();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Computer comp1 = new Computer();
                comp1.createDices();
                comp1.sumOfPoints();
                comp1.showPoints();
            }
        }
        );

    }
}