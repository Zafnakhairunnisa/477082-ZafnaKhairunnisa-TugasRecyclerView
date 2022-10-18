package com.example.tugasrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView txtNama, txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.image_view);
        txtNama = findViewById(R.id.txt_nama);
        txtDesc = findViewById(R.id.txt_desc);

        Intent intent = getIntent();

        img.setImageResource(intent.getIntExtra("IMG", 0));
        txtNama.setText(intent.getStringExtra("NAMA"));
        txtDesc.setText(intent.getStringExtra("DESC"));

    }
}