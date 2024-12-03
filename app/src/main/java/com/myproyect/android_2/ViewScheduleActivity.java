package com.myproyect.android_2;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewScheduleActivity extends AppCompatActivity {

    private Map<String, List<String>> scheduleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_schedule);

        Spinner spinnerDays = findViewById(R.id.spinner_days);
        ListView lvSchedule = findViewById(R.id.lv_schedule);

        // Datos simulados del horario
        scheduleMap = new HashMap<>();
        scheduleMap.put("Lunes", List.of("08:00 - Matemáticas", "10:00 - Física"));
        scheduleMap.put("Martes", List.of("08:00 - Historia"));
        scheduleMap.put("Miércoles", List.of("08:00 - Inglés"));
        scheduleMap.put("Jueves", List.of("10:00 - Biología"));
        scheduleMap.put("Viernes", new ArrayList<>());

        // Configurar el Spinner con los días de la semana
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                new ArrayList<>(scheduleMap.keySet())
        );
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDays.setAdapter(spinnerAdapter);

        // Mostrar el horario según el día seleccionado
        spinnerDays.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                String selectedDay = parent.getItemAtPosition(position).toString();
                List<String> schedule = scheduleMap.get(selectedDay);

                if (schedule != null && !schedule.isEmpty()) {
                    ArrayAdapter<String> adapter = new ArrayAdapter<>(
                            ViewScheduleActivity.this,
                            android.R.layout.simple_list_item_1,
                            schedule
                    );
                    lvSchedule.setAdapter(adapter);
                } else {
                    lvSchedule.setAdapter(null);
                    Toast.makeText(ViewScheduleActivity.this, "No hay clases este día", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // No hacer nada
            }
        });
    }
}
