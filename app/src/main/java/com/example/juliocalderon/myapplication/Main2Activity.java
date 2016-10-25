package com.example.juliocalderon.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (AccessToken.getCurrentAccessToken() == null){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    public void logout(View view){
        LoginManager.getInstance().logOut();
        FirebaseAuth.getInstance().signOut();
        Intent i =new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void irForoGeneral(View view) {
        Intent i =new Intent(this, ForoGeneral.class);
        startActivity(i);
    }
}
