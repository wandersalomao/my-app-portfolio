package com.example.wandersalomao.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

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

    /**
     * @author Wander Salomao
     * @since 09/06/2015
     *
     * This function will be called when tapping any button on the main activity
     *
     * @param view
     */
    public void onButtonClicked(View view) {

        // first we get the button from the current view
        Button b = (Button)view;
        CharSequence buttonText = b.getText();

        // prepare to show the Toast
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String message = getString(R.string.button_message, buttonText.toString());

        // instantiate and show the Toast
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
