package accountsguy.net.unittests;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by advic on 09/03/2018.
 */

public class LoginActivity extends AppCompatActivity{

    public static TextView emailidtextview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginaccount(View view) {
        emailidtextview = (TextView) findViewById(R.id.email);
        String value= emailidtextview.getText().toString();
        if(EmailValidator.isValidEmail(value)){
            Toast.makeText(this, "Email Pattern is Correct: "+ value , Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Email Pattern is not Correct: " + value, Toast.LENGTH_SHORT)
                    .show();
        }
    }
}
