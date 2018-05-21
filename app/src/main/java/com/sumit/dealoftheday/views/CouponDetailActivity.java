package com.sumit.dealoftheday.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.sumit.dealoftheday.Constants;
import com.sumit.dealoftheday.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CouponDetailActivity extends AppCompatActivity {
    @BindView(R.id.webView_id)
    WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_detail);
        ButterKnife.bind(this);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(getIntent().getStringExtra(Constants.EXTRA_DEAL_URL));
    }

}
