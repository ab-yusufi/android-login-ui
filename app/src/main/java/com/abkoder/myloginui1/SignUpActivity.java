package com.abkoder.myloginui1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class SignUpActivity extends AppCompatActivity {

    private Button btnLoginHere;
    private LinearLayout linearSignupForm, linearFormText;
    private CardView logoCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnLoginHere = findViewById(R.id.btn_login_here);
        linearSignupForm = findViewById(R.id.linearSignupForm);
        linearFormText = findViewById(R.id.linearFormText);
        logoCard = findViewById(R.id.logoCard);

//        //START ANIMATIONS
//
//        linearSignupForm.setAnimation(AnimationUtils.loadAnimation(
//                getApplicationContext(),
//                R.anim.form_anim
//        ));
//
//        linearFormText.setAnimation(AnimationUtils.loadAnimation(
//                getApplicationContext(),
//                R.anim.form_text_anim
//        ));
//
//        logoCard.setAnimation(AnimationUtils.loadAnimation(
//                getApplicationContext(),
//                R.anim.logo_anim
//        ));


        btnLoginHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
                overridePendingTransition(0,0);
            }
        });
    }
}