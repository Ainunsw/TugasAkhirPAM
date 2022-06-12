package com.example.keluhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TambahData extends AppCompatActivity {

    EditText nama, nim, jurusan, keluhan;
    Button kirim, kembali;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        nama = (EditText) findViewById(R.id.nama);
        nim = (EditText) findViewById(R.id.nim);
        jurusan = (EditText) findViewById(R.id.jurusan);
        keluhan = (EditText) findViewById(R.id.keluhan);
        kirim = (Button) findViewById(R.id.btnkirim);
        kembali = (Button) findViewById(R.id.btnkembali);

        databaseReference = FirebaseDatabase.getInstance().getReference().child("user");
        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambah();
            }
        });
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TambahData.this, Mahasiswa.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void tambah() {
        String txtNama = nama.getText().toString();
        String txtNim = nim.getText().toString();
        String txtJurusan = jurusan.getText().toString();
        String txtKeluhan = keluhan.getText().toString();

        model model_ = new model(txtNama, txtNim, txtJurusan,txtKeluhan);
        databaseReference.push().setValue(model_);
        Toast.makeText(TambahData.this, "Data berhasil dikirim!", Toast.LENGTH_SHORT).show();

    }
}