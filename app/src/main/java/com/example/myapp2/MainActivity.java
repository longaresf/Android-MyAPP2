package com.example.myapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Toast.makeText(this,"Bienvenido a nuestra App", Toast.LENGTH_LONG).show();

        Toast.makeText
                (this,
                        "Un mensaje usando Toast",
                        Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main", "OnStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Main", "OnResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main", "OnPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main", "OnStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Main", "Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main", "Destroy");
    }

}




