package com.example.adibf.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    private EditText makanan,porsi;
    public int saldo = 65500;
    public int eatbus = 50000;
    public int abnormal = 30000;
    public int total;
    public int jumlah_porsi;

    public String menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makanan = (EditText) findViewById(R.id.edit_nama);
        porsi = (EditText) findViewById(R.id.edit_jumlah);


    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Tombol ditekan!");
        jumlah_porsi = Integer.parseInt(porsi.getText().toString());
        menu = makanan.getText().toString();

        total = jumlah_porsi *eatbus;
        intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Banyak Porsi",jumlah_porsi);
        intent.putExtra("Nama Makanan",menu);
        intent.putExtra("Total Harga", total);
        startActivity(intent);


    }

    public void LaunchSecondActivity2(View view) {
        Log.d(LOG_TAG, "Tombol ditekan!");

        jumlah_porsi = Integer.parseInt(porsi.getText().toString());
        menu = makanan.getText().toString();

        total = jumlah_porsi *abnormal;
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("Banyak Porsi",jumlah_porsi);
        intent.putExtra("Nama Makanan",menu);
        intent.putExtra("Total Harga", total);
        startActivity(intent);

    }
}
