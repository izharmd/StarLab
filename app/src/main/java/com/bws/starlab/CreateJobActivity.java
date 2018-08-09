package com.bws.starlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class CreateJobActivity extends AppCompatActivity {

    TextView textName,textContactPerson,textPriority,textDiscription,textdate,textLocation;
    Spinner spinnerJobCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_job);

        initView();
        clickEvent();
    }

    private void clickEvent() {

    }

    private void initView() {

        textName = findViewById(R.id.textName);
        textContactPerson = (TextView)findViewById(R.id.textContactPerson);
        textPriority = (TextView)findViewById(R.id.textPriority);
        textDiscription = (TextView)findViewById(R.id.textDiscription);
        textdate = (TextView)findViewById(R.id.textdate);
        textLocation = (TextView)findViewById(R.id.textLocation);



        spinnerJobCode = (Spinner) findViewById(R.id.spinnerJobCode);
    }
}
