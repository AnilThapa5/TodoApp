package com.example.mytodoappanil.data;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.mytodoappanil.TaskDao;
import com.example.mytodoappanil.TaskDatabase;

import java.util.List;

public class TaskRepository {
    private TaskDao taskDao;
    private LiveData<List<Task>> alltasks;

    public TaskRepository(Application application){
        TaskDatabase database = TaskDatabase.getInstance(application);
        taskDao = database.taskDao();
        alltasks = taskDao.getAllTasks();
    }

    public void insert(final Task task){
        TaskDatabase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run() {
                taskDao.insert(task);
            }
        });
    }

    public void update(final Task task){
         TaskDatabase.databaseWriteExecutor.execute(new Runnable() {
             @Override
             public void run() {
                 taskDao.update(task);
             }
         });
    }

    public void delete(final Task task){
          TaskDatabase.databaseWriteExecutor.execute(new Runnable() {
              @Override
              public void run() {
                  taskDao.delete(task);
              }
          });
    }

    public void deleteCompletedTask(final Boolean value){
        TaskDatabase.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                taskDao.deleteCompletedTask(value);
            }
        });
    }

    public LiveData<List<Task>> getAlltasks() {
        return alltasks;
    }

    public LiveData<Task> getTaskById(int taskId){
        return taskDao.loadTAskById(taskId);
    }
}


