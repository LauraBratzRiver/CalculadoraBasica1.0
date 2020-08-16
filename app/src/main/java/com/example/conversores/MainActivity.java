package com.example.conversores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void procesar (View vista) {
        RadioGroup optOperaciones = (RadioGroup)findViewById(R.id.optOperaciones);

        TextView tempval = (TextView) findViewById(R.id.txtNum1);
        double num1 = Double.parseDouble(tempval.getText().toString());

        tempval = (TextView) findViewById(R.id.txtNum2);
        double num2 = Double.parseDouble(tempval.getText().toString());

        double respuesta = 0;
        switch (optOperaciones.getCheckedRadioButtonId()){
            case R.id.optSuma:
                respuesta = num1 +  num2;
                break;
            case R.id.optResta:
                respuesta = num1 - num2;
                break;
            case R.id.optMultiplicacion:
                respuesta = num1 * num2;
                break;
            case R.id.optDivision:
                respuesta = num1 / num2;
                break;
        }


        tempval = (TextView) findViewById(R.id.lblRespuesta);
        tempval.setText("Respuesta:" + respuesta);


    }

}