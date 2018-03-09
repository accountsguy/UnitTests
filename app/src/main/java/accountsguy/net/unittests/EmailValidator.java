package accountsguy.net.unittests;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by advic on 09/03/2018.
 */

public class EmailValidator  implements TextWatcher {

    //Pattern Explanation
    // [a-z]+ "here plus mean any number of times in the square bracket"
    // //. "it will check for dot (.)"
    // \w any word character a-zA-Z
    // \d any Digi 0-9
    public static final Pattern EMAIL_PATTERN = Pattern.compile(
            "[\\w][\\w\\d\\.]+"+
                    "\\@"+"[\\w\\d][\\w\\d\\-]{0,64}"+
                    "("+
                    "\\."+
                    "[\\w\\d][\\w\\d\\-]{0,25}"+
                    ")"

    );

    protected boolean IsValid = false;

    public boolean isValid() {
        return IsValid;
    }

    public static boolean isValidEmail(CharSequence email){
        Matcher patternmatcher = EMAIL_PATTERN.matcher(email);
        boolean status = patternmatcher.matches();

        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    @Override
    public void afterTextChanged(Editable s) {
        IsValid = isValidEmail(s);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {}
}
