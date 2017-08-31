package com.example.guides.labexer1_gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Quiz1;
    EditText Quiz2;
    EditText Seatworks;
    EditText LabExercises;
    EditText MajorExams;
    Button BTN_1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Quiz1 = (EditText) findViewById(R.id.EDT1);
        Quiz2 = (EditText) findViewById(R.id.EDT2);
        Seatworks = (EditText) findViewById(R.id.EDT3);
        LabExercises = (EditText) findViewById(R.id.EDT4);
        MajorExams = (EditText) findViewById(R.id.EDT5);

        BTN_1 = (Button) findViewById(R.id.BTN1);






    }
    public void compute(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        int Q1 = Integer.parseInt( Quiz1.getText().toString() );
        int Q2 = Integer.parseInt( Quiz2.getText().toString() );
        int SW = Integer.parseInt( Seatworks.getText().toString() );
        int LE = Integer.parseInt( LabExercises.getText().toString() );
        int ME = Integer.parseInt( MajorExams.getText().toString() );

        String FA= null;

        double RA=(Q1*.10)+(Q2*.10)+(SW*.10)+(LE*.40)+(ME*.30);
        String RAF= Double.toString(RA);
        RAF = String.format("%.2f", RA);

        //toString because the value being fetched is an object
        if(RA < 60){
            FA ="Failed";
        } else if(RA >= 60 && RA <= 65){
            FA = "3.0";
        } else if(RA >= 66 && RA <= 70){
            FA = "2.75";
        } else if(RA >= 71 && RA <= 75){
            FA  = "2.5";
        } else if(RA >= 76 && RA <= 80){
            FA = "2.25";
        } else if(RA >= 81 && RA <= 85){
            FA = "2.0";
        } else if(RA >= 86 && RA <= 90){
            FA = "1.75";
        } else if(RA >= 90 && RA <= 92){
            FA = "1.5";
        } else if(RA >= 93 && RA <= 94){
            FA = "1.25";
        } else if(RA >= 95 && RA <= 100){
            FA = "1.0";
        }

        intent.putExtra("RA", RAF);
        intent.putExtra("FA", FA);

        startActivity(intent);


    }


    }

