package com.example.user18.animalsaplication;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView animalInfo;
    private Button buttonRefresh;

    private static final int LOADER_ID = 1;

    public static final String LOG_TAG = "animal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalInfo = (TextView) findViewById(R.id.animal_info);
        buttonRefresh = (Button) findViewById(R.id.button_refresh);

        getSupportLoaderManager().initLoader(LOADER_ID, null, new LoaderCallbacks());

        buttonRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportLoaderManager().getLoader(LOADER_ID).forceLoad();
            }
        });
    }



    private class LoaderCallbacks implements LoaderManager.LoaderCallbacks<Animals> {


        @Override
        public Loader<Animals> onCreateLoader(int id, Bundle args) {
            return new AnimalLoader(MainActivity.this);
        }

        @Override
        public void onLoadFinished(Loader<Animals> loader, Animals data) {
            animalInfo.setText(data.toString());

        }

        @Override
        public void onLoaderReset(Loader<Animals> loader) {

        }
    }



}
