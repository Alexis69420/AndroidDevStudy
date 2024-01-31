package iut.exercices.exo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        Log.println(Log.DEBUG, "Application restarted", "passage dans onRestart");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.println(Log.DEBUG, "Application paused", "passage dans onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.println(Log.DEBUG, "Application resumed", "passage dans onResume");
        super.onResume();
    }

    @Override
    protected void onStop() {
        Log.println(Log.DEBUG, "Application stopped", "passage dans onStop");
        super.onStop();
    }

    @Override
    protected void onStart() {
        Log.println(Log.DEBUG, "Application started", "passage dans onStart");
        super.onStart();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.println(Log.DEBUG, "Application created", "passage dans onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}