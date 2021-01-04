package com.example.mytodoappanil.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task_table")
public class Task {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private final String title;
    private final boolean isComplete;
    private final int priority;
    @ColumnInfo(name="updated_at")
    private Date updatedAt;

    public Task(String title, Date updatedAt, boolean isComplete, int priority) {
        this.title = title;
        this.updatedAt = updatedAt;
        this.isComplete = isComplete;
        this.priority = priority;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public int getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
