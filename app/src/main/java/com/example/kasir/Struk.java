package com.example.kasir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.*;

public class Struk extends AppCompatActivity {
    TextView Nama, SubTot, Date, Tot, Pajak, Pesanan, Kembali;
    EditText Pay;
    Integer subTot, t, p, kembali;
    String nama, date, pesanan1, pesanan2, pesanan3, pesanan4, pesanan5, pesanan6, q1, q2, q3, q4, q5, q6, pay;
    Button Bayar, Selesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_struk);

        Date = (TextView) findViewById(R.id.Date);
        Nama = (TextView) findViewById(R.id.NamaPemesan);
        Pesanan = (TextView) findViewById(R.id.Pesanan);
        SubTot = (TextView) findViewById(R.id.SubT);
        Tot = (TextView) findViewById(R.id.Tot);
        Pajak = (TextView) findViewById(R.id.Pajak);
        Pay = (EditText) findViewById(R.id.Pay);
        Kembali = (TextView) findViewById(R.id.Kembali);


        Bundle b =getIntent().getExtras();
        date = b.getString("tgl");
        nama = b.getString("parse_nama");
        pesanan1 = b.getString("parse_CHgcr");
        pesanan2 = b.getString("parse_CBb");
        pesanan3 = b.getString("parse_CRf");
        pesanan4 = b.getString("parse_CIcc");
        pesanan5 = b.getString("parse_CFo");
        pesanan6 = b.getString("parse_CFf");
        q1 = b.getString("parse_qhgcr");
        q2 = b.getString("parse_qbb");
        q3 = b.getString("parse_qrf");
        q4 = b.getString("parse_qicc");
        q5 = b.getString("parse_qfo");
        q6 = b.getString("parse_qff");
        subTot = b.getInt("subTotal");
        t = b.getInt("total");
        p = b.getInt("pajak");

        Date.setText("Tanggal Pemesanan : "+date);
        Nama.setText("Nama Pemesan : "+nama);
        Pesanan.setText("\n"+pesanan1+" × "+q1+"\n"+pesanan2+" × "+q2+"\n"+pesanan3+" × "+q3+"\n"+pesanan4+" × "+q4+"\n"+pesanan5+" × "+q5+"\n"+pesanan6+" × "+q6+"\n");
        SubTot.setText("Sub Total : "+subTot);
        Pajak.setText("Pajak : "+p);
        Tot.setText("Total : "+t);

        Bayar = (Button) findViewById(R.id.Bayar);
        Bayar.setOnClickListener((v)->{
            Bundle a =getIntent().getExtras();
            int total = a.getInt("total");
            pay = Pay.getText().toString();
            int payment = Integer.parseInt(pay);
            int hasil = payment - total;
            Kembali.setText("Kembali : "+hasil);
        });

        Selesai = (Button) findViewById(R.id.Selesai);
        Selesai.setOnClickListener((v)->{
            Intent i = null;
            String msg = "Silahkan Masukan Pesanan";
            Toast toast = Toast.makeText(Struk.this, msg, Toast.LENGTH_LONG);
            toast.show();
            i = new Intent(Struk.this, MainActivity.class);
            startActivity(i);

        });

    }
}