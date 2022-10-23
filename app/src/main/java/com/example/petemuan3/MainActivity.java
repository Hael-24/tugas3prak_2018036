package com.example.petemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void appart1(View view) {
        Intent a = new Intent(MainActivity.this, apart1.class);
        startActivity(a);
    }
    public void appart2(View view) {
        Intent a = new Intent(MainActivity.this, apart2.class);
        startActivity(a);
    }
    public void appart3(View view) {
        Intent a = new Intent(MainActivity.this, apart3.class);
        startActivity(a);
    }
    public void appart4(View view) {
        Intent a = new Intent(MainActivity.this, apart4.class);
        startActivity(a);
    }
}