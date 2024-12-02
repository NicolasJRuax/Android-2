package com.myproyect.android_2;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CurrentClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_class);

        TextView tvCurrentClass = findViewById(R.id.tv_current_class);

        // Simulación: esto debería basarse en datos reales.
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE HH:mm", Locale.getDefault());
        String currentTime = sdf.format(new Date());

        String currentClass = "No hay clase ahora mismo"; // Valor por defecto
        if (currentTime.contains("Lunes") && currentTime.contains("08:00")) {
            currentClass = "Matemáticas";
        } else if (currentTime.contains("Lunes") && currentTime.contains("10:00")) {
            currentClass = "Física";
        }

        tvCurrentClass.setText(currentClass);
    }
}
