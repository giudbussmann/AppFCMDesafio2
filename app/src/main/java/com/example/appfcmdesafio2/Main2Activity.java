package com.example.appfcmdesafio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //recebendo a intnet, conectando a Main2Activity com a Main Activity
        Intent intent = getIntent();

        //pegar o resultado de cada FCM e mostrar cada um em seus devidos labels

        TextView lbResultado = findViewById(R.id.lbResultado);
        lbResultado.setText(intent.getStringExtra("fcm") + "bpm");

        TextView lbResultado1 = findViewById(R.id.lbResultado1);
        lbResultado1.setText(intent.getStringExtra("fcm1") + "bpm");

        TextView lbResutado2 = findViewById(R.id.lbResultado2);
        lbResutado2.setText(intent.getStringExtra("fcm2") + "bpm");

        TextView lbResultado3 = findViewById(R.id.lbResultado3);
        lbResultado3.setText(intent.getStringExtra("fcm3") + "bpm");

        TextView lbResultado4 = findViewById(R.id.lbResultado4);
        lbResultado4.setText(intent.getStringExtra("fcm4") + "bpm");

        TextView lbResultado5 = findViewById(R.id.lbResultado5);
        lbResultado5.setText(intent.getStringExtra("fcm5") + "bpm");

    }
}










