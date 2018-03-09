package accountsguy.net.unittests;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule public ActivityTestRule<MainActivity> mainActivityActivityTestRule  =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("accountsguy.net.unittests", appContext.getPackageName());

        onView(withId(R.id.text)).perform(typeText("Venkkatesh"),closeSoftKeyboard());
        onView(withText("click")).perform(click());
        onView(withId(R.id.textview)).check(matches(withText("Hello Venkkatesh")));
    }

    @Test public void addition_isCorrect()throws Exception {
        assertEquals("Numbers are equal!", 4, 2+2);
    }

    @Test public void addition_isNotCorrect()throws Exception {
        assertEquals("Numbers are not equal!", 5, 2+2);
    }
}
