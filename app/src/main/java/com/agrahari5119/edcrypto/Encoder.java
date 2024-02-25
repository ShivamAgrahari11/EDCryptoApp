package com.agrahari5119.edcrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Encoder extends AppCompatActivity {

    EditText etenc;
    TextView enctv;
    ClipboardManager cpb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoder);

        etenc=findViewById(R.id.etenc);
        enctv=findViewById(R.id.enctv);
        cpb=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);

    }
    public void enc(View View){
        String temp=etenc.getText().toString();
        String rv=encode.enc(temp);
        enctv.setText(rv);
    }
    public void cp2(View View){
        String data= enctv.getText().toString().trim();
        if(!data.isEmpty()){
            ClipData temp=ClipData.newPlainText("text", data);
            cpb.setPrimaryClip(temp);
            Toast.makeText(this, "copied", Toast.LENGTH_LONG).show();
        }
    }
}