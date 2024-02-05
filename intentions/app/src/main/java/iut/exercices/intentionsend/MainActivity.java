package iut.exercices.intentionsend;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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

    public void onSend(View view) {
        EditText editText = findViewById(R.id.messageEditText);
        String message = editText.getText().toString();
        System.out.println("Message : " + message);
        Intent intent = new Intent(this, intentionRecieve.class);
        intent.putExtra("message", message);
        myIntentsLauncher.launch(intent);
        editText.setText("");
    }
}