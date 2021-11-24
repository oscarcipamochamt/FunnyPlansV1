package com.example.funnyplansv1.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Aquí encontrarás los productos necesarios para iniciar las mejores celebraciones.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}