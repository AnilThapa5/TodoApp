package com.example.mytodoappanil;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.Toast;

public class AddEditTaskActivity extends AppCompatActivity {
    public static final String EXTRA_ID =
            "package com.example.mytodoapp.EXTRA_ID";
    public static final String EXTRA_TITLE =
            "package com.example.mytodoapp.EXTRA_TITLE";
    public static final String EXTRA_DATE =
            "package com.example.mytodoapp.EXTRA_DATE";
    public static final String EXTRA_COMPLETE =
            "package com.example.mytodoapp.EXTRA_COMPLETE";
    public static final String EXTRA_PRIORITY =
            "package com.example.mytodoapp.EXTRA_PRIORITY";
    private EditText editTextTitle;

    private NumberPicker numberPickerPriority;
    private CheckBox isComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_detail);

        editTextTitle = findViewById(R.id.title_id);

        isComplete = findViewById(R.id.iscom_id);
        numberPickerPriority = findViewById(R.id.priority_number_pick);
        numberPickerPriority.setMinValue(1);
        numberPickerPriority.setMaxValue(3);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_ID)){
            setTitle("Edit Task");
            editTextTitle.setText(intent.getStringExtra(EXTRA_TITLE));
            isComplete.setChecked(Boolean.parseBoolean(String.valueOf(intent.getBooleanExtra(EXTRA_COMPLETE,false))));
            numberPickerPriority.setValue(intent.getIntExtra(EXTRA_PRIORITY, 1));

        }else {
            setTitle("Add Task");
        }
    }

    private void SaveTask() {
        String title = editTextTitle.getText().toString();
        boolean isCompl = isComplete.isChecked();
        int priority = numberPickerPriority.getValue();
        if (title.trim().isEmpty()) {
            Toast.makeText(this, "Please insert a task", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent data = new Intent();
        data.putExtra(EXTRA_TITLE, title);
        data.putExtra(EXTRA_COMPLETE, isCompl);
        data.putExtra(EXTRA_PRIORITY, priority);

        int id = getIntent().getIntExtra(EXTRA_ID,-1);
        if(id != -1){
            data.putExtra(EXTRA_ID, id);
        }
        setResult(RESULT_OK, data);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_task_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.save_task) {
            SaveTask();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}