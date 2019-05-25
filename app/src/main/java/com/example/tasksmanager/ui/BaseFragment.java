package com.example.tasksmanager.ui;

/* Created by Raúl Gómez on 23/05/2019 */

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* Abstract fragment to gives base implementation for the others fragments */

public abstract class BaseFragment extends Fragment {

    /* Fragment id for inflate */
    protected int layoutId;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(layoutId, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onStart() {
        super.onStart();
        initViews();
    }

    protected abstract void initViews();

}
