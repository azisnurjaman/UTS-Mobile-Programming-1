package com.example.kasir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText Nama, qhgcr, qbb, qrf, qicc, qfo, qff;
    Button pesan;
    String ONama, OCHgcr, OCBb, OCRf, OCIcc, OCFo, OCFf, OQhgcr, OQbb, OQrf, OQicc, OQfo, OQff;
    CheckBox CHgcr, CBb, CRf, CIcc, CFo, CFf;
    int subtot, t;
    int pajak;
    int dd, m, yyyy;
    Calendar c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama = (EditText)findViewById(R.id.Nama);
        qhgcr = (EditText)findViewById(R.id.QHGCR);
        qbb = (EditText)findViewById(R.id.QBB);
        qrf = (EditText)findViewById(R.id.QRF);
        qicc = (EditText)findViewById(R.id.QICC);
        qfo = (EditText)findViewById(R.id.QFO);
        qff = (EditText)findViewById(R.id.QFF);
        CHgcr = (CheckBox) findViewById(R.id.HGCR);
        CBb = (CheckBox) findViewById(R.id.BB);
        CRf = (CheckBox) findViewById(R.id.RF);
        CIcc = (CheckBox) findViewById(R.id.ICC);
        CFo = (CheckBox) findViewById(R.id.FO);
        CFf = (CheckBox) findViewById(R.id.FF);
        pesan = (Button) findViewById(R.id.Pesan);

        pesan.setOnClickListener((v) -> {
            ONama = Nama.getText().toString();

            if (CHgcr.isChecked()){
                int harga1 = 35000;
                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OQhgcr = qhgcr.getText().toString();
                int q1 = Integer.parseInt(OQhgcr);
                subtot = harga1 * q1;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked()){
                int harga2 = 30000;
                OCBb = "Beef Burger - Rp."+harga2;
                OQbb = qbb.getText().toString();
                int q2 = Integer.parseInt(OQbb);
                subtot = harga2 * q2;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CRf.isChecked()){
                int harga3 = 25000;
                OCRf = "Regular Fries - Rp."+harga3;
                OQrf = qrf.getText().toString();
                int q3 = Integer.parseInt(OQrf);
                subtot = harga3 * q3;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CIcc.isChecked()){
                int harga4 = 10000;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OQicc = qicc.getText().toString();
                int q4 = Integer.parseInt(OQicc);
                subtot = harga4 * q4;
                pajak = subtot * 10/100;
                t = subtot - pajak;
             }
            if (CFo.isChecked()){
                int harga5 = 18000;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OQfo = qfo.getText().toString();
                int q5 = Integer.parseInt(OQfo);
                subtot = harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CFf.isChecked()){
                int harga6 = 15000;
                OCFf = "Fanta Float - Rp."+harga6;
                OQff = qff.getText().toString();
                int q6 = Integer.parseInt(OQff);
                subtot = harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CBb.isChecked()){
                int harga1 = 35000;
                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OQhgcr = qhgcr.getText().toString();
                int q1 = Integer.parseInt(OQhgcr);

                int harga2 = 30000;
                OCBb = "Beef Burger - Rp."+harga2;
                OQbb = qbb.getText().toString();
                int q2 = Integer.parseInt(OQbb);

                subtot = harga1 * q1+harga2 * q2;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CBb.isChecked() && CRf.isChecked()){
                int harga1 = 35000;
                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OQhgcr = qhgcr.getText().toString();
                int q1 = Integer.parseInt(OQhgcr);

                int harga2 = 30000;
                OCBb = "Beef Burger - Rp."+harga2;
                OQbb = qbb.getText().toString();
                int q2 = Integer.parseInt(OQbb);

                int harga3 = 25000;
                OCRf = "Regular Fries - Rp."+harga3;
                OQrf = qrf.getText().toString();
                int q3 = Integer.parseInt(OQrf);

                subtot = harga1 * q1+harga2 * q2+harga3 * q3;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CBb.isChecked() && CRf.isChecked() && CIcc.isChecked()){
                int harga1 = 35000;
                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OQhgcr = qhgcr.getText().toString();
                int q1 = Integer.parseInt(OQhgcr);

                int harga2 = 30000;
                OCBb = "Beef Burger - Rp."+harga2;
                OQbb = qbb.getText().toString();
                int q2 = Integer.parseInt(OQbb);

                int harga3 = 25000;
                OCRf = "Regular Fries - Rp."+harga3;
                OQrf = qrf.getText().toString();
                int q3 = Integer.parseInt(OQrf);

                int harga4 = 10000;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OQicc = qicc.getText().toString();
                int q4 = Integer.parseInt(OQicc);

                subtot = harga1 * q1+harga2 * q2+harga3 * q3+harga4 * q4;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CBb.isChecked() && CRf.isChecked() && CIcc.isChecked() && CFo.isChecked()){
                int harga1 = 35000;
                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OQhgcr = qhgcr.getText().toString();
                int q1 = Integer.parseInt(OQhgcr);

                int harga2 = 30000;
                OCBb = "Beef Burger - Rp."+harga2;
                OQbb = qbb.getText().toString();
                int q2 = Integer.parseInt(OQbb);

                int harga3 = 25000;
                OCRf = "Regular Fries - Rp."+harga3;
                OQrf = qrf.getText().toString();
                int q3 = Integer.parseInt(OQrf);

                int harga4 = 10000;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OQicc = qicc.getText().toString();
                int q4 = Integer.parseInt(OQicc);

                int harga5 = 18000;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OQfo = qfo.getText().toString();
                int q5 = Integer.parseInt(OQfo);

                subtot = harga1 * q1+harga2 * q2+harga3 * q3+harga4 * q4+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CBb.isChecked() && CRf.isChecked() && CIcc.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga1 = 35000;
                int harga2 = 30000;
                int harga3 = 25000;
                int harga4 = 10000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCBb = "Beef Burger - Rp."+harga2;
                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQhgcr = qhgcr.getText().toString();
                OQbb = qbb.getText().toString();
                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q2 = Integer.parseInt(OQbb);
                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga1 * q1+harga2 * q2+harga3 * q3+harga4 * q4+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CRf.isChecked()){
                int harga1 = 35000;
                int harga3 = 25000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCRf = "Regular Fries - Rp."+harga3;

                OQhgcr = qhgcr.getText().toString();
                OQrf = qrf.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q3 = Integer.parseInt(OQrf);

                subtot = harga1 * q1+harga3 * q3;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CRf.isChecked() && CIcc.isChecked()){
                int harga1 = 35000;
                int harga3 = 25000;
                int harga4 = 10000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;

                OQhgcr = qhgcr.getText().toString();
                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);

                subtot = harga1 * q1+harga3 * q3+harga4 * q4;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CRf.isChecked() && CIcc.isChecked() && CFo.isChecked()){
                int harga1 = 35000;
                int harga3 = 25000;
                int harga4 = 10000;
                int harga5 = 18000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQhgcr = qhgcr.getText().toString();
                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga1 * q1+harga3 * q3+harga4 * q4+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CRf.isChecked() && CIcc.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga1 = 35000;
                int harga3 = 25000;
                int harga4 = 10000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQhgcr = qhgcr.getText().toString();
                OQbb = qbb.getText().toString();
                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga1 * q1+harga3 * q3+harga4 * q4+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CIcc.isChecked()){
                int harga1 = 35000;
                int harga4 = 10000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCIcc = "Ice Cream Cone - Rp."+harga4;

                OQhgcr = qhgcr.getText().toString();
                OQicc = qicc.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q4 = Integer.parseInt(OQicc);

                subtot = harga1 * q1+harga4 * q4;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CIcc.isChecked() && CFo.isChecked()){
                int harga1 = 35000;
                int harga4 = 10000;
                int harga5 = 18000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQhgcr = qhgcr.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga1 * q1+harga4 * q4+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CIcc.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga1 = 35000;
                int harga4 = 10000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQhgcr = qhgcr.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga1 * q1+harga4 * q4+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CFo.isChecked()){
                int harga1 = 35000;
                int harga5 = 18000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQhgcr = qhgcr.getText().toString();
                OQfo = qfo.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga1 * q1+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga1 = 35000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQhgcr = qhgcr.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga1 * q1+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CHgcr.isChecked() && CFf.isChecked()){
                int harga1 = 35000;
                int harga6 = 15000;

                OCHgcr = "Honey Garlic Chicken Rice - Rp."+harga1;
                OCFf = "Fanta Float - Rp."+harga6;

                OQhgcr = qhgcr.getText().toString();
                OQff = qff.getText().toString();

                int q1 = Integer.parseInt(OQhgcr);
                int q6 = Integer.parseInt(OQff);

                subtot = harga1 * q1+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CRf.isChecked()){
                int harga2 = 30000;
                int harga3 = 25000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCRf = "Regular Fries - Rp."+harga3;

                OQbb = qbb.getText().toString();
                OQrf = qrf.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q3 = Integer.parseInt(OQrf);

                subtot = harga2 * q2+harga3 * q3;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CRf.isChecked() && CIcc.isChecked()){
                int harga2 = 30000;
                int harga3 = 25000;
                int harga4 = 10000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;


                OQbb = qbb.getText().toString();
                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);

                subtot = harga2 * q2+harga3 * q3+harga4 * q4;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CRf.isChecked() && CIcc.isChecked() && CFo.isChecked()){
                int harga2 = 30000;
                int harga3 = 25000;
                int harga4 = 10000;
                int harga5 = 18000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQbb = qbb.getText().toString();
                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga2 * q2+harga3 * q3+harga4 * q4+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CRf.isChecked() && CIcc.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga2 = 30000;
                int harga3 = 25000;
                int harga4 = 10000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQbb = qbb.getText().toString();
                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga2 * q2+harga3 * q3+harga4 * q4+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CIcc.isChecked()){
                int harga2 = 30000;
                int harga4 = 10000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCIcc = "Ice Cream Cone - Rp."+harga4;

                OQbb = qbb.getText().toString();
                OQicc = qicc.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q4 = Integer.parseInt(OQicc);

                subtot = harga2 * q2+harga4 * q4;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CIcc.isChecked() && CFo.isChecked()){
                int harga2 = 30000;
                int harga4 = 10000;
                int harga5 = 18000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQbb = qbb.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);

                subtot =harga2 * q2+harga4 * q4+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CIcc.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga2 = 30000;
                int harga4 = 10000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQbb = qbb.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga2 * q2+harga4 * q4+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CFo.isChecked()){
                int harga2 = 30000;
                int harga5 = 18000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQbb = qbb.getText().toString();
                OQfo = qfo.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga2 * q2+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga2 = 30000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQbb = qbb.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga2 * q2+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CBb.isChecked() && CFf.isChecked()){
                int harga2 = 30000;
                int harga6 = 15000;

                OCBb = "Beef Burger - Rp."+harga2;
                OCFf = "Fanta Float - Rp."+harga6;

                OQbb = qbb.getText().toString();
                OQff = qff.getText().toString();

                int q2 = Integer.parseInt(OQbb);
                int q6 = Integer.parseInt(OQff);

                subtot =harga2 * q2+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CRf.isChecked() && CIcc.isChecked()){
                int harga3 = 25000;
                int harga4 = 10000;

                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;

                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();

                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);

                subtot = harga3 * q3+harga4 * q4;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CRf.isChecked() && CIcc.isChecked() && CFo.isChecked()){
                int harga3 = 25000;
                int harga4 = 10000;
                int harga5 = 18000;

                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();

                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga3 * q3+harga4 * q4+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CRf.isChecked() && CIcc.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga3 = 25000;
                int harga4 = 10000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCRf = "Regular Fries - Rp."+harga3;
                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQrf = qrf.getText().toString();
                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q3 = Integer.parseInt(OQrf);
                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga3 * q3+harga4 * q4+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CRf.isChecked() && CFo.isChecked()){
                int harga3 = 25000;
                int harga5 = 18000;

                OCRf = "Regular Fries - Rp."+harga3;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQrf = qrf.getText().toString();
                OQfo = qfo.getText().toString();

                int q3 = Integer.parseInt(OQrf);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga3 * q3+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CRf.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga3 = 25000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCRf = "Regular Fries - Rp."+harga3;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQrf = qrf.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q3 = Integer.parseInt(OQrf);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga3 * q3+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CRf.isChecked() && CFf.isChecked()){
                int harga3 = 25000;
                int harga6 = 15000;

                OCRf = "Regular Fries - Rp."+harga3;
                OCFf = "Fanta Float - Rp."+harga6;

                OQrf = qrf.getText().toString();
                OQff = qff.getText().toString();

                int q3 = Integer.parseInt(OQrf);
                int q6 = Integer.parseInt(OQff);

                subtot = harga3 * q3+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CIcc.isChecked() && CFo.isChecked()){
                int harga4 = 10000;
                int harga5 = 18000;

                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;

                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();

                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);

                subtot = harga4 * q4+harga5 * q5;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CIcc.isChecked() && CFo.isChecked() && CFf.isChecked()){
                int harga4 = 10000;
                int harga5 = 18000;
                int harga6 = 15000;

                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQicc = qicc.getText().toString();
                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q4 = Integer.parseInt(OQicc);
                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga4 * q4+harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CIcc.isChecked() && CFf.isChecked()){
                int harga4 = 10000;
                int harga6 = 15000;

                OCIcc = "Ice Cream Cone - Rp."+harga4;
                OCFf = "Fanta Float - Rp."+harga6;

                OQicc = qicc.getText().toString();
                OQff = qff.getText().toString();

                int q4 = Integer.parseInt(OQicc);
                int q6 = Integer.parseInt(OQff);

                subtot = harga4 * q4+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }
            if (CFo.isChecked() && CFf.isChecked()){
                int harga5 = 18000;
                int harga6 = 15000;

                OCFo = "Flurry Oreo - Rp."+harga5;
                OCFf = "Fanta Float - Rp."+harga6;

                OQfo = qfo.getText().toString();
                OQff = qff.getText().toString();

                int q5 = Integer.parseInt(OQfo);
                int q6 = Integer.parseInt(OQff);

                subtot = harga5 * q5+harga6 * q6;
                pajak = subtot * 10/100;
                t = subtot - pajak;
            }

            c = Calendar.getInstance();
            dd = c.get(Calendar.DATE);
            m = c.get(Calendar.MONTH);
            yyyy = c.get(Calendar.YEAR);
            int mm = m+1;

            String DateFormat = dd+"/"+mm+"/"+yyyy;

            String msg = "Silahkan Lakukan Pembayaran";
            Toast toast = Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT);
            toast.show();

            Intent i = null;
            i = new Intent(MainActivity.this, Struk.class);
            Bundle b = new Bundle();
            b.putString("parse_nama", String.valueOf(ONama));
            b.putString("parse_qhgcr", String.valueOf(OQhgcr));
            b.putString("parse_qbb", String.valueOf(OQbb));
            b.putString("parse_qrf", String.valueOf(OQrf));
            b.putString("parse_qicc", String.valueOf(OQicc));
            b.putString("parse_qfo", String.valueOf(OQfo));
            b.putString("parse_qff", String.valueOf(OQff));
            b.putString("parse_CHgcr", String.valueOf(OCHgcr));
            b.putString("parse_CBb", String.valueOf(OCBb));
            b.putString("parse_CRf", String.valueOf(OCRf));
            b.putString("parse_CIcc", String.valueOf(OCIcc));
            b.putString("parse_CFo", String.valueOf(OCFo));
            b.putString("parse_CFf", String.valueOf(OCFf));
            b.putInt("subTotal", subtot);
            b.putInt("pajak", pajak);
            b.putInt("total", t);
            b.putString("tgl", DateFormat);

            i.putExtras(b);
            startActivity(i);
        });
    }
}