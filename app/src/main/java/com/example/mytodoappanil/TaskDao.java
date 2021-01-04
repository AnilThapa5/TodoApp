package com.example.mytodoappanil;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mytodoappanil.data.Task;

import java.util.List;

@Dao
public interface TaskDao {
    @Insert
    void insert(Task task);
    @Update
    void update(Task task);
    @Delete
    void delete(Task task);

    @Query("SELECT * FROM task_table ORDER BY priority")
    LiveData<List<Task>> getAllTasks();

    @Query("Select * from task_table where id =:taskId")
    LiveData<Task> loadTAskById(int taskId);

    @Query("Delete from task_table where isComplete = :value")
    void deleteCompletedTask(Boolean value);
}
