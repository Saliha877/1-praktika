package com.example.mmm1213;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Saliha extends AppCompatActivity {

    TextView nameText, cityText, educationText, famStatus, interesText;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saliha);
        Intent intent = getIntent();
        nameText = findViewById(R.id.nameT);
        cityText = findViewById(R.id.cityT);
        educationText = findViewById(R.id.educationT);
        famStatus = findViewById(R.id.famT);
        interesText = findViewById(R.id.interestedT);
        backBtn = findViewById(R.id.saveT);

        nameText.setText(String.valueOf(intent.getStringExtra("name")));
        cityText.setText(String.valueOf(intent.getStringExtra("city")));
        educationText.setText(String.valueOf(intent.getStringExtra("education")));
        famStatus.setText(String.valueOf(intent.getStringExtra("fam")));
        interesText.setText(String.valueOf(intent.getStringExtra("interest")));
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Saliha.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }

}