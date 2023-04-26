package com.example.hw423;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText IDEdText;
    private EditText Place1EdText;
    private EditText Time1EdText;
    private EditText Place2EdText;
    private EditText Time2EdText;
    private EditText MoneyEdText;
    private Button button;
    private String sIDEdText;
    private String sPlace1EdText;
    private String sTime1EdText;
    private String sPlace2EdText;
    private String sTime2EdText;
    private String sMoneyEdText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        IDEdText = findViewById(R.id.ID);
        Place1EdText = findViewById(R.id.Place1);
        Time1EdText = findViewById(R.id.Time1);
        Place2EdText = findViewById(R.id.Place2);
        Time2EdText = findViewById(R.id.Time2);
        MoneyEdText = findViewById(R.id.Money);

        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sIDEdText = IDEdText.getText().toString();
                sPlace1EdText = Place1EdText.getText().toString();
                sTime1EdText = Time1EdText.getText().toString();
                sPlace2EdText = Place2EdText.getText().toString();
                sTime2EdText = Time2EdText.getText().toString();
                sMoneyEdText = MoneyEdText.getText().toString();

                User user = new User(sIDEdText,sPlace1EdText,sTime1EdText,sPlace2EdText,sTime2EdText,sMoneyEdText);
                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                intent.putExtra("user1", user);
                startActivity(intent);
            }
        });

    }
}