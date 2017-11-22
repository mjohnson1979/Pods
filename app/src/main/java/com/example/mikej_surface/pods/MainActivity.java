package com.example.mikej_surface.pods;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
;

public class MainActivity extends AppCompatActivity {
    private static Button stream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnclickButtonListener();

    }
    public void OnclickButtonListener(){
        stream = (Button)findViewById(R.id.button);
        stream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent("com.example.mikej_surface.pods.Main2Activity");
            startActivity(intent);
            }
        });


    }
}
