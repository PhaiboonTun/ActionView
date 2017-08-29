package phansa.phaiboon.actionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        String strURL = getIntent().getStringExtra("URL");
        String strURL = "http://www.inspectorrta.org/IGD2017/";

        WebView webView = (WebView) findViewById(R.id.myWebview);
        WebViewClient webViewClient = new WebViewClient();
        webView.setWebViewClient(webViewClient);
        webView.loadUrl(strURL);
        webView.getSettings().setJavaScriptEnabled(true);



    } //Main method
}//Main Class
