package com.example.caja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt_incio,bt_registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_incio= findViewById(R.id.bt_inicio);
        bt_registro=findViewById(R.id.bt_registro);
        bt_incio.setOnClickListener(this);
        bt_registro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case(R.id.bt_registro):
                Intent registro = new Intent(this,MainActivity2.class);
                startActivity(registro);
                break;
            case (R.id.bt_inicio):
                Intent inicio = new Intent(this,Menu.class);
                startActivity(inicio);
                break;
        }

    }

}