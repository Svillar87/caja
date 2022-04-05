package com.example.caja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.sql.*;


public class conectar extends AppCompatActivity implements View.OnClickListener{
    Button bt_conectar;
    TextView tv_conectar;
    String Cadena = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conectar);

        bt_conectar = findViewById(R.id.bt_conectar);
        tv_conectar = findViewById(R.id.tv_conectar);


        bt_conectar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.bt_conectar:
                tv_conectar.setText("hola");
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                //Abro conexion (URL,USUARIO,CCONTRASEÑA)
                try {
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/empleados","root","");
                    Statement sentencia = conexion.createStatement();
                    tv_conectar.setText("hola");
                    ResultSet resultado =sentencia.executeQuery("SELECT * FROM empleado WHERE Salario >1500");
                    Cadena = Cadena + "--Codigo Empleado: " +resultado.getInt(1)+"\n" + "--Nombre: " +resultado.getString(2)+"\n"+ "--Apellidos: "+resultado.getString(3)+"\n"+ "--Salario: " +resultado.getInt(4)+"\n"+ "--Puesto: " +resultado.getString(5)+"------************------"+"\n";
                    tv_conectar.setText(Cadena);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }

                break;
        }

    }
}