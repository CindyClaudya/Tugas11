package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;



public class Main2Activity extends AppCompatActivity {
    private View.OnClickListener resetButtonListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProgressDialog progressDialog;
        Handler handler;

        setContentView(R.layout.activity_main2);
        Button btnSetting = (Button) findViewById(R.id.btnSetting);
        btnSetting.setOnClickListener(BtnSetting);
        SharedPreferences prefs = Main2Activity.this.getSharedPreferences("prefs_file", MODE_PRIVATE);

        Button resetButton = (Button) findViewById(R.id.btnReset);
        resetButton.setOnClickListener(resetButtonListener);

        String statusLogin = prefs.getString("isLogin", null);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);


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

    private View.OnClickListener btnReset = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            //final AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);

            // builder.setMessage("Apakah anda yakin untuk mereset nilai protein?")
            //    .setNegativeButton("No", new DialogInterface.OnClickListener() {
            //         public void onClick(DialogInterface dialog, int which) {
            //        Toast.makeText(Main2Activity.this, "Tidak jadi reset", Toast.LENGTH_SHORT).show();
            //      }
            //  })
            //.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            //  public void onClick(DialogInterface dialog, int which) {
            //   Toast.makeText(Main2Activity.this, "Melakukan RESET !!", Toast.LENGTH_SHORT).show();
            //    final ProgressDialog progressDialog = new ProgressDialog(Main2Activity.this);
            //  progressDialog.setMessage("Melakukan sesuatu ...");
            //  progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

            //final Thread thread = new Thread(new Runnable() {
            //  private Handler handler = new Handler()
            // {     public void handleMessage(android.os.Message msg) {

            //     progressDialog.dismiss();
            // }
            // };

            //public void run() {
            //  try {
            //       Thread.sleep(3000);

            //      handler.sendEmptyMessage(0);
            //   } catch (InterruptedException e) {
            // TODO Auto-generated catch block             e.printStackTrace();         }     } });
            //    e.printStackTrace();
            // }
            //}

            // });

            //thread.start();
            // progressDialog.show();

            //};
            // AlertDialog dialog = builder.create();
            //dialog.show();


            final Dialog dialog = new Dialog(Main2Activity.this);
            dialog.setContentView(R.layout.custom_dialog);
            dialog.setTitle("Custom Dialog");

            Button btnDialog = (Button) dialog.findViewById(R.id.btnTombol);
            btnDialog.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {         // TODO Auto-generated method stub         dialog.dismiss();     } });

                    dialog.show();
                }
            });
        }

        ;
    };
}




