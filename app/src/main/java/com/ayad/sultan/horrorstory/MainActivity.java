package com.ayad.sultan.horrorstory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


public class MainActivity extends AppCompatActivity {


    private  int pageNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//adverting
    MobileAds.initialize(getApplicationContext(), "ca-app-pub-2100187188382709~6532666677");
    AdView mAdView = (AdView) findViewById(R.id.adView);
    AdRequest adRequest = new AdRequest.Builder().build();
   // mAdView.loadAd(adRequest);

    String arrayStory[] = getResources().getStringArray(R.array.stories);
   ListView list =(ListView) findViewById(R.id.listView);
    ArrayAdapter adpter = new ArrayAdapter(this,R.layout.listview_rows,R.id.storyTitle,arrayStory);

    list.setAdapter(adpter);

       list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

              Intent startRader=  new Intent(MainActivity.this,story_reader.class);
               pageNumber  = position + 1;
               startRader.putExtra("pageNumber",pageNumber);
             startActivity(startRader);

           }
       });
}



}
