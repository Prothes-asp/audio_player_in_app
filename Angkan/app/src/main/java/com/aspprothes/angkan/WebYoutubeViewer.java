package com.aspprothes.angkan;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.airbnb.lottie.LottieAnimationView;

public class WebYoutubeViewer extends AppCompatActivity {
    private WebView webView;
    private LottieAnimationView animationView;
    private SwipeRefreshLayout swiperefresh;

    public static String getWebUrl = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.getWindow().setNavigationBarColor(getColor(R.color.transparent));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_youtube_viewer);

        animationView = findViewById(R.id.animationView);
        swiperefresh = findViewById(R.id.swiperefresh);
        webView = findViewById(R.id.webView);

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.setWebChromeClient(new WebChromeClient());
            webView.loadUrl(getWebUrl);
            webView.setVisibility(View.VISIBLE);
            animationView.setVisibility(View.GONE);
        }else{
            webView.setVisibility(View.GONE);
            animationView.setVisibility(View.VISIBLE);
        }


        swiperefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                checkNetwork();
                swiperefresh.setRefreshing(false);
            }
        });



    }


    public void checkNetwork(){
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.setWebChromeClient(new WebChromeClient());
            webView.loadUrl(getWebUrl);
            webView.setVisibility(View.VISIBLE);
            animationView.setVisibility(View.GONE);
        }else{
            webView.setVisibility(View.GONE);
            animationView.setVisibility(View.VISIBLE);
        }
    }


}