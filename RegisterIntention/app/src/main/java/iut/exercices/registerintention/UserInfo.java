package iut.exercices.registerintention;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class UserInfo extends AppCompatActivity {

    private ActivityResultLauncher<Intent> myIntentsLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
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
        Intent intent = new Intent(this, MainActivity.class);
        EditText hNumber = findViewById(R.id.hNumber);
        EditText street = findViewById(R.id.street);
        EditText pCode = findViewById(R.id.pCode);
        EditText city = findViewById(R.id.city);
        String hNumberStr = hNumber.getText().toString();
        String streetStr = street.getText().toString();
        String pCodeStr = pCode.getText().toString();
        String cityStr = city.getText().toString();
        intent.putExtra("hNumber", hNumberStr);
        intent.putExtra("street", streetStr);
        intent.putExtra("pCode", pCodeStr);
        intent.putExtra("city", cityStr);
        setResult(RESULT_OK, intent);
        finish();
    }
}