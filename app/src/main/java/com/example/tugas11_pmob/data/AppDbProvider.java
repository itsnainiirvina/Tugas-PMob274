package com.example.tugas11_pmob.data;

import android.content.Context;

import androidx.room.Room;

public class AppDbProvider {
    private static AppDatabase instance;

    public static AppDatabase getInstance(Context context) {
        if(AppDbProvider.instance == null)
        {
            AppDbProvider.instance = Room.databaseBuilder(
                    context, AppDatabase.class, "pmob274.db"
            ).allowMainThreadQueries().build();
        }
        return AppDbProvider.instance;
    }
}
