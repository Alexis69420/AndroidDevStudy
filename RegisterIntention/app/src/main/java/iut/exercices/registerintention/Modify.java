package iut.exercices.registerintention;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Modify extends AppCompatActivity {

    private ActivityResultLauncher<Intent> myIntentsLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);
        myIntentsLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK) {
                Intent data = result.getData();
            }
        });
    }

    public void onCancel(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        myIntentsLauncher.launch(intent);
    }

    public void onModify(View view) {
        EditText name = findViewById(R.id.name);
        EditText firstname = findViewById(R.id.firstname);
        EditText phNumber = findViewById(R.id.phNumber);
        String nameStr = name.getText().toString();
        String firstnameStr = firstname.getText().toString();
        String phNumberStr = phNumber.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("name", nameStr);
        intent.putExtra("firstname", firstnameStr);
        intent.putExtra("phNumber", phNumberStr);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}