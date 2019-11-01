package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class KelolaMahasiswa extends AppCompatActivity {

    String[] items = {"Brayen Chanzezar Saroinsong", "Arnold Stanley Rivaldy Tato", "Verina Kristanti Wiyono", "Yubelince Naomi Wakum", "Hendry Masiku", "Baskoro Adi Wicaksono", "Yos Rafel Kristanto", "Alfadeo Melody Jeremy Bulin", "Yashinta Novita Dewi", "Yalina Hosea", "Adrian Paskalis", "Desta Siwi P", "Cindy Claudya", "Angkie Octovaldo Elias Wangkay", "Christian Dorra", "Tita Marita Simangunsong", "Angga Dwi Kaharap", "Fransiska Ayu Gloria", "Mika Havennia Sirait", "Marni Eva Kristina Saragih", "Aristyo Rahadian Agung Nugroho", "Laurentia Yulia Cristi", "Putu Abdi SetiawanBrayen Chanzezar Saroinsong", "Arnold Stanley Rivaldy Tato", "Verina Kristanti Wiyono", "Yubelince Naomi Wakum", "Hendry Masiku", "Baskoro Adi Wicaksono", "Yos Rafel Kristanto", "Alfadeo Melody Jeremy Bulin", "Yashinta Novita Dewi", "Yalina Hosea", "Adrian Paskalis", "Desta Siwi P", "Cindy Claudya", "Angkie Octovaldo Elias Wangkay", "Christian Dorra", "Tita Marita Simangunsong", "Angga Dwi Kaharap", "Fransiska Ayu Gloria",
            "Mika Havennia Sirait", "Marni Eva Kristina Saragih",
            "Aristyo Rahadian Agung Nugroho", "Laurentia Yulia Cristi", "Putu Abdi Setiawan"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelola_mahasiswa);
        ListView lv = (ListView) findViewById(R.id.lvMhs);
        // Spinner spinner = findViewById(R.id.mSpinner);
        Button btnAdd3 = (Button) findViewById(R.id.btnAddMhs);
        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KelolaMahasiswa.this, Add.class);
            }
        });

        Button btnEdit3 = (Button) findViewById(R.id.btnEditMhs);
        btnEdit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(KelolaMahasiswa.this, Edit.class);
                startActivity(i);
            }
        });

        lv.setAdapter(new ArrayAdapter<String>(KelolaMahasiswa.this, android.R.layout.simple_list_item_1, items));
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, items);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        //   spinner.setAdapter(aa);

//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainKelolaActivity.this, "anda memilih" + items[position],Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                Toast.makeText(MainKelolaActivity.this,"anda memilih", Toast.LENGTH_SHORT).show();
//            }
//        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(KelolaMahasiswa.this, "anda memilih = " + items[position], Toast.LENGTH_LONG).show();  //toast utk pop up message
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
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
