package com.example.a25737.broadcast;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_number =  (EditText) findViewById(R.id.et_number);
    }

    public void click(View view){
        String number = et_number.getText().toString().trim();

        //获取 sp实例
        SharedPreferences sp = getSharedPreferences("config", 0);
        sp.edit().putString("ipnumber",number).commit();
        Toast.makeText(this, "您可以去打电话了", Toast.LENGTH_SHORT).show();
    }
}
