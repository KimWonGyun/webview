package com.example.umhahaha2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // private EditText mUrlEditText;
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //   mUrlEditText = (EditText) findViewById(R.id.url_edit);
        mWebView = (WebView) findViewById(R.id.web_view);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.getSettings().setLoadsImagesAutomatically(true);//추가한 부분
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setSupportZoom(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setAllowFileAccess(false);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        mWebView.setScrollBarStyle(View.SCROLLBARS_OUTSIDE_OVERLAY);
        //wView.setWebViewClient(new MyBrowser());
        //wView.setWebChromeClient(new MyCustomWebChromeClient());
        WebView.setWebContentsDebuggingEnabled(false);
        //wView.setOnScrollChangedCallback((l, t, oldl, oldt) -> appDrawer.visible(false));


        mWebView.loadUrl("http://3.36.57.216:1880/ui");         //************************초기화면


        findViewById(R.id.search_btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mWebView.loadUrl("http://3.36.57.216:1880/ui");//버튼 1웹페이지
                // mWebView.loadUrl(mUrlEditText.getText().toString());

            }
        });

        findViewById(R.id.search_btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWebView.loadUrl("http://3.36.57.216:1880/dash/board/0");//버튼 2웹페이지
                // mWebView.loadUrl(mUrlEditText.getText().toString());

            }
        });

        findViewById(R.id.search_btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWebView.loadUrl("http://3.36.57.216:1880/dash/board/1");//버튼 3웹페이지
                // mWebView.loadUrl(mUrlEditText.getText().toString());

            }
        });
    }

}