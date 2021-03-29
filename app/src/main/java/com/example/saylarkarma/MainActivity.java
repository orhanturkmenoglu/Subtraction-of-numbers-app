package com.example.saylarkarma;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout lnr1;
    private LinearLayout lnr2;
    private LinearLayout lnr3;
    private LinearLayout lnr4;
    int kategori=1;
    int tablo =1;
    Context context;
    Class<?>cls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        context=getApplicationContext();
        nextActivity();

    }

    private void nextActivity() {
        lnr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context,activity_tables.class);
                startActivity(intent);

            }
        });
        lnr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,activity_ogrenme.class);
                startActivity(intent);
            }
        });
        lnr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,activity_test.class);
                startActivity(intent);
            }
        });


        lnr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.setsoft.semihtr13.englishforkids"));
                startActivity(intent);
            }
        });

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setIcon(R.drawable.info);
        builder.setTitle("Çıkış");
        builder.setMessage("Çıkış yapmak istiyor musunuz ?");
        builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();



    }



    private void findView() {
        lnr1=findViewById(R.id.lnr1);
        lnr2=findViewById(R.id.lnr2);
        lnr3=findViewById(R.id.lnr3);
        lnr4=findViewById(R.id.lnr4);

    }
}