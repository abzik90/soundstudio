package com.hikari.soundstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript if needed
        webView.loadUrl("https://xn--80aafgpbecaw4ctghpk9q.xn--p1ai/"); // Load your desired URL

    }
}