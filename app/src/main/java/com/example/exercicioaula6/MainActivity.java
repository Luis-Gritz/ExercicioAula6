package com.example.exercicioaula6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup1;
    private RadioGroup radioGroup2;
    private RadioGroup radioGroup3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = findViewById(R.id.group1);
        radioGroup2 = findViewById(R.id.group2);
        radioGroup3 = findViewById(R.id.group3);
    }

    public void verificar(View view) {
        int id1 = radioGroup1.getCheckedRadioButtonId();
        int id2 = radioGroup2.getCheckedRadioButtonId();
        int id3 = radioGroup3.getCheckedRadioButtonId();
        int soma = 0;
        String texto = "";

        if (id1 == R.id.radio1_1){
            soma+=1;
        }if (id2 == R.id.radio1_2){
            soma+=1;
        }if (id3 == R.id.radio1_3){
            soma+=1;
        }

        if (soma == 0){
            texto = "Você é desprovido de inteligência";
        } else if (soma == 1){
            texto = "Você é sabe mais ou menos";
        }else if (soma == 2){
            texto = "Você está na média";
        }else if (soma == 3){
            texto = "Você é um fenômeno";
        }


        Toast.makeText(this, texto, Toast.LENGTH_SHORT).show();
    }
}
