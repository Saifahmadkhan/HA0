package com.example.ha0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        //Log.d("MYCODE", "IT WORKS");
        Intent it = new Intent(this,Main2Activity.class);
        startActivity(it);
        //Log.d("SECOND","COMMENT");
    }
}
