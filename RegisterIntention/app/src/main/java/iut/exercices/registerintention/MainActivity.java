package iut.exercices.registerintention;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ActivityResultLauncher<Intent> myIntentsLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myIntentsLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK) {
                Intent data = result.getData();
            }
        });
    }

    public void changeUserInfo(View view) {
        Intent intent = new Intent(this, Modify.class);
        myIntentsLauncher.launch(intent);
    }

    public void changeUserAddress(View view) {
        Intent intent = new Intent(this, UserInfo.class);
        myIntentsLauncher.launch(intent);
    }

    public void onCancel(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        myIntentsLauncher.launch(intent);
    }
}