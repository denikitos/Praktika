package com.example.denisov_prakt10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void calculateCircleProperties(View v) {

        EditText inputFieldX1 = findViewById(R.id.inputFieldX1);
        EditText inputFieldX2 = findViewById(R.id.inputFieldX2);


        String inputX1 = inputFieldX1.getText().toString();
        String inputX2 = inputFieldX2.getText().toString();



            double x1 = Double.parseDouble(inputX1);
            double x2 = Double.parseDouble(inputX2);


            double a = Math.abs(x2 - x1);

            TextView resultField = findViewById(R.id.resultField);
            resultField.setText("Расстоние " + a);


    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
