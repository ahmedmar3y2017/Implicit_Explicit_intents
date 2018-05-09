package com.example.ahmedmar3y.implicit_explicit_intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init
        this.button = (Button) findViewById(R.id.visit);
        this.editText = (EditText) findViewById(R.id.link);

    }

    public void onclickButton(View view) {

        String link = editText.getText().toString();

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);


    }

    public void onclickButtonExplicit(View view) {


        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("name", "Ahmed mohamed mar3y");
        intent.putExtra("position", "java developer");
        startActivity(intent);


    }


}
