package com.example.hw423;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        textView = findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras();
        if (bundle!= null){
            user = (User) bundle.getSerializable("user1");
            textView.setText("ID "+ user.getsIDEdText()+"\n"+"Место отправления  "+user.getsPlace1EdText()+"\n"+"Время отправления  "+user.getsTime1EdText()+"\n"+"Место прибытия  "+user.getsPlace2EdText()+"\n"+"Время прибытия  "+user.getsTime2EdText()+"\n"+"Стоимость (руб) "+user.getsMoneyEdText()+"\n");
        }
        button = findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }
}