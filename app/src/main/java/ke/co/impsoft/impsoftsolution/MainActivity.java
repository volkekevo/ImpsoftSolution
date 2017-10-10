package ke.co.impsoft.impsoftsolution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView)findViewById(R.id.webview);

        WebSettings webSettings = mywebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mywebview.loadUrl("http://impsoft.co.ke/");
        //enable java script
        mywebview.setWebViewClient(new WebViewClient());
        //block external browser


        }

    @Override
    public void onBackPressed() {
        if (mywebview.canGoBack()){
            mywebview.goBack();
        }else {
        super.onBackPressed();
    }
}}
