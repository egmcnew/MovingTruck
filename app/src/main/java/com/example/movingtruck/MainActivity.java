package com.example.movingtruck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int intSize;
    float decMiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText size = (EditText) findViewById(R.id.input1);
        final EditText miles = (EditText) findViewById(R.id.input2);
        Button button = (Button)findViewById(R.id.but1);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intSize = Integer.parseInt(size.getText().toString());
                decMiles = Float.parseFloat(miles.getText().toString());
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putInt("key1", intSize);
                editor.putFloat("key2", decMiles);
                editor.commit();
                startActivity(new Intent(MainActivity.this, Final.class));
            }
        });
    }
}
