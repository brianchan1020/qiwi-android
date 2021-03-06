package com.example.brianchan.qiwi_android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class QueueActivity extends AppCompatActivity {
    QueuePresenter presenter;

    TextView currentSongText;
    Button requestsBtn;
    Button togglePlayBtn;
    ListView playlist;

    //public Player songPLayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        presenter = new QueuePresenter(this);

        currentSongText = (TextView) findViewById(R.id.currentSongText);
        requestsBtn = (Button) findViewById(R.id.requestsBtn);
        togglePlayBtn = (Button) findViewById(R.id.togglePlayBtn);
        playlist = (ListView) findViewById(R.id.playlist);

        togglePlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.togglePlayPause();
            }
        });
    }

    // onclick method for requestsBtn
    public void switchTabs(View v) {
        //presenter.switchTabs();
    }

    // onclick method for togglePlayBtn
    public void togglePlayPause(View v) {
        //presenter.togglePlayPause();
    }

    public void fbcall (View v) {
        Party fb = new Party();
    }

    public void mess (View v) {
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.setData(Uri.parse("sms:"));
        sendIntent.putExtra("sms_body", "Your unique passcode is " + 1234);
        startActivity(sendIntent);
    }
}
