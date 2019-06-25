package com.example.lesson1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textLifeCycle);

        DataController data = new DataController();
        LifeCycle lifeCycle = new LifeCycle(this,data);

        LiveData<String> liveData = data.getData();

        liveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String value) {
                text.setText(value);
            }
        });

        getLifecycle().addObserver(lifeCycle);
    }

}
