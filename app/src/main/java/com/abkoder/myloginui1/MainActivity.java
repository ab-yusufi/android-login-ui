package com.abkoder.myloginui1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private Button btnJoinHere;
    private LinearLayout linearLoginForm, linearFormText;
    private CardView logoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJoinHere = findViewById(R.id.btn_join_here);
        linearLoginForm = findViewById(R.id.linearLoginForm);
        linearFormText = findViewById(R.id.linearFormText);
        logoCard = findViewById(R.id.logoCard);

        //START ANIMATIONS

        linearLoginForm.setAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.form_anim
                ));

        logoCard.setAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.logo_anim
        ));

        linearFormText.setAnimation(AnimationUtils.loadAnimation(
                getApplicationContext(),
                R.anim.form_text_anim
        ));

        btnJoinHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
                overridePendingTransition(0,0);

            }
        });
    }
}