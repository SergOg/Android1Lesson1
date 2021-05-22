package ru.geekbrains.lesson1;
//1. Создать проект со следующими пользовательскими элементами: TextView, EditText, Button,
//Switch, CheckBox, ToggleButton. Для работы использовать LinearLayout. Использовать
//различные шрифты, цвета, размеры, прочие атрибуты.

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button swLayout = findViewById(R.id.switchLayout);

        swLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                switchLayout(swLayout);
            }
        });
    }

    public void switchLayout(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}