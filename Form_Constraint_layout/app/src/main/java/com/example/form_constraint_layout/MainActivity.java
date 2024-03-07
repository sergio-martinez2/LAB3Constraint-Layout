package com.example.form_constraint_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia del Spinner
        Spinner spinnerTypeOfCargo = findViewById(R.id.spinnerTypeOfCargo);

        // Crear una lista de tipos de carga
        List<String> typesOfCargo = new ArrayList<>();
        typesOfCargo.add("Electrónicos");
        typesOfCargo.add("Alimentos");
        typesOfCargo.add("Ropa");
        typesOfCargo.add("Productos Químicos");
        typesOfCargo.add("Otro");

        // Crear un ArrayAdapter utilizando la lista y un layout por defecto
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, typesOfCargo);

        // Especificar el layout a utilizar cuando se despliega la lista de opciones
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Aplicar el adaptador al Spinner
        spinnerTypeOfCargo.setAdapter(adapter);
    }
}