package com.generic.VirtualStockGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login_Screen extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Button btn_Login = (Button) findViewById(R.id.btn_Login);
        btn_Login.setOnClickListener(this);
        Button btn_Signup=(Button)findViewById(R.id.btn_Signup);
        btn_Signup.setOnClickListener(this);
        final TextView textView = (TextView)findViewById(R.id.textView);
        btn_Login.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                textView.setText("Hello Crab!!");

                return true;
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public MenuInflater getMenuInflater() {
        return super.getMenuInflater();
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_Login:
                Intent MainScreen=new Intent(Login_Screen.this, Home_Screen.class);
                startActivity(MainScreen);
                break;
            case R.id.btn_Signup:
                Intent SignupScreen=new Intent(Login_Screen.this, Signup_Screen.class);
                startActivity(SignupScreen);
        }

    }
}
