package com.example.keluhan;

public class model {
    private String nama;
    private String nim;
    private String jurusan;
    private String keluhan;
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }


    public model(){
    }
    public model(String nama, String nim, String jurusan, String keluhan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.keluhan = keluhan;
    }
}
