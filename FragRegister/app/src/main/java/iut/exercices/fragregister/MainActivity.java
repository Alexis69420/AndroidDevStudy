package iut.exercices.fragregister;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nameView = findViewById(R.id.nameView);
        TextView firstnameView = findViewById(R.id.firstnameView);
        TextView phNumberView = findViewById(R.id.phNumberView);
        TextView hNumberView = findViewById(R.id.hNumberView);
        TextView streetView = findViewById(R.id.streetView);
        TextView pCodeView = findViewById(R.id.pCodeView);
        TextView cityView = findViewById(R.id.cityView);
        
    }

    public void changeUserInfo(View view) {
    }

    public void changeUserAddress(View view) {
    }
}