package com.bws.starlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DashboardActivity extends AppCompatActivity {

    LinearLayout ll_MyJob,ll_createNewJob;
   ImageView imv_Shutdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dahboard);
        inintView();
        clicevent();

    }

    private void clicevent() {

        ll_MyJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,PriorityJobActivity.class);
                startActivity(intent);
            }
        });
        ll_createNewJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,CreateJobActivity.class);
                startActivity(intent);
            }
        });

        imv_Shutdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //System.exit(1);
                DashboardActivity.this.finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

    private void inintView() {

        ll_MyJob = (LinearLayout)findViewById(R.id.ll_MyJob);
        ll_createNewJob = (LinearLayout)findViewById(R.id.ll_createNewJob);
        imv_Shutdown = (ImageView) findViewById(R.id.imv_Shutdown);
    }
}
