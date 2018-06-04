package com.jeanandroid.androidbasicocesar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "teste", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "teste Kaspersky", Toast.LENGTH_SHORT).show();

    }
}
