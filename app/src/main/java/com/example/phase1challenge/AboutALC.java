package com.example.phase1challenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        myWebView = findViewById(R.id.webView);
        myWebView.loadUrl("https://andela.com");

     //   myWebView.setWebViewClient(new WebViewClient());


    }
}
