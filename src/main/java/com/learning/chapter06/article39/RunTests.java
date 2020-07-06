package com.learning.chapter06.article39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests {

    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName("com.learning.chapter06.article39.Sample");
        for(Method m : testClass.getDeclaredMethods()) {
            tests++;
            try {
                m.invoke(null);
                passed++;
            } catch (InvocationTargetException wrappedExc) {
                Throwable exc = wrappedExc.getCause();
                System.out.println(m + " failed:" + exc);
            } catch (Exception exc) {
                System.out.println("Invalid @Test: " + m);
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",passed, tests - passed);
    }

}
