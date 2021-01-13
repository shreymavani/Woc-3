package com.shrey_m.mysendrecieve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onSend(View view){
        Toast.makeText(this, "Sending...", Toast.LENGTH_SHORT).show();
    }

    public void onDelete(View view){
        Toast.makeText(this, "Deleting...", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}