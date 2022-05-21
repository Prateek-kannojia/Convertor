package com.example.convertor;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.length).setOnClickListener(v -> lengthinput());
        findViewById(R.id.Area).setOnClickListener(v -> areainput());
        findViewById(R.id.Volume).setOnClickListener(v -> volumeinput());
        findViewById(R.id.Currency).setOnClickListener(v ->currencyinput());
        findViewById(R.id.Temp).setOnClickListener(v -> tempinput());
    }
    private void tempinput() {
        startActivity(new Intent(this, temerature.class));
    }
    private void volumeinput() {
        startActivity(new Intent(this, volume.class));
    }
    private void areainput() {
        startActivity(new Intent(this, area.class));
    }
    private void lengthinput() {
        startActivity(new Intent(this, length.class));
    }
    private void currencyinput() {
        startActivity(new Intent(this, currency.class));
    }
}