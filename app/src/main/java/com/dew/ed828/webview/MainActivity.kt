package com.dew.ed828.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var webSettings: WebSettings

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // make sure that javaScript in the webpage is working still.
        webSettings = webViewLayout.settings
        webSettings.javaScriptEnabled = true
        webViewLayout.loadUrl("https://github.com/ed828a")
        // make sure that the link on the webpage opened in this app other than a web browser.
        webViewLayout.webViewClient = WebViewClient()
    }

    override fun onBackPressed() {
        if (webViewLayout.canGoBack()) {
            webViewLayout.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
