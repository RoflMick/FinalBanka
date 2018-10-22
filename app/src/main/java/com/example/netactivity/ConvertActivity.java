package com.example.netactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ConvertActivity extends Activity {

    ImageView otherFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convert);

        otherFlag = findViewById(R.id.imageFlagOther);

//        String otherFlagName;

        int otherFlagName;
//        otherFlagName = getIntent().getStringExtra("flag");
        otherFlagName = getIntent().getIntExtra("flag", 0);
//        int otherFlagId = getResources().getIdentifier(otherFlagName, null, getPackageName());

        otherFlag.setImageResource(otherFlagName);

        Toast.makeText(getApplicationContext(), otherFlagName, Toast.LENGTH_SHORT).show();
    }
}
