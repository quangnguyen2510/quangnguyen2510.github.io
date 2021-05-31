package com.example.appfood.ui.beverage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BeverageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BeverageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is beverage fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}