package com.example.movingtruck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        TextView finalCost = (TextView)findViewById(R.id.txtCost);
        ImageView image = (ImageView)findViewById(R.id.truckImage);
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int intSize = sharedPref.getInt ("key1", 0);
        float decMiles = sharedPref.getFloat ("key2", 0);
        double totalCost;
        double truckCost;

        if (intSize == 10) {
            image.setImageResource(R.drawable.ten);
            truckCost = 19.95;
            totalCost = (truckCost + (decMiles * .99));
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            finalCost.setText("Total Cost " + currency.format(totalCost) + "\nMileage " + currency.format(decMiles * .99));
        } else if (intSize == 17) {
            image.setImageResource(R.drawable.seventeen);
            truckCost = 29.95;
            totalCost = (truckCost + (decMiles * .99));
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            finalCost.setText("Total Cost " + currency.format(totalCost) + "\nMileage " + currency.format(decMiles * .99));
        } else if (intSize == 26) {
            image.setImageResource(R.drawable.twentysix);
            truckCost = 39.95;
            totalCost = (truckCost + (decMiles * .99));
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            finalCost.setText("Total Cost " + currency.format(totalCost) + "\nMileage " + currency.format(decMiles * .99));
        } else {
            finalCost.setText("Only 10, 17 & 26 Foot Trucks");
        }

    }
}

