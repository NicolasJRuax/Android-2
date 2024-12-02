package com.myproyect.android_2;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddSubject = findViewById(R.id.btn_add_subject);
        Button btnViewSchedule = findViewById(R.id.btn_view_schedule);
        Button btnCurrentClass = findViewById(R.id.btn_current_class);

        btnAddSubject.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddSubjectActivity.class);
            startActivity(intent);
        });

        btnViewSchedule.setOnClickListener(v -> {
            Intent intent = new Intent(this, ViewScheduleActivity.class);
            startActivity(intent);
        });

        btnCurrentClass.setOnClickListener(v -> {
            Intent intent = new Intent(this, CurrentClassActivity.class);
            startActivity(intent);
        });
    }
}
