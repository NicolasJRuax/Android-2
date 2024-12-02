package com.myproyect.android_2;



import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddSubjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_subject);

        EditText etSubject = findViewById(R.id.et_subject);
        EditText etDay = findViewById(R.id.et_day);
        EditText etTime = findViewById(R.id.et_time);
        Button btnSave = findViewById(R.id.btn_save);

        btnSave.setOnClickListener(v -> {
            String subject = etSubject.getText().toString();
            String day = etDay.getText().toString();
            String time = etTime.getText().toString();

            if (!subject.isEmpty() && !day.isEmpty() && !time.isEmpty()) {
                // Aquí podrías guardar los datos en una base de datos o SharedPreferences.
                Toast.makeText(this, "Asignatura guardada: " + subject, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
