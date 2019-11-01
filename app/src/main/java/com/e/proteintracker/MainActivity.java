package com.e.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.Test_untuk_update_View);

        Button myBtn = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("ProteinTracker", myEditText.getText().toString());

                Button helpBtn = (Button) findViewById(R.id.helpButton);
                helpBtn.setOnClickListener(helpButtonListener);

                if (savedInstanceState != null) {
                    Log.d("ProteinTracker", savedInstanceState.getString("abc"));
                }
            }
        });
    }

    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(MainActivity.this, HelpActivity.class);

            startActivity(intent);
        }

    };

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc", "test");
        super.onSaveInstanceState(outState);
    }

    ;

    private View.OnClickListener getHelpButtonListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, HelpActivity.class);

            Bundle b = new Bundle();

            EditText myEditText = (EditText) findViewById(R.id.editText1);

            b.putString("helpString", myEditText.getText().toString());

            intent.putExtras(b);

            startActivity(intent);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "Item 1 Terpilih", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Item 2 Terpilih", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "Item 3 Terpilih", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}