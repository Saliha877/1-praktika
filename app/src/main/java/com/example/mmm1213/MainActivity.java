package com.example.mmm1213;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;

    EditText names, cities, educations, fams, interests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.save);
        names = findViewById(R.id.name);
        cities = findViewById(R.id.city);
        educations = findViewById(R.id.education);
        interests = findViewById(R.id.your_interests);
        fams = findViewById(R.id.family_statuse);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Saliha.class);
                String name = names.getText().toString();
                String city = cities.getText().toString();
                String education = educations.getText().toString();
                String fam = fams.getText().toString();
                String interest = interests.getText().toString();
                intent.putExtra ("name", name) ;
                intent. putExtra ( "city", city);
                intent. putExtra ("education", education);
                intent. putExtra("family_statuse",fam);
                intent. putExtra ( "interest" , interest);

                startActivity(intent);

            }
        });







    }
}