package com.example.myfirstgithubapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Mengatur layout dari activity_main.xml
        setContentView(R.layout.activity_main);

        // Menampilkan teks dari Java
        TextView textView = findViewById(R.id.textView);
        textView.setText("Hello GitHub!");
    }
}
