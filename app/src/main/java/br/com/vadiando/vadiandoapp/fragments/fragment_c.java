package br.com.vadiando.vadiandoapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.vadiando.vadiandoapp.R;

/**
 * Created by Icons4u TI on 04/05/2017.
 */

public class fragment_c extends Fragment

{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_c,container,false);
    }
}