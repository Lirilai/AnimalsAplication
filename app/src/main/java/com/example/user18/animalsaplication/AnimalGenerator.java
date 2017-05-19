package com.example.user18.animalsaplication;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.example.user18.animalsaplication.MainActivity.LOG_TAG;

/**
 * Created by user18 on 18.05.2017.
 */

public class AnimalGenerator implements AnimalGetInterface{


    private static final List<Animals> provideAnimals() {
        List<Animals> animals = new ArrayList<>();
        animals.add(new Animals("Лев", "Алекс", 6));
        animals.add(new Animals("Кенгуру", "Джим", 3));
        animals.add(new Animals("Скунс", "Стив", 1));
        animals.add(new Animals("Носорог", "Лим", 10));
        animals.add(new Animals("Черепаха", "Жанна", 55));
        animals.add(new Animals("Гиена", "Дейв", 3));
        animals.add(new Animals("Выдра", "Келли", 3));
        animals.add(new Animals("Лис", "Крис", 5));
        animals.add(new Animals("Фенек", "Лукас", 1));
        animals.add(new Animals("Свинья", "Луи", 5));
        return animals;
    }


    @Override
    public Animals getRandomAnimal() {
        Log.e(LOG_TAG, "getRandomAnimal in AnimalGenerator");
        List<Animals> listOfAnimals = provideAnimals();
        Random random = new Random();
        return listOfAnimals.get(random.nextInt(provideAnimals().size()));
    }
}
