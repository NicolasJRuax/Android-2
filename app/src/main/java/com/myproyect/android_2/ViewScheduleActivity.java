package com.myproyect.android_2;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ViewScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_schedule);

        ListView lvSchedule = findViewById(R.id.lv_schedule);

        // Aquí se deben cargar los datos desde la base de datos o SharedPreferences.
        List<String> schedule = new ArrayList<>();
        schedule.add("Lunes - 08:00 - Matemáticas");
        schedule.add("Lunes - 10:00 - Física");
        schedule.add("Martes - 08:00 - Historia");
        schedule.add("Miércoles - 08:00 - Inglés");
        schedule.add("Jueves - 10:00 - Biología");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                schedule
        );

        lvSchedule.setAdapter(adapter);
    }
}
