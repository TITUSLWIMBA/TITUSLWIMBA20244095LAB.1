package com.example.tituslwimba20244095lab1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnTimetable = findViewById(R.id.btnTimetable);
        Button btnNotices = findViewById(R.id.btnNotices);
        Button btnAnnouncements = findViewById(R.id.btnAnnouncements);

        if (btnTimetable != null) {
            btnTimetable.setOnClickListener(v -> startActivity(new Intent(this, TimetableActivity.class)));
        }
        if (btnNotices != null) {
            btnNotices.setOnClickListener(v -> startActivity(new Intent(this, NoticesActivity.class)));
        }
        if (btnAnnouncements != null) {
            btnAnnouncements.setOnClickListener(v -> startActivity(new Intent(this, AnnouncementActivity.class)));
        }
    }
}