package iut.exercices.caclulatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstnumber;
    int secondnumber;

    String operand = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstnumber = 0;
        secondnumber = 0;
    }

    public void add(View v) {
        EditText editText = findViewById(R.id.editext);
        if (firstnumber != 0 ) {
            secondnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            TextView result = findViewById(R.id.textResult);
            int res;
            res = firstnumber + secondnumber;
            result.setText(String.valueOf(res));
        } else if (firstnumber == 0) {
            firstnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            operand = "+";
        }
    }

    public void sub(View v) {
        EditText editText = findViewById(R.id.editext);
        if (firstnumber != 0 ) {
            secondnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            TextView result = findViewById(R.id.textResult);
            int res;
            res = firstnumber - secondnumber;
            result.setText(String.valueOf(res));
        } else if (firstnumber == 0) {
            firstnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            operand = "-";
        }
    }

    public void mul(View v) {
        EditText editText = findViewById(R.id.editext);
        if (firstnumber != 0 ) {
            secondnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            TextView result = findViewById(R.id.textResult);
            int res;
            res = firstnumber * secondnumber;
            result.setText(String.valueOf(res));
        } else if (firstnumber == 0) {
            firstnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            operand = "*";
        }
    }

    public void div(View v) {
        EditText editText = findViewById(R.id.editext);
        if (firstnumber != 0 ) {
            secondnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            TextView result = findViewById(R.id.textResult);
            int res;
            res = firstnumber / secondnumber;
            result.setText(String.valueOf(res));
        } else if (firstnumber == 0) {
            firstnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            operand = "/";
        }
    }

    public void validate(View v) {
        EditText editText = findViewById(R.id.editext);
        if (firstnumber != 0 ) {
            secondnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
            TextView result = findViewById(R.id.textResult);
            int res;
            if (operand.equals("+")) {
                res = firstnumber + secondnumber;
            } else if (operand.equals("-")) {
                res = firstnumber - secondnumber;
            } else if (operand.equals("*")) {
                res = firstnumber * secondnumber;
            } else if (operand.equals("/")) {
                res = firstnumber / secondnumber;
            } else {
                res = 0;
            }
            result.setText(String.valueOf(res));
        } else if (firstnumber == 0) {
            firstnumber = Integer.parseInt((editText.getText().toString()));
            editText.setText("");
        }
    }
}