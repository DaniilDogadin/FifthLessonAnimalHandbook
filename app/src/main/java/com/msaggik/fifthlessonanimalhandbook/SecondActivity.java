package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Волнистый попугай", "Род птичьих, слишком громкие",
                R.drawable.budgie, "Численность огромная"));
        animals.add( new Animal("Суслик", "Род грызунов, беличьих",
                R.drawable.syslik, "Численность средняя"));
        animals.add( new Animal("Медведь", "Семейство млекопитающих отряда хищных",
                R.drawable.bear, "Численность большая"));
        animals.add( new Animal("Ласка", "Вид хищных млекопитающих из семейства куньих",
                R.drawable.laska, "Численность большая"));
        animals.add( new Animal("Сова", "Хищная птица семейства совиных с мягким рыхлым оперением, обеспечивающим бесшумность полёта, с продолговатым крючковатым клювом и круглой головой, на которой оперение вокруг больших глаз образует так называемый «лицевой» диск, ведущая сумеречный образ жизни",
                R.drawable.owl, "Численность большая"));
    }
}