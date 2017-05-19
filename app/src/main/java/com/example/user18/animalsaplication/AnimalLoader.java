package com.example.user18.animalsaplication;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.util.Random;

import static com.example.user18.animalsaplication.MainActivity.LOG_TAG;

/**
 * Created by user18 on 18.05.2017.
 */

public class AnimalLoader extends AsyncTaskLoader <Animals> {

    private AnimalGetInterface generateAnimals;


    public AnimalLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        Log.e(LOG_TAG, "onStartLoading");
        forceLoad();
    }

    @Override
    public Animals loadInBackground() {
        generateAnimals = new AnimalGenerator();
        Log.e(LOG_TAG, "loadInBackground");
        return generateAnimals.getRandomAnimal();

    }
}


