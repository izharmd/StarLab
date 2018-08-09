package com.bws.starlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bws.starlab.Adapter.PriorityJobAdapter;
import com.bws.starlab.Models.PriorityJobModel;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PriorityJobActivity extends AppCompatActivity {
    
    TextView textJob_header;
    ImageView imv_Shutdown;
    private RecyclerView recyclerView;

    List<PriorityJobModel> arrayPrioriryJob;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priority_job);
        
        initView();

        clickEvent();
    }

    private void clickEvent() {

        imv_Shutdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // System.exit(1);

               PriorityJobActivity.this.finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    private void initView() {
        textJob_header = findViewById(R.id.textJob_header);
        imv_Shutdown = findViewById(R.id.imv_Shutdown);
        textJob_header.setText("My Jobs");

        recyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayPrioriryJob = new ArrayList<PriorityJobModel>();

        for (int i = 0; i < 10; i++) {
            PriorityJobModel priorityJobModel = new PriorityJobModel();
            priorityJobModel.setStringText("Install  complete lighting solutions at  Sorrin Appartments");
            priorityJobModel.setDate("15/04/2014");
            priorityJobModel.setTime("11:00 AM");
            arrayPrioriryJob.add(priorityJobModel);
        }

        adapter = new PriorityJobAdapter(arrayPrioriryJob);
        recyclerView.setAdapter(adapter);
    }
}
