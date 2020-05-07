package com.example.widgetsandroid;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.Nullable;

public class WaterPlantingService extends IntentService {
    private static final String MyPREFERENCES = "mypre";
    private static final String ACTION = "click on the image";
    SharedPreferences sharedPreferences;

    public WaterPlantingService() {
        super("WaterPlantingService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        if (intent != null) {
            if (intent.getAction().equals(ACTION)) {
                handleOnImageClick(intent.getAction());
            }
        }
    }

    private void handleOnImageClick(String action) {
        sharedPreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Log.i("clic", action);
        editor.putString("click", "onwidget");
        editor.commit();
    }
}
