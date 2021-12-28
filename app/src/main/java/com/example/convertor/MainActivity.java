package com.example.convertor;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.length).setOnClickListener(v -> MainActivity.this.lengthinput());
        findViewById(R.id.Area).setOnClickListener(v -> MainActivity.this.areainput());
        findViewById(R.id.Volume).setOnClickListener(v -> MainActivity.this.volumeinput());
        findViewById(R.id.Currency).setOnClickListener(v -> MainActivity.this.currencyinput());
        findViewById(R.id.Temp).setOnClickListener(v -> MainActivity.this.tempinput());
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