package com.example.lista5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private float disc;
    private float km;
    private float gaso;
    private float gasto;

    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);


        bt1 = (Button) findViewById(R.id.botao);

        if(savedInstanceState!=null){
            gasto = savedInstanceState.getFloat("us");
        }

        bt1.setOnClickListener(this);
    }

    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putFloat("us", gasto);
    }
    public void onClick(View v) {

        if(v.getId() == R.id.botao){
            Intent intent = new Intent(this, NovaActivity.class);
            Bundle params = new Bundle();
            disc = Float.parseFloat(et1.getText().toString());
            km = Float.parseFloat(et2.getText().toString());
            gaso = Float.parseFloat(et3.getText().toString());
            gasto = (float) (disc*gaso)/km;
            params.putFloat("us", gasto);
            intent.putExtras(params);
            startActivity(intent);
        }
    }
}