package com.e.proteintracker.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.proteintracker.Model.Mahasiswa;
import com.e.proteintracker.R;

import java.text.CollationElementIterator;
import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>{
    ArrayList<Mahasiswa> mahasiswaArrayList;

    public MahasiswaAdapter(ArrayList<Mahasiswa>mahasiswaArrayList){
        this.mahasiswaArrayList = mahasiswaArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {   //menghubungkan data, data dari konstruktor .
        holder.txtNim.setText(mahasiswaArrayList.get(position).getNim());
        holder.txtNama.setText(mahasiswaArrayList.get(position).getNama());
        holder.txtGender.setText(mahasiswaArrayList.get(position).getGender());


    }

    @Override
    public int getItemCount() {
        return (mahasiswaArrayList !=null)? mahasiswaArrayList.size() :0;   //jika array mhs 0 maka akan kmbli ke ukuran array list awal
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNim, txtNama, txtGender, txtCita, txtHobby, txtMoto, img;

        public ViewHolder(View view) {
            super(view);
            txtNama = view.findViewById(R.id.txtNama);
            txtNim = view.findViewById(R.id.txtNim);
            txtGender = view.findViewById(R.id.txtGender);
            txtCita = view.findViewById(R.id.txtCita_Cita);
            txtHobby = view.findViewById(R.id.txtHobby);


        }


    }
}
