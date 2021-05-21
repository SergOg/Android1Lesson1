package ru.geekbrains.lesson1;
//2. Создать ещё один макет (если не получается, то проект) с несколькими EditText, где
//использовать атрибут inputType: text, textPersonName, phone, number, textPassword,
//textEmailAddress и другие значения.
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
//3. Добавить в проект элемент CalendarView.
//4. * Разобраться, что такое параметр ems:
//Данный атрибут используется для определения значения ширины TextView в единицах измерения EM.
//При этом EM это единица измерения в Typography (Типография), его значением является ширина буквы "M".
//Таким образом android:ems="5" - значит настроить ширину для TextView в 5 раз больше ширины буквы "M".