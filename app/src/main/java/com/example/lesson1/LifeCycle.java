package com.example.lesson1;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import java.util.ArrayList;

public class LifeCycle implements LifecycleObserver {

    Context context;
    DataController data;

    public LifeCycle(Context context, DataController data)
    {
        this.data=data;
        this.context = context;
    }

    public void Toast(String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void Start()
    {
        Toast("onStart");
        data.setData("onStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void Create()
    {
        Toast("onCreate");
        data.setData("onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void Destroy()
    {
        Toast("onDestroy");
        data.setData("onDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void Pause()
    {
        Toast("onPause");
        data.setData("onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void Resume()
    {
        Toast("onResume");
        data.setData("onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void Stop()
    {
        Toast("onStop");
        data.setData("onStop");
    }
}
