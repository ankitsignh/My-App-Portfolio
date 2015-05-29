package com.example.ankit.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void buttonClickHandler(View view) {
        String msg = "This button will launch my spotify streamer app!";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }


    public void button2ClickHandler(View view) {
        String msg = "This button will launch my scores app!";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void button3ClickHandler(View view) {
        String msg = "This button will launch my library app!";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void button4ClickHandler(View view) {
        String msg = "This button will launch my build it bigger app!";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void button5ClickHandler(View view) {
        String msg = "This button will launch my xyz reader app!";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void button6ClickHandler(View view) {
        String msg = "This button will launch my capstone app!";
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
