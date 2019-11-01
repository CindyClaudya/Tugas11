package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.e.proteintracker.Adapter.MahasiswaAdapter;
import com.e.proteintracker.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    private CardView cardView;
    private ListView listView;

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
        new DividerItemDecoration(this, LinearLayout.VERTICAL);
        String contextManus[] = {"Protein", "Vitaminn", "Mineral"};
        listView.setAdapter(new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, contextManus));
        registerForContextMenu(listView);
    }


    private void addData() {
        mahasiswaArrayList.add(new Mahasiswa("72170112", "Yalina Hosea", "Perempuan",
                "Menghabiskan Uang", "Sosialita", "Kemewahan adalah Saya"));
        mahasiswaArrayList.add(new Mahasiswa("72170155", "Angga Dwi", "Laki",
                "multimedia", "hacker", "Diam Tapi Betindak"));

        mahasiswaArrayList.add(new Mahasiswa("72170160", "Mika Havennia Sirait", "Perempuan",
                "Main alat musik", "Selebgram", "Never Give Up"));
        mahasiswaArrayList.add(new Mahasiswa("72170166", "Marni Eva Saragih", "Perempuan",
                "Jualan USDA di setiap event kepanitiaan", "Penjual Obat Penumbuh, Pembesar, Pelangsing dan Perapet"
                , "Jualan is my Fashion"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu Menu) {
        getMenuInflater().inflate(R.menu.optionmenu, Menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "Item 1 Terpilih", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Item 2 Terpilih", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "Item 3 Terpilih", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}