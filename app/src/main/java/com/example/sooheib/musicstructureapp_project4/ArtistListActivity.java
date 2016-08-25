package com.example.sooheib.musicstructureapp_project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sooheib on 8/25/16.
 */
public class ArtistListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);
        // Find View that shows "the beach boys" and Set a click listener on that View
        TextView beachBoys = (TextView) findViewById(R.id.artist1);
        beachBoys.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when "the beach boys" is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ArtistListActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });
    }
}
