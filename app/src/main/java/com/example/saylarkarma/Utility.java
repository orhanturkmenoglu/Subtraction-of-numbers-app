package com.example.saylarkarma;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Utility {
    public static void setNextActivity(Context context, Class<?>cls){
        Intent intent=new Intent(context,cls);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static void showMessage(Context context, String mesaj, boolean isCevap){
        if (isCevap){
            Toast.makeText(context, "Oyun Bitti", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(context, "Oyun Bitti", Toast.LENGTH_LONG).show();
    }
}
