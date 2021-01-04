package com.example.mytodoappanil;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.mytodoappanil.data.Task;
import com.example.mytodoappanil.data.TaskRepository;

import java.util.List;

public class TaskViewModel extends AndroidViewModel{

    private final TaskRepository repository;
    private final LiveData<List<Task>> alltasks;
    public TaskViewModel(@NonNull Application application) {
        super(application);
        repository = new TaskRepository(application);
        alltasks = repository.getAlltasks();
    }

    public void insert(Task task){
        repository.insert(task);
    }

    public void update(Task task){
        repository.update(task);
    }

    public void delete(Task task){
        repository.delete(task);
    }

    public void deleteCompletedTask(Boolean value){
        repository.deleteCompletedTask(value);
    }

    public LiveData<List<Task>> getAlltasks() {
        return alltasks;
    }
}



