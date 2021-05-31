package com.example.appfood.ui.cream;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CreamViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public CreamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cream fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
