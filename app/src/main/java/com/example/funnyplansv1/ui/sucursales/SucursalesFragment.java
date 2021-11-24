package com.example.funnyplansv1.ui.sucursales;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.funnyplansv1.databinding.FragmentGalleryBinding;
import com.example.funnyplansv1.databinding.FragmentSucursalesBinding;
import com.example.funnyplansv1.ui.gallery.GalleryViewModel;

public class SucursalesFragment extends Fragment {

    private SucursalesViewModel sucursalesViewModel;
    private FragmentSucursalesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sucursalesViewModel =
                new ViewModelProvider(this).get(SucursalesViewModel.class);

        binding = FragmentSucursalesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSucursales;
        sucursalesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}