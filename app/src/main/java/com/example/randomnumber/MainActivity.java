package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                EditText f = (EditText) findViewById(R.id.fetch);
                TextView res=(TextView) findViewById(R.id.put1);
                int range= Integer.parseInt(f.getText().toString());
                Random r= new Random();

                try {

                    int rand_num = r.nextInt(range - 0 )+0;
                    res.setText(rand_num+" ");
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this,"Range Cannot Exist", Toast.LENGTH_SHORT).show();

                }


            }
        });


    }
}
