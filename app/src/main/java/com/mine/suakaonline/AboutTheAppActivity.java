// Activity Tentang Aplikasi
// Ulfah Choirun Nissa
package com.mine.suakaonline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.mine.suakaonline.R;
import com.mine.suakaonline.helper.Font;

public class AboutTheAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_the_app);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Font font = new Font();
        TextView toolBarTextView = (TextView) findViewById(R.id.toolbarTextView);
        toolBarTextView.setText("Tentang Aplikasi");
        font.setFont(getApplicationContext(), toolBarTextView);

        TextView version = (TextView) findViewById(R.id.version);
        TextView version_number = (TextView) findViewById(R.id.version_number);
        TextView open_source_libraries = (TextView) findViewById(R.id.open_source_libraries);
        TextView about = (TextView) findViewById(R.id.about);

        TextView app_copyrights = (TextView) findViewById(R.id.app_copyrights);
        TextView copyright = (TextView) findViewById(R.id.copyright);
        TextView desc = (TextView) findViewById(R.id.desc);

        font.setFont(getApplicationContext(), version);
        font.setFont(getApplicationContext(), version_number);
        font.setFont(getApplicationContext(), open_source_libraries);
        font.setFont(getApplicationContext(), about);
        font.setFont(getApplicationContext(), app_copyrights);
        font.setFont(getApplicationContext(), copyright);
        font.setFont(getApplicationContext(), desc);
    }
}
