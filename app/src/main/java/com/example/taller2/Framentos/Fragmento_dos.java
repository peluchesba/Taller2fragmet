package com.example.taller2.Framentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.taller2.R;


public class Fragmento_dos extends Fragment {

    private TextView Recibir;

    public Fragmento_dos() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fragmento_dos, container, false);
        Recibir = (TextView) vista.findViewById(R.id.Id_recibir);
        return vista;
    }
    public void renderText(String text){
        Recibir.setText(text);
    }

}