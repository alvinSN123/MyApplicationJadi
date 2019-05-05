package com.example.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//alvin satria nugraha
// 10116064

// tanggal 27 - 1 menentukan disign
//tanggal 29 - 2 membuat navigation bar menu
//tanggal 3 mei 2019 membuat Walkthrougt
// tanggal 4 mei 2019 membuat reycle view
// tanggal 5 mei 2019 membuat isi menu

public class ProfileFragment extends Fragment {

    Dialog myDialog;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);


    }
}
