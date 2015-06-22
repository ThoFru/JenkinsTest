package com.tfruchar.jenkinstest;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by tfruchar on 22/06/2015.
 */
public class HelloWorldEspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;

    public HelloWorldEspressoTest() {
        super(MainActivity.class);
    }

    public HelloWorldEspressoTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mainActivity = getActivity();
    }

    public void testCrashButton() throws Exception{
        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click());
    }
}
