package com.example.guides.labexer1_gradecomputation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.defaultValue;

public class Main2Activity extends AppCompatActivity {

    TextView RA;
    TextView FA;
    Button BTN_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //int val = Integer.parseInt( num.getText().toString() );


        RA = (TextView) findViewById(R.id.RA);
        FA = (TextView) findViewById(R.id.FA);
        BTN_2 = (Button) findViewById(R.id.BTN2);
        //double RAF=getIntent().getDoubleExtra("name", 0);
        //String wow= Double.toString(RAF);
        String wow=getIntent().getStringExtra("RA");
        RA.setText(wow);

        String wow2=getIntent().getStringExtra("FA");
        FA.setText(wow2);






       /* String Quiz1=getIntent().getStringExtra("Q1");
        String Quiz2=getIntent().getStringExtra("Q2");
        String Seatworks=getIntent().getStringExtra("SW");
        String LabExercises=getIntent().getStringExtra("LE");
        String MajorExam=getIntent().getStringExtra("ME");

        int Q1= Integer.parseInt(Quiz1);
        int Q1= Integer.parseInt(Quiz1);
        int Q1= Integer.parseInt(Quiz1);
        int Q1= Integer.parseInt(Quiz1);
        //TXT_1.setText("Hello "+msg);*/

    }

    public void goback(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}
