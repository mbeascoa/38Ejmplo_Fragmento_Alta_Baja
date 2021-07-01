package com.example.a38ejmplo_fragmento_alta_baja;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btnA,btnE;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        btnA = (Button)findViewById(R.id.btnAlta);
        btnE = (Button)findViewById(R.id.btnBaja);


        btnA.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction transaction = fragmentManager.beginTransaction();

                FragmentAlta fragment1 = new FragmentAlta();
                transaction.replace(R.id.contenedorCarga, fragment1)
                        .commit();

            }

        });
        btnE.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction transaction = fragmentManager.beginTransaction();

                FragmentBaja fragment1 = new FragmentBaja();
                transaction.replace(R.id.contenedorCarga, fragment1)
                        .commit();

            }

        });


    }
}