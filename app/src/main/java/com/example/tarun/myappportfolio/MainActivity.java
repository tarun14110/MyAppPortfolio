package com.example.tarun.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static com.example.tarun.myappportfolio.R.string.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the button */
    public void displayToast(View view) {

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = null;
        String text="This button will launch ";
        switch (view.getId()) {
            case R.id.app_1:
                text=text.concat(getResources().getString(R.string.app_1));
                toast = Toast.makeText(context, text, duration);
                break;
            case R.id.app_2:
                text=text.concat(getResources().getString(R.string.app_2));
                toast= Toast.makeText(context, text, duration);
                break;
            case R.id.app_3:
                text=text.concat(getResources().getString(R.string.app_3));
                toast= Toast.makeText(context, text, duration);
                break;
            case R.id.app_4:
                text=text.concat(getResources().getString(R.string.app_4));
                toast= Toast.makeText(context, text, duration);
                break;
            case R.id.app_5:
                text=text.concat(getResources().getString(R.string.app_5));
                toast= Toast.makeText(context, text, duration);
                break;
            case R.id.app_6:
                text=text.concat(getResources().getString(R.string.app_6));
                toast= Toast.makeText(context, text, duration);
                break;

        }
        toast.show();
    }


}
