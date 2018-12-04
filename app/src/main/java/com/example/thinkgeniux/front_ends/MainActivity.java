package com.example.thinkgeniux.front_ends;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView reg,forget;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        reg=findViewById(R.id.reg);
        login=findViewById(R.id.login);
        forget=findViewById(R.id.forget);

     forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Forget_Password.class);
                startActivity(intent);

            }
        });
     //code for Register
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obj=new Intent(MainActivity.this,register.class);
                startActivity(obj);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,checkout.class);
                startActivity(intent);
            }
        });

    }
}
