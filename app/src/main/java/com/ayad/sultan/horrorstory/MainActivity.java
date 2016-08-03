package com.ayad.sultan.horrorstory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//addvertize
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-2100187188382709~6532666677");
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        String arrayStory[] = getResources().getStringArray(R.array.stories);
        ListView list =(ListView) findViewById(R.id.listView);
        ArrayAdapter adpter = new ArrayAdapter(this,R.layout.listview_rows,R.id.storyTitle,arrayStory);

        list.setAdapter(adpter);
    }

}
