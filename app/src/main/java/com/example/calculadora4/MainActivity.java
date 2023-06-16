package com.example.calculadora4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.print.PrinterInfo;
import android.util.Log;
import android.util.PrintWriterPrinter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {
  private  Button btnCero,btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnMas,btnMenos,btnMultiplicacion,btnDivision,btnBorrar,btnBorrarTodo,btnPorcentaje,btnPunto,btnIgual1,btnIgual2;
private double n1,n2,total;
private int tamañoTexto=0;
String valorEditText1 = "",valorEditText2="",operacion="";

    controlador Controlador=new controlador();
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    TextView mostrarTotal = findViewById(R.id.lbltotal1);
    TextView mostrarSubTotal = findViewById(R.id.lblsubtotal);

        btnCero = findViewById(R.id.btncero);
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"0";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnUno = findViewById(R.id.btnuno);
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"1";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnDos = findViewById(R.id.btndos);
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"2";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnTres = findViewById(R.id.btntres);
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"3";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnCuatro = findViewById(R.id.btncuatro);
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"4";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnCinco = findViewById(R.id.btncinco);
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"4";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnSeis = findViewById(R.id.btnseis);
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"6";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnSiete = findViewById(R.id.btnsiete);
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"7";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnOcho = findViewById(R.id.btnocho);
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"8";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnNueve = findViewById(R.id.btnnueve);
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +"9";
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnPunto = findViewById(R.id.btnpunto);
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 = valorEditText1 +".";
                mostrarTotal.setText(valorEditText1);
            }
        });
    //operaciones--------------------------------
        btnPorcentaje = findViewById(R.id.btnporcentaje);
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
          //     subTotal = (Double.parseDouble(valorEditText1))/100;
               valorEditText1 = valorEditText1 +"%";//mostrarTotal.setText(valorEditText1);
            }
        });
        btnMas = findViewById(R.id.btnmas);
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(valorEditText1);
                valorEditText1 = valorEditText1 +"+";
                mostrarTotal.setText(valorEditText1);
                tamañoTexto=valorEditText1.length();
                operacion="+";
            }
        });
        btnMenos = findViewById(R.id.btnmenos);
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(valorEditText1);
                valorEditText1 = valorEditText1 +"-";
                mostrarTotal.setText(valorEditText1);
                tamañoTexto=valorEditText1.length();
                operacion="-";
            }
        });
        btnDivision = findViewById(R.id.btndivision);
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(valorEditText1);
                valorEditText1 = valorEditText1 +"/";
                mostrarTotal.setText(valorEditText1);
                tamañoTexto=valorEditText1.length();
                operacion="/";
            }
        });
        btnMultiplicacion = findViewById(R.id.btnmultiplicacion);
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Double.parseDouble(valorEditText1);
                valorEditText1 = valorEditText1 +"*";
                mostrarTotal.setText(valorEditText1);
                tamañoTexto=valorEditText1.length();
                operacion="*";
            }
        });
        //Botones Para editar--------------------------------------------------------------
        btnBorrar = findViewById(R.id.btnborrar);
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cadena= valorEditText1.substring(0, valorEditText1.length()-1);
                valorEditText1=cadena;
                mostrarTotal.setText(valorEditText1);
            }
        });
        btnBorrarTodo = findViewById(R.id.btnborrarTodo);
        btnBorrarTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valorEditText1 ="";
                total=0;
                n1=0;
                n2=0;
                mostrarTotal.setText(valorEditText1);
                mostrarSubTotal.setText(valorEditText2);
            }
        });
        btnIgual1 = findViewById(R.id.btnigual1);
         btnIgual1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n2=Double.parseDouble(valorEditText1.substring(tamañoTexto));
                switch (operacion){
                    case "+":
                       total=Controlador.suma(n1,n2);
                        break;
                    case "-":
                        total=Controlador.resta(n1,n2);
                        break;
                    case "*":
                        total=Controlador.multiplication(n1,n2);
                        break;
                    case "/":
                        total=Controlador.divicion(n1,n2);
                        break;
                }
                mostrarTotal.setText(String.valueOf(total));
                valorEditText1=String.valueOf(total);
            }
        });
        btnIgual2 = findViewById(R.id.btnigual2);
        btnIgual2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n2=Double.parseDouble(valorEditText1.substring(tamañoTexto));
                switch (operacion){
                    case "+":
                        total=Controlador.suma(n1,n2);
                        break;
                    case "-":
                        total=Controlador.resta(n1,n2);
                        break;
                    case "*":
                        total=Controlador.multiplication(n1,n2);
                        break;
                    case "/":
                        total=Controlador.divicion(n1,n2);
                        break;
                }
                mostrarTotal.setText(String.valueOf(total));
                valorEditText1=String.valueOf(total);
            }
        });
    }
}