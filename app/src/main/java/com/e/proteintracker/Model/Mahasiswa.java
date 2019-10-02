package com.e.proteintracker.Model;

import android.media.Image;

public class Mahasiswa {
    private String Nim;
    private String Nama;
    private String Gender;
    private String Hobby;
    private String Cita;
    private String Moto;
    private Image Image;

    public Mahasiswa(String nim, String nama, String gender, String hobby, String cita, String moto) {
        this.setNim(Nim);
        this.setNama(Nama);
        this.setGender(Gender);
        this.setHobby(Hobby);
        this.setCita(Cita);
        this.setMoto(Moto);

    }

    public String setNim(String nim) {
        return setNim(nim);
    }
    public int getNim() {
        return getNim();
    }

    public String setNama(String nama) {
        return setNama(nama);
    }
        public int getNama() {
            return getNama();
    }

    public String setGender(String gender) {
        return setGender(gender);
    }
    public int getGender() {
        return getGender();
    }
    public String setHobby(String hobby) {
        return setHobby(hobby);
    }
    public int getHobby() {
        return getHobby();
    }
    public String setCita(String cita) {
        return setCita(cita);
    }
    public int getCita() {
        return getCita();
    }
    public String setMoto(String moto) {
        return setMoto(moto);
    }
    public int getMoto() {
        return getMoto();
    }
    public Image setImage(Image Image){
        return setImage(Image);
    }


}

