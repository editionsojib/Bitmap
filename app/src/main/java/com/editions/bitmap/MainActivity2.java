package com.editions.bitmap;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;
//    Bitmap r_Bitmap;  //==================== Fast step bitmap===========
    public static Bitmap R_Bitmap= null; //==================== secound step bitmap=====================

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


       imageView= findViewById(R.id.imageReceive);

//         //==================== Fast step bitmap===========
//        r_Bitmap= MainActivity.s_Bitmap;
//
//        imageView.setImageBitmap(r_Bitmap); //==================== Fast step bitmap ===========
////

        //==================== secound step bitmap=====================

        if (R_Bitmap!=null) imageView.setImageBitmap(R_Bitmap);






    }
}