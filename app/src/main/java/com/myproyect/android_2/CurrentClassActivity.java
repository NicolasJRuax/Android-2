package com.myproyect.android_2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CurrentClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_class);

        TextView tvCurrentClass = findViewById(R.id.tv_current_class);

        // Datos simulados del horario
        Map<String, Map<String, String>> scheduleMap = new HashMap<>();
        scheduleMap.put("Lunes", Map.of("08:00", "Matemáticas", "10:00", "Física"));
        scheduleMap.put("Martes", Map.of("08:00", "Historia"));
        scheduleMap.put("Miércoles", Map.of("08:00", "Inglés"));
        scheduleMap.put("Jueves", Map.of("10:00", "Biología"));

        // Obtener día y hora actual
        SimpleDateFormat sdfDay = new SimpleDateFormat("EEEE", Locale.getDefault());
        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm", Locale.getDefault());
        String currentDay = sdfDay.format(new Date());
        String currentTime = sdfTime.format(new Date());

        // Buscar la clase actual
        String currentClass = "No hay clase ahora mismo";
        if (scheduleMap.containsKey(currentDay)) {
            Map<String, String> daySchedule = scheduleMap.get(currentDay);
            if (daySchedule != null && daySchedule.containsKey(currentTime)) {
                currentClass = daySchedule.get(currentTime);
            }
        }

        tvCurrentClass.setText(currentClass);
    }
}
