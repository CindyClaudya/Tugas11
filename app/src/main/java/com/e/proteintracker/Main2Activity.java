package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btnSetting = (Button) findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(BtnSetting);
        SharedPreferences prefs = Main2Activity.this.getSharedPreferences("prefs_file", MODE_PRIVATE);

        String statusLogin = prefs.getString("isLogin", null);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(myBtnLogin);


        if (statusLogin != null) {
            btnLogin.setText("Logout");
        } else {
            btnLogin.setText("Login");
        }
    }

    private View.OnClickListener BtnSetting = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent((Main2Activity.this), SettingActivity.class);
            startActivity(intent);
        }

        private View.OnClickListener myBtnLogin = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = Main2Activity.this.getSharedPreferences("prefs_file", MODE_PRIVATE);

                String statusLogin = prefs.getString("isLogin", null);
                SharedPreferences.Editor edit = prefs.edit();

                Button btnLogin = (Button) findViewById(R.id.btnLogin);
                if (statusLogin != null) {
                    edit.putString("isLogin", null);
                    btnLogin.setText("Login");
                } else {
                    edit.putString("isLogin", "Admin");
                    btnLogin.setText("Logout");
                }
                edit.commit();
            }
        };

    };
}



