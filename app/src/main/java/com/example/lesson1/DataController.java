package com.example.lesson1;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class DataController {

    private MutableLiveData<String> liveData = new MutableLiveData<>();

    public DataController()
    {
        liveData.setValue("Hello");
    }

    LiveData<String> getData() {
        return liveData;
    }

    void setData(String value)
    {
        liveData.setValue(value);
    }

}
