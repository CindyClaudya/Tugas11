package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.e.proteintracker.Adapter.MahasiswaAdapter;
import com.e.proteintracker.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        setContentView(R.layout.card_view_mhs);
        addData();
        cardView = findViewById(R.id.rvMahasiswa);
        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void addData() {
        mahasiswaArrayList.add(new Mahasiswa("72170112", "Yalina Hosea", "Perempuan",
                "Menghabiskan Uang", "Sosialita", "Kemewahan adalah Saya" ));
        mahasiswaArrayList.add(new Mahasiswa("72170155", "Angga Dwi", "Laki",
                "multimedia", "hacker", "Diam Tapi Betindak"));

        mahasiswaArrayList.add(new Mahasiswa("72170160", "Mika Havennia Sirait", "Perempuan",
                "Main alat musik", "Selebgram", "Never Give Up"));
        mahasiswaArrayList.add(new Mahasiswa("72170166", "Marni Eva Saragih", "Perempuan",
                "Jualan USDA di setiap event kepanitiaan", "Penjual Obat Penumbuh, Pembesar, Pelangsing dan Perapet"
       , "Jualan is my Fashion"));

    }
}
