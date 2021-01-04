package com.example.mytodoappanil;
import android.content.Context;
import android.util.Log;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.mytodoappanil.data.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Task.class}, version = 1, exportSchema = false)
@TypeConverters(DateConverter.class)
public abstract class TaskDatabase extends RoomDatabase {

    private static TaskDatabase instance;
    private static final String LOG_TAG = TaskDatabase.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "todolist";
    public abstract TaskDao taskDao();
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(1);

    public static TaskDatabase getInstance(Context context){
        if (instance == null) {
            synchronized (LOCK) {
                Log.d(LOG_TAG, "Creating a new database instance");
                instance = Room.databaseBuilder(context.getApplicationContext(),
                        TaskDatabase.class, TaskDatabase.DATABASE_NAME)
                        .fallbackToDestructiveMigration()
                        .build();
            }
        }
        Log.d(LOG_TAG, "Getting the database instance");
        return instance;
    }
}
