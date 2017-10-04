package com.example.viro.sewerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void menu1Clicked() {
        Log.e("AGAGAG", "clicked");
        Intent nextActivity = new Intent(getApplicationContext(), MakePictureActivity.class);
        startActivity(nextActivity);
    }

    @OnClick(R.id.button2)
    public void menu2Clicked() {
        Log.e("AGAGAG", "clicked2");
        Intent nextActivity = new Intent(getApplicationContext(), ViewArchiveActivity.class);
        startActivity(nextActivity);
    }
}
