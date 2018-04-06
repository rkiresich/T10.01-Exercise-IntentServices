package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// TODO (1) Create a class called ReminderTasks
//COMPLETE
public class ReminderTasks {

// TODO (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
    //COMPLETE
    public static final String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";

// TODO (6) Create a public static void method called executeTask
    //COMPLETE
// TODO (7) Add a Context called context and String parameter called action to the parameter list
    //COMPLETE

    public static void exectueTask(Context context, String action){
        if(action.equals(ACTION_INCREMENT_WATER_COUNT)){
            incrementWaterCount(context);
        }
    }

// TODO (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount
//COMPLETE
// TODO (3) Create a private static void method called incrementWaterCount
//COMPLETE
    private static void incrementWaterCount(Context context) {
// TODO (4) Add a Context called context to the argument list
    // COMPLETE
// TODO (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count
    //COMPLETE
        PreferenceUtilities.incrementWaterCount(context);
    }
}