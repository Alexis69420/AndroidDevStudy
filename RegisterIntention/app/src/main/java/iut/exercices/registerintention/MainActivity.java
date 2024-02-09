package iut.exercices.registerintention;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] userInfo = new String[7];

    boolean firstTime = true;

    private ActivityResultLauncher<Intent> myIntentsLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView nameText = findViewById(R.id.nameView);
        TextView surnameText = findViewById(R.id.firstnameView);
        TextView telephoneText = findViewById(R.id.pCodeView);
        TextView addressNumberText = findViewById(R.id.hNumberView);
        TextView addressNameText = findViewById(R.id.streetView);
        TextView addressPostalText = findViewById(R.id.pCodeView);
        TextView cityText = findViewById(R.id.cityView);

        // initialisation du lanceur et traitement des réponses aux intentions
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
                                        nameText.setText(data.getExtras().getString("name"));
                                        break;
                                    case "surname":
                                        surnameText.setText(data.getExtras().getString("surname"));
                                        break;
                                    case "telephone":
                                        telephoneText.setText(data.getExtras().getString("telephone"));
                                        break;
                                    case "addressNumber":
                                        addressNumberText.setText(data.getExtras().getString("addressNumber"));
                                        break;
                                    case "addressName":
                                        addressNameText.setText(data.getExtras().getString("addressName"));
                                        break;
                                    case "addressPostal":
                                        addressPostalText.setText(data.getExtras().getString("addressPostal"));
                                        break;
                                    case "city":
                                        cityText.setText(data.getExtras().getString("city"));
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