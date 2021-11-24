package com.example.funnyplansv1.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aquí encontrarás los servicios que te ofrecemos para toda ocasión.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}