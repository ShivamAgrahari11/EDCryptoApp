package com.agrahari5119.edcrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
public class MainActivity extends AppCompatActivity {
    Button enc, dec ,abt;
    ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        enc=findViewById(R.id.encd);
        dec=findViewById(R.id.decd);
        enc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp=new Intent(MainActivity.this,Encoder.class);
                startActivity(temp);
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent temp=new Intent(MainActivity.this, Decoder.class);

                startActivity(temp);
            }
        });
        vf=findViewById(R.id.vf);
        int images[]={R.drawable.bellaso_cipher,R.drawable.caesar_cipher_encryption,R.drawable.dorabella_cipher};
        for(int i=0;i<images.length;i++){
            flipper(images[i]);
        }

    }
    public void flipper(int images){
        ImageView test=new ImageView(this);
        test.setBackgroundResource(images);
        vf.addView(test);
        vf.setFlipInterval(3000);
        vf.setAutoStart(true);
        vf.setInAnimation(this,android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }

}