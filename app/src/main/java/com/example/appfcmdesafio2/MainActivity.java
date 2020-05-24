package com.example.appfcmdesafio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btCalcular = findViewById(R.id.btCalcular);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //o usuário digita um valor, que é a idade e o app pega esse valor e atribui à uma variável int chamada "i"
                EditText txtIdade = findViewById(R.id.txtIdade);
                String idade = txtIdade.getText().toString();
                int i = Integer.parseInt(idade);

                //cálculo da FCM
                int FCM;
                FCM = 220 - i;
                //transformar numa String
                String fcm = String.valueOf(FCM);

                //cálculo da FCM em uma Caminhada Rápida
                double FCM1;
                FCM1 = (57.5 / 100) * FCM;
                //transformar numa String
                String fcm1 = String.valueOf(FCM1);

                //cálculo da FCM em um Trote
                double FCM2;
                FCM2 = (67.5 / 100) * FCM;
                //transformar numa String
                String fcm2 = String.valueOf(FCM2);

                //cálculo da FCM em uma Corrida Leve
                double FCM3;
                FCM3 = (77.5 / 100) * FCM;
                //transformar numa String
                String fcm3 = String.valueOf(FCM3);

                //cálculo da FCM em uma Corrida Moderada
                double FCM4;
                FCM4 = (88.5 / 100) * FCM;
                //transformar numa String
                String fcm4 = String.valueOf(FCM4);

                //cálculo da FCM em uma Corrida Intensa
                double FCM5;
                FCM5 = (95.0 / 100) * FCM;
                //transformar numa String
                String fcm5 = String.valueOf(FCM5);

                //chamando uma intent, conectando a MainActivity com a Main2Activity
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                //mandar os Strings para o Main2Activity
                intent.putExtra("fcm", fcm);
                intent.putExtra("fcm1", fcm1);
                intent.putExtra("fcm2", fcm2);
                intent.putExtra("fcm3", fcm3);
                intent.putExtra("fcm4", fcm4);
                intent.putExtra("fcm5", fcm5);

                //acionar a intent
                startActivity(intent);
            }
        });
    }
}



