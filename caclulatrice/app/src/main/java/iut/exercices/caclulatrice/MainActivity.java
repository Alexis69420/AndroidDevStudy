package iut.exercices.caclulatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstnumber = 0;
    int secondnumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v) {
        if (firstnumber != 0 ) {
            secondnumber = Integer.parseInt(((EditText) findViewById(R.id.editext)).getText().toString());
            TextView result = findViewById(R.id.textResult);
            result.setText(String.valueOf(firstnumber + secondnumber));
        } else if (firstnumber == 0) {
            firstnumber = Integer.parseInt(((EditText) findViewById(R.id.editext)).getText().toString());
        }
    }

    protected void sub() {
        // TODO
    }

    protected void mul() {
        // TODO
    }

    protected void div() {
        // TODO
    }
}