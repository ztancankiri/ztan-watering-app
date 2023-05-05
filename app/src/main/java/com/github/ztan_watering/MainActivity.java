package com.github.ztan_watering;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(androidx.appcompat.R.style.Theme_AppCompat_Light);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button2);
        button.setOnClickListener(v -> {

            HttpRequest.execute("http://192.168.3.2", new HttpRequestCallback() {
                @Override
                public void onSuccess(String result) {
                    Log.d("Ztan-Watering", "GET-RESPONSE: " + result);
                }

                @Override
                public void onError(Exception e) {
                    Log.d("Ztan-Watering", "GET-ERROR: " + e);
                }
            });
        });
    }
}
