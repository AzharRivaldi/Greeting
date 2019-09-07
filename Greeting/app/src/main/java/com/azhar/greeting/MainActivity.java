package com.azhar.greeting;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ImageView greetImg;
    TextView greetText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greetImg = findViewById(R.id.greeting_img);
        greetText = findViewById(R.id.greeting_text);

        greeting();

    }

    @SuppressLint("SetTextI18n")
    private void greeting() {
        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (timeOfDay >= 0 && timeOfDay < 12){
            greetText.setText("Selamat Pagi\nAzhar");
            greetImg.setImageResource(R.drawable.img_default_half_morning);
        } else if (timeOfDay >= 12 && timeOfDay < 15) {
            greetText.setText("Selamat Siang\nAzhar");
            greetImg.setImageResource(R.drawable.img_default_half_afternoon);
        } else if (timeOfDay >= 15 && timeOfDay < 18) {
            greetText.setText("Selamat Sore\nAzhar");
            greetImg.setImageResource(R.drawable.img_default_half_without_sun);
        } else if (timeOfDay >= 18 && timeOfDay < 24) {
            greetText.setText("Selamat Malam\nAzhar");
            greetText.setTextColor(Color.WHITE);
            greetImg.setImageResource(R.drawable.img_default_half_night);
        }
    }
}
