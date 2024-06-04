package com.editions.bitmap;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import
        android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Button button;
//    public static Bitmap s_Bitmap; //==================== Fast step bitmap==========

    Bitmap S_Bitmap; //==================== secound step bitmap==========



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imageView= findViewById(R.id.imageView);
        button= findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {  //==================== Fast step bitmap===========
//            @Override
//            public void onClick(View v) {
//
//                s_Bitmap= ((BitmapDrawable) imageView.getDrawable()).getBitmap();
//
//                startActivity(new Intent(MainActivity.this, MainActivity2.class));
//
//
//            }
//        });  //==================== Fast step bitmap===========

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                S_Bitmap= ((BitmapDrawable) imageView.getDrawable()).getBitmap();

                MainActivity2.R_Bitmap= S_Bitmap;

                startActivity(new Intent(MainActivity.this, MainActivity2.class));


            }
        });






    }
}