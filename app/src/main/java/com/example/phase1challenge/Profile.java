package com.example.phase1challenge;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private ImageView mProfile;
    private TextView mName;
    private TextView mTrack;
    private TextView mCountry;
    private TextView mEmail;
    private TextView mPhoneNumber;
    private TextView mUsername;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        mProfile = findViewById(R.id.profile);
        mName = findViewById(R.id.name_txt);
        mTrack = findViewById(R.id.track_txt);
        mCountry = findViewById(R.id.country_txt);
        mEmail = findViewById(R.id.email_txt);
        mPhoneNumber = findViewById(R.id.phone_txt);
        mUsername = findViewById(R.id.username_txt);

    }
}
