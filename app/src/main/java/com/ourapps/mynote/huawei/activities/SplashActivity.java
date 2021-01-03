package com.ourapps.mynote.huawei.activities;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.huawei.hms.ads.HwAds;


public class SplashActivity extends AppCompatActivity {
    private static final String TAG = SplashActivity.class.getSimpleName();
    private static final int AD_TIMEOUT = 5000;
    private static final int MSG_AD_TIMEOUT = 1001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        HwAds.init(this);
    }
}

