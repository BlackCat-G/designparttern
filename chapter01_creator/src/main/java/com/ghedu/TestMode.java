package com.ghedu;

import com.ghedu.factory.abstractfactory.BusinessFactory;
import com.ghedu.factory.abstractfactory.Tesla;
import com.ghedu.factory.simple.Operation;
import com.ghedu.factory.simple.OperationFactory;
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
    @Test
    public void testAbstractFactory() {
        BusinessFactory businessFactory = new BusinessFactory();
        Tesla tesla = businessFactory.getTesla();
        tesla.tram();
    }
}
