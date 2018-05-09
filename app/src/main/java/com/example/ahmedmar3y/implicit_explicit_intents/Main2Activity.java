package com.example.ahmedmar3y.implicit_explicit_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String position = bundle.getString("position");

        Toast.makeText(this, "name : " + name + "\n" + "position : " + position, Toast.LENGTH_SHORT).show();


    }

    public void onclickButton(View view) {

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);


    }

}
