package ru.geekbrains.lesson1;
//1. Создать проект со следующими пользовательскими элементами: TextView, EditText, Button,
//Switch, CheckBox, ToggleButton. Для работы использовать LinearLayout. Использовать
//различные шрифты, цвета, размеры, прочие атрибуты.

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}