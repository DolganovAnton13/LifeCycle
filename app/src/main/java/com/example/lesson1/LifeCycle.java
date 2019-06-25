package com.example.lesson1;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import java.util.ArrayList;

public class LifeCycle implements LifecycleObserver {

    Context context;

    public LifeCycle(Context context)
    {
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
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void Create()
    {
        Toast("onCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void Destroy()
    {
        Toast("onDestroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void Pause()
    {
        Toast("onPause");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void Resume()
    {
        Toast("onResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void Stop()
    {
        Toast("onStop");
    }
}
