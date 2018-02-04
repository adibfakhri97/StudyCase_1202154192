package com.example.adibf.studycase;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView textView,textView1,textView2;
    Toast uangKurang,uangCukup;
    Context context;
    Intent intent;
    public int saldo = 65500;
    private int jumlah;
    private int total;

    private String nama_menu;
    private String banyak_porsi;
    private String total_harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        context = getApplicationContext();

        uangKurang = Toast.makeText(context, "Uang anda tidak mencukupi", Toast.LENGTH_LONG);
        uangCukup = Toast.makeText(context,"Anda dapat makan malam disini", Toast.LENGTH_LONG);

        textView = (TextView) findViewById(R.id.nama_makanan);
        textView1 = (TextView) findViewById(R.id.jumlah_porsi);
        textView2 = (TextView) findViewById(R.id.total_harga);

        intent = getIntent();

        nama_menu = intent.getStringExtra("Nama Makanan");

        jumlah = intent.getIntExtra("Banyak Porsi", 0);
        banyak_porsi = Integer.toString(jumlah);

        total = intent.getIntExtra("Total Harga", 0);
        total_harga = Integer.toString(total);




        textView.setText(nama_menu);
        textView1.setText(banyak_porsi);
        textView2.setText(total_harga);

        if (saldo >= total){
            uangCukup.show();

        }else{
            uangKurang.show();

        }

    }
}
