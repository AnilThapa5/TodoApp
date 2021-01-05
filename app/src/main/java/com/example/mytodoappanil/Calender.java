package com.example.mytodoappanil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calender extends AppCompatActivity {

    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        btnback=findViewById(R.id.btn_back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Calender.this, AddEditTaskActivity.class);
                startActivity(intent);
            }
        });

    }

}