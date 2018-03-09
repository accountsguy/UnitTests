package accountsguy.net.unittests;

import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

/**
 * Created by advic on 09/03/2018.
 */

public class EmailValidatorTest {

    @Test public void emailValidator_CorrectEmailSimple_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("name@gmail.com"));
    }
}
