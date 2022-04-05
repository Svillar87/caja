package com.example.caja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gestion_caja extends AppCompatActivity implements View.OnClickListener {

    Button bt_menu1,bt_menu2,bt_menu3,bt_menu4,bt_carne1,bt_carne2,bt_carne3,bt_carne4,
    bt_pescado1,bt_pescado2,bt_pescado3,bt_pescado4,bt_postre1,bt_postre2,bt_postre3,bt_postre4;

    Button bt_combinado1,bt_combinado2,bt_combinado3,bt_combinado4,bt_vino1,bt_vino2,bt_vino3,bt_vino4,
    bt_refresco1,bt_refresco2,bt_refresco3,bt_refresco4,bt_cafe,bt_infusion,bt_te,bt_licor;

    Button bt_clear;

    TextView tv_cuenta;
    String Cuenta="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_caja);

        bt_menu1 = findViewById(R.id.bt_menu1);
        bt_menu2 = findViewById(R.id.bt_menu2);
        bt_menu3 = findViewById(R.id.bt_menu3);
        bt_menu4 = findViewById(R.id.bt_menu4);

        bt_carne1 = findViewById(R.id.bt_carne1);
        bt_carne2 = findViewById(R.id.bt_carne2);
        bt_carne3 = findViewById(R.id.bt_carne3);
        bt_carne4 = findViewById(R.id.bt_carne4);

        bt_pescado1 = findViewById(R.id.bt_pescado1);
        bt_pescado2 = findViewById(R.id.bt_pescado2);
        bt_pescado3 = findViewById(R.id.bt_pescado3);
        bt_pescado4 = findViewById(R.id.bt_pescado4);

        bt_postre1 = findViewById(R.id.bt_postre1);
        bt_postre2 = findViewById(R.id.bt_postre2);
        bt_postre3 = findViewById(R.id.bt_postre3);
        bt_postre4 = findViewById(R.id.bt_postre4);

        bt_combinado1 = findViewById(R.id.bt_combinado1);
        bt_combinado2 = findViewById(R.id.bt_combinado2);
        bt_combinado3 = findViewById(R.id.bt_combinado3);
        bt_combinado4 = findViewById(R.id.bt_combinado4);

        bt_vino1 = findViewById(R.id.bt_vino1);
        bt_vino2 = findViewById(R.id.bt_vino2);
        bt_vino3 = findViewById(R.id.bt_vino3);
        bt_vino4 = findViewById(R.id.bt_vino4);

        bt_refresco1 = findViewById(R.id.bt_refresco1);
        bt_refresco2 = findViewById(R.id.bt_refresco2);
        bt_refresco3 = findViewById(R.id.bt_refresco3);
        bt_refresco4 = findViewById(R.id.bt_refresco4);

        bt_cafe = findViewById(R.id.bt_cafe);
        bt_te = findViewById(R.id.bt_te);
        bt_infusion = findViewById(R.id.bt_infusion);
        bt_licor = findViewById(R.id.bt_licor);

        tv_cuenta = findViewById(R.id.tv_cuenta);
        bt_clear = findViewById(R.id.bt_clear);

        bt_menu1.setOnClickListener(this);
        bt_menu2.setOnClickListener(this);
        bt_menu3.setOnClickListener(this);
        bt_menu4.setOnClickListener(this);

        bt_carne1.setOnClickListener(this);
        bt_carne2.setOnClickListener(this);
        bt_carne3.setOnClickListener(this);
        bt_carne4.setOnClickListener(this);

        bt_pescado1.setOnClickListener(this);
        bt_pescado2.setOnClickListener(this);
        bt_pescado3.setOnClickListener(this);
        bt_pescado4.setOnClickListener(this);

        bt_postre1.setOnClickListener(this);
        bt_postre2.setOnClickListener(this);
        bt_postre3.setOnClickListener(this);
        bt_postre4.setOnClickListener(this);

        bt_combinado1.setOnClickListener(this);
        bt_combinado2.setOnClickListener(this);
        bt_combinado3.setOnClickListener(this);
        bt_combinado4.setOnClickListener(this);

        bt_vino1.setOnClickListener(this);
        bt_vino2.setOnClickListener(this);
        bt_vino3.setOnClickListener(this);
        bt_vino4.setOnClickListener(this);

        bt_refresco1.setOnClickListener(this);
        bt_refresco2.setOnClickListener(this);
        bt_refresco3.setOnClickListener(this);
        bt_refresco4.setOnClickListener(this);

        bt_cafe.setOnClickListener(this);
        bt_te.setOnClickListener(this);
        bt_infusion.setOnClickListener(this);
        bt_licor.setOnClickListener(this);

        bt_clear.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_menu1:
                Cuenta=Cuenta+" "+bt_menu1.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_menu2:
                Cuenta=Cuenta+" "+bt_menu2.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_menu3:
                Cuenta=Cuenta+" "+bt_menu3.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_menu4:
                Cuenta=Cuenta+" "+bt_menu4.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_carne1:
                Cuenta=Cuenta+" "+bt_carne1.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_carne2:
                Cuenta=Cuenta+" "+bt_carne2.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_carne3:
                Cuenta=Cuenta+" "+bt_carne3.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_carne4:
                Cuenta=Cuenta+" "+bt_carne4.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_pescado1:
                Cuenta=Cuenta+" "+bt_pescado1.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_pescado2:
                Cuenta=Cuenta+" "+bt_pescado2.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_pescado3:
                Cuenta=Cuenta+" "+bt_pescado3.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_pescado4:
                Cuenta=Cuenta+" "+bt_pescado4.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_postre1:
                Cuenta=Cuenta+" "+bt_postre1.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_postre2:
                Cuenta=Cuenta+" "+bt_postre2.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_postre3:
                Cuenta=Cuenta+" "+bt_postre3.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_postre4:
                Cuenta=Cuenta+" "+bt_postre4.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_combinado1:
                Cuenta=Cuenta+" "+bt_combinado1.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_combinado2:
                Cuenta=Cuenta+" "+bt_combinado2.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_combinado3:
                Cuenta=Cuenta+" "+bt_combinado3.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_combinado4:
                Cuenta=Cuenta+" "+bt_combinado4.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_vino1:
                Cuenta=Cuenta+" "+bt_vino1.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_vino2:
                Cuenta=Cuenta+" "+bt_vino2.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_vino3:
                Cuenta=Cuenta+" "+bt_vino3.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_vino4:
                Cuenta=Cuenta+" "+bt_vino4.getText();
                tv_cuenta.setText(Cuenta);
                break;

            case R.id.bt_refresco1:
                Cuenta=Cuenta+", "+bt_refresco1.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_refresco2:
                Cuenta=Cuenta+", "+bt_refresco2.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_refresco3:
                Cuenta=Cuenta+", "+bt_refresco3.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_refresco4:
                Cuenta=Cuenta+", "+bt_refresco4.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_cafe:
                Cuenta=Cuenta+", "+bt_cafe.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_te:
                Cuenta=Cuenta+", "+bt_te.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_infusion:
                Cuenta=Cuenta+", "+bt_infusion.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_licor:
                Cuenta=Cuenta+", "+bt_licor.getText();
                tv_cuenta.setText(Cuenta);
                break;
            case R.id.bt_clear:
                Cuenta=" ";
                tv_cuenta.setText(Cuenta);
                break;
        }

    }
}