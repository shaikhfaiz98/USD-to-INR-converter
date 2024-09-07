package com.example.usdtoinrconverterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public void btnclick(View view){
        EditText dollarAmount = findViewById(R.id.edtenter);
        TextView amounttxt = findViewById(R.id.amounttxt);
        String dollars = dollarAmount.getText().toString();
        Double doubleDollars = Double.parseDouble(dollars);
        Double doubleInr = 83.67 * doubleDollars;
        amounttxt.setText("= " + doubleInr.toString() + " Rs");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}