package com.ayad.sultan.horrorstory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by salkhmis on 8/5/2016.
 */
public class story_reader extends AppCompatActivity {
    private  int pageNumber = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_reader);

        //retrieve data sent by Intent
       pageNumber =  getIntent().getIntExtra("pageNumber",0);

        WebView web =(WebView) findViewById(R.id.reader);
        //  web.getSettings().setBuiltInZoomControls(true);
           //web.getSettings().setDisplayZoomControls(true); //api 11+
        web.loadUrl("file:///android_asset/"+pageNumber+".html");
    }
}
