package com.bws.starlab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AssetsDetailsActivity extends AppCompatActivity {

    TextView textAssetsName1,textAssetsName2,textResorce,textOther,textTime;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assets_details);

        initView();
        clickEvent();
    }

    private void clickEvent() {


    }

    private void initView() {

        textAssetsName1 = (TextView) findViewById(R.id.textAssetsName1);
        textAssetsName2 = (TextView)findViewById(R.id.textAssetsName2);
        textResorce = (TextView)findViewById(R.id.textResorce);
        textOther = (TextView)findViewById(R.id.textOther);
        textTime = (TextView)findViewById(R.id.textTime);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
    }
}
