package com.tondz.nhandienbenhcafeandroid;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class KetQuaActivity extends AppCompatActivity {

    TextView txtKetQua;
    ImageView imgKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);
        txtKetQua = findViewById(R.id.txtKetQua);
        imgKetQua = findViewById(R.id.imgKetQua);
        if (Common.result.isEmpty()) {
            txtKetQua.setText("Khoẻ mạnh");
        } else {
            txtKetQua.setText(Common.result);
        }

        imgKetQua.setImageBitmap(Common.bitmap);

    }
}