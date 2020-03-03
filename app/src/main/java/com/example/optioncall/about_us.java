package com.example.optioncall;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class about_us extends AppCompatActivity {
    TextView shape1,shape2,shape3;
    private CheckBox etiscad1, vodacard1, wecard1,orangcard1;
    private CheckBox etiscad2, vodacard2, wecard2,orangcard2;
    private Button btnDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        shape1=findViewById(R.id.f1);
        shape2=findViewById(R.id.f2);
        shape3=findViewById(R.id.f3);

        shape1.setTypeface(Typeface.createFromAsset(getAssets(),"Italian Mosaic Ornaments.ttf"));
        shape2.setTypeface(Typeface.createFromAsset(getAssets(),"Italian Mosaic Ornaments.ttf"));
        shape3.setTypeface(Typeface.createFromAsset(getAssets(),"Italian Mosaic Ornaments.ttf"));

        etiscad1=findViewById(R.id.etis1);
        etiscad2=findViewById(R.id.etis2);

        vodacard1=findViewById(R.id.voda1);
        vodacard2=findViewById(R.id.voda2);

        wecard1=findViewById(R.id.we1);
        wecard2=findViewById(R.id.we2);

        orangcard1=findViewById(R.id.ora1);
        orangcard2=findViewById(R.id.ora2);





    }
}
