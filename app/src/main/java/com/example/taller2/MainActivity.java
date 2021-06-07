package com.example.taller2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.taller2.Framentos.Fragmento_dos;
import com.example.taller2.Framentos.Fragmento_uno;

public class MainActivity extends AppCompatActivity implements Fragmento_uno.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
        Fragmento_dos fragmento_dos = (Fragmento_dos) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView3);
        fragmento_dos.renderText(text);
    }
}