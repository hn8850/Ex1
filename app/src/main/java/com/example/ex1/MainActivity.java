package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  btn = (Button) findViewById((R.id.btn1));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Main", "I have a lot of seggs");
                btn.setText("oh yea, i've been clicked");
                Toast.makeText(getApplicationContext(), " u gay my man", Toast.LENGTH_SHORT)
                        .show();

            }
        });




    }
}