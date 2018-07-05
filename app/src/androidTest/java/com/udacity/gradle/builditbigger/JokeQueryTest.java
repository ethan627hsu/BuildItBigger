package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.paid.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class JokeQueryTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void queryTest() throws Exception {

        MainActivity activity = mActivityRule.getActivity();
        activity.setJokeResponse(new MainActivity.onJokeQuery() {
            @Override
            public void jokeQueried(String response) {
                assertTrue(!response.isEmpty());
            }
        });
        onView(withText(R.string.button_text)).perform(click());

    }
}
