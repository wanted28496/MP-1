package com.generic.VirtualStockGame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash_Screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Thread timer =new Thread(){
            public void run(){
                try{
                    sleep(5000);

                }catch (InterruptedException e){
                    e.printStackTrace();

                }finally {
                    Intent OpenMainActivity=new Intent("com.generic.VirtualStock.LoginScreen");
                    startActivity(OpenMainActivity);
                    finish();
                }
            }
        };
        timer.start();
    }
}