package com.example.funnyplansv1.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenidos a nuestra APP !FUNNY PLANS¡, en el que serás el mejor anfitrión. ¿Qué esperas?");
    }

    public LiveData<String> getText() {
        return mText;
    }
}