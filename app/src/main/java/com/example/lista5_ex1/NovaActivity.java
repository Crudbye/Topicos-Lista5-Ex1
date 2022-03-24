package com.example.lista5_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NovaActivity extends AppCompatActivity {
private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova);
        getSupportActionBar().setTitle("Home");

        t = (TextView) findViewById(R.id.tvNovaTela);

        Bundle args = getIntent().getExtras();
        Float gasto = args.getFloat("us");

        t.setText("Gasto total vai ser de   R$"+gasto);
    }
}