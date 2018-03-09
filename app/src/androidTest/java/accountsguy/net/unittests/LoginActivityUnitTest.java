package accountsguy.net.unittests;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Created by advic on 09/03/2018.
 */

@RunWith(AndroidJUnit4.class)

public class LoginActivityUnitTest {

    // This Rule will tell the Test Case to test the MainAcitivity.class and this rule will be
    // ececuted before all annotation in the Test Cases.
    // We need to declare Rules before writing Annotations like Test, Before, or After

    // Statement to launch and Activity.
    @Rule
    public ActivityTestRule<LoginActivity> activityActivityTestRule = new ActivityTestRule<>(LoginActivity
            .class);

    //    private MainActivity mainActivity = null;
//    private EmailValidator emailValidator = null;

//    @Before public void setUp() throws Exception{
//        mainActivity = activityActivityTestRule.getActivity();
//        emailValidator = new EmailValidator();
//    }

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("accountsguy.net.unittests", appContext.getPackageName());
        //assertNotNull(mainActivity.findViewById(R.id.login));
    }


    @Test
    public void testmailid() throws Exception
    {
        String emailinput = "advice@accountsguy.net";
        onView(withId(R.id.email)).perform(typeText(emailinput),closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText("accountsguy.net"),closeSoftKeyboard());
        onView(withText("login")).perform(click());

        assertTrue(EmailValidator.isValidEmail(emailinput));
//        onView(withId(R.id.result)).check(matches(withText("Welcome to AccoutsGuy.Net")));


    }

//    @After
//    public void tearDown() throws Exception{
//        mainActivity = null;
//        emailValidator = null;
//    }
}
