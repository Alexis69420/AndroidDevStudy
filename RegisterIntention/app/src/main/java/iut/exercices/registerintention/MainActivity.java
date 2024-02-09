package iut.exercices.registerintention;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ActivityResultLauncher<Intent> myIntentsLauncher;

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
        myIntentsLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            Intent data = result.getData();
                            for (String key : data.getExtras().keySet()) {
                                switch (key) {
                                    case "name":
                                        nameView.setText(data.getStringExtra("name"));
                                        break;
                                    case "firstname":
                                        firstnameView.setText(data.getStringExtra("firstname"));
                                        break;
                                    case "phNumber":
                                        phNumberView.setText(data.getStringExtra("phNumber"));
                                        break;
                                    case "hNumber":
                                        hNumberView.setText(data.getStringExtra("hNumber"));
                                        break;
                                    case "street":
                                        streetView.setText(data.getStringExtra("street"));
                                        break;
                                    case "pCode":
                                        pCodeView.setText(data.getStringExtra("pCode"));
                                        break;
                                    case "city":
                                        cityView.setText(data.getStringExtra("city"));
                                        break;
                                }
                            }
                        }
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