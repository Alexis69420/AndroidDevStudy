package iut.exercices.intentionsend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void onSend(View view) {
        EditText editText = findViewById(R.id.messageEditText);
        String message = editText.getText().toString();
        System.out.println("Message : " + message);
        editText.setText("");
    }
}