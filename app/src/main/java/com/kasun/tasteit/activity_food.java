package com.kasun.tasteit;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class activity_food extends AppCompatActivity {

    Button btndogfood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        btndogfood = (Button)findViewById(R.id.btndogfood);
        btndogfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dogfood = new Intent(activity_food.this, activity_dogfood.class);
                startActivity(dogfood);
            }
        });

    }
}