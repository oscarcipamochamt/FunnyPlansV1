package com.example.funnyplansv1.ui.sucursales;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SucursalesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SucursalesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aquí nos podrás ubicar si deseas visitarnos.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}