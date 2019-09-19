package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class FragmentAppMahasiswa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_app_mahasiswa);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.txtNamaFragment, new FragmentDisplay());
        ft.commit();
    }
}
