package com.example.taller2.Framentos;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.taller2.R;


public class Fragmento_uno extends Fragment {

    private DataListener callback;
    TextView Correo1;
    TextView Correo2;
    TextView Correo3;

    public Fragmento_uno() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            callback = (DataListener) context;
        }catch (Exception e){
            throw new ClassCastException(context.toString()+" should implement DataListener ");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vista = inflater.inflate(R.layout.fragment_fragmento_uno, container, false);

        Correo1 = (TextView) vista.findViewById(R.id.Id_correo1);
        Correo2 = (TextView) vista.findViewById(R.id.Id_correo2);
        Correo3 = (TextView) vista.findViewById(R.id.Id_correo3);

        Correo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = Correo1.getText().toString();
                callback.sendData(textToSend);
            }
        });

        Correo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = Correo2.getText().toString();
                callback.sendData(textToSend);
            }
        });

        Correo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = Correo3.getText().toString();
                callback.sendData(textToSend);
            }
        });



        return vista;
    }
    public interface DataListener {
        void sendData(String text);
    }
}