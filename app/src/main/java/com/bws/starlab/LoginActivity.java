package com.bws.starlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;
public class LoginActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    Button btnSignIn,btnExit;
    EditText editUserName,editPassword;
    TextView textForgetPass;
    CheckBox checkbox;

    Spinner spinner;

    String[] userType = { "--Select--", "Service Engineer","Other",};
    NiftyDialogBuilder animatedDialog;
    NiftyDialogBuilder animatedDialogExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intiView();
        clickEvent();
    }

    private void clickEvent() {

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animatedDialogExit.withTitle("Star Lab")
                        .withMessage("Do you want to exit?")
                        .withDialogColor("#cc7d3d")
                        .withButton1Text("Yes")
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                               finish();
                            }
                        })
                        .withButton2Text("No")
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                animatedDialogExit.dismiss();
                            }
                        })
                        .withDuration(500)
                        .withEffect(Effectstype.Fall)
                        .show();
            }
        });

        textForgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animatedDialog
                        .withTitle("Star Lab")
                        .setCustomView(R.layout.dialog_forgetpassword,LoginActivity.this)
                        .withDialogColor("#cc7d3d")
                        .withDuration(500)
                        .withEffect(Effectstype.Fall)
                        .show();
                EditText editForgetPass = (EditText)animatedDialog.findViewById(R.id.editForgetPass);
                Button btnDialog_forgetPass = (Button)animatedDialog.findViewById(R.id.btnDialog_forgetPass);
                btnDialog_forgetPass.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                       // Toast.makeText(LoginActivity.this,"We send new password in your email.",Toast.LENGTH_SHORT).show();
                        animatedDialog.dismiss();
                    }
                });
            }
        });

        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //code
            }
        });

    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(),userType[position] ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    private void intiView() {

        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnExit = (Button)findViewById(R.id.btnExit);

        editUserName = (EditText)findViewById(R.id.editUserName);
        editPassword = (EditText)findViewById(R.id.editPassword);

        textForgetPass = (TextView)findViewById(R.id.textForgetPass);

        spinner = (Spinner) findViewById(R.id.spinner);

        checkbox = (CheckBox) findViewById(R.id.checkbox);

        animatedDialog = NiftyDialogBuilder.getInstance(this);
        animatedDialogExit = NiftyDialogBuilder.getInstance(this);




        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,userType);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinner.setAdapter(adapter);
    }
}
