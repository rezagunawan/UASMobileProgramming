package com.mine.suakaonline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mine.suakaonline.R;
import com.mine.suakaonline.constant.Const;
import com.mine.suakaonline.helper.Font;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private LinearLayout llAboutTheApp, TentangKami;
//    private LinearLayout llTermsAndConditions, llPrivacyPolicy, llReportAnIssue;
    private static String PAGE_TITLE = "page_title";
    private static String PAGE_URL = "page_url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        TextView toolBarTextView = (TextView) findViewById(R.id.toolbarTextView);
        Font font = new Font();
        toolBarTextView.setText("Suaka Online");
        font.setFont(getApplicationContext(), toolBarTextView);

//        llTermsAndConditions = (LinearLayout) findViewById(R.id.llTermsAndConditions);
//        llPrivacyPolicy = (LinearLayout) findViewById(R.id.llPrivacyPolicy);
//        llReportAnIssue = (LinearLayout) findViewById(R.id.llReportAnIssue);
        llAboutTheApp = (LinearLayout) findViewById(R.id.llAboutTheApp);
        TentangKami = (LinearLayout) findViewById(R.id.TentangKami);
//        TextView terms_and_conditions_tv = (TextView) findViewById(R.id.terms_and_conditions_tv);
//        TextView privacy_policy_tv = (TextView) findViewById(R.id.privacy_policy_tv);
//        TextView report_an_issue_tv = (TextView) findViewById(R.id.report_an_issue_tv);
        TextView about_the_app_tv = (TextView) findViewById(R.id.about_the_app_tv);
        TextView tentang = (TextView) findViewById(R.id.tentangkami_tv);
//        font.setFont(getApplicationContext(),terms_and_conditions_tv);
//        font.setFont(getApplicationContext(),privacy_policy_tv);
//        font.setFont(getApplicationContext(),report_an_issue_tv);
        font.setFont(getApplicationContext(),about_the_app_tv);
        font.setFont(getApplicationContext(),tentang);

//        llTermsAndConditions.setOnClickListener(this);
//        llPrivacyPolicy.setOnClickListener(this);
//        llReportAnIssue.setOnClickListener(this);
        llAboutTheApp.setOnClickListener(this);
        TentangKami.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
//            case R.id.llTermsAndConditions:
//                Intent intent1 = new Intent(SettingsActivity.this,SitePageLoader.class);
//                intent1.putExtra(PAGE_TITLE,"Terms and Conditions");
//                intent1.putExtra(PAGE_URL, Const.pages.replace("PAGE_ID","636"));
//                startActivity(intent1);
//                break;
//            case R.id.llPrivacyPolicy:
//                Intent intent2 = new Intent(SettingsActivity.this,SitePageLoader.class);
//                intent2.putExtra(PAGE_TITLE,"Privacy policy");
//                intent2.putExtra(PAGE_URL, Const.pages.replace("PAGE_ID","622"));
//                startActivity(intent2);
//                break;
            case R.id.TentangKami:
                Intent intent3 = new Intent(SettingsActivity.this,SitePageLoader.class);
                intent3.putExtra(PAGE_TITLE,"Tentang Suaka");
                intent3.putExtra(PAGE_URL, Const.pages.replace("PAGE_ID","1103"));
                startActivity(intent3);
                break;
            case R.id.llAboutTheApp:
                Intent intent = new Intent(getApplicationContext(),AboutTheAppActivity.class);
                startActivity(intent);
                break;
        }
    }
}
