package com.ghedu;

import com.ghedu.singleton.Hungry;
import com.ghedu.singleton.Lazy;
import org.junit.Test;

public class TestMode {
    @Test
    public void testHungry() {
        Hungry instance = Hungry.getInstance();
        System.out.println(instance);
    }
    @Test
    public void testLazy() {
        Lazy instance = Lazy.getInstance();
        System.out.println("instance = " + instance);
    }
}
