package gyb2015.washington.edu.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MainActivity", "onCreate event fired");
        if (savedInstanceState != null) {
            Log.i("MainActivity", "onCreate: savedInstanceState: " + savedInstanceState.toString());
        }

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
    protected void onStart() {
        Log.i("MainActivity", "onStart event fired");

        super.onStart();
        // The activity is about to become visible.
    }

    @Override
    protected void onRestart() {
        Log.i("MainActivity", "onRestart event fired");

        super.onRestart();
        // The current activity is being re-displayed to the user.
    }

    @Override
    protected void onResume() {
        Log.i("MainActivity", "onResume event fired");

        super.onResume();
        // The activity has become visible (it is now "resumed").
    }

    @Override
    protected void onPause() {
        Log.i("MainActivity", "onPause event fired");

        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }

    @Override
    protected void onStop() {
        Log.i("MainActivity", "onStop event fired");

        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }

    @Override
    protected void onDestroy() {
        Log.e("MainActivity", "We're going down, Captain!");

        super.onDestroy();
        // The activity is about to be destroyed."
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
}
