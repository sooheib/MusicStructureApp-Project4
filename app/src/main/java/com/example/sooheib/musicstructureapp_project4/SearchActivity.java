package com.example.sooheib.musicstructureapp_project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sooheib on 8/25/16.
 */
public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        // Find View that contains search result 1 and Set a click listener on that View
        TextView song = (TextView) findViewById(R.id.searchSong);
        song.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when "california girls" is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }
}
