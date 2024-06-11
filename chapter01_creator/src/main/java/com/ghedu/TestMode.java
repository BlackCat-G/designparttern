package com.ghedu;

import com.ghedu.builder.*;
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
    @Test
    public void testBuilder() {
        AbstractHtmlBuilder abstractHtmlBuilder = new ArtHtmlBuilder();
        Director director = new Director(abstractHtmlBuilder);
        director.buildDocument();
        HtmlDocument document = director.getDocument();
        System.out.println("document = " + document);
    }
    @Test
    public void testChainBuilder() {
        HtmlDocumentBuilder.Builder builder = new HtmlDocumentBuilder.Builder();
        HtmlDocumentBuilder build = builder.addHeader("art")
                .addBody("art body")
                .addFooter("art footer")
                .build();
        System.out.println(build);
    }
    @Test
    public void testDifficultyChainBuilder() {
        ImmutablePerson.Builder builder = new ImmutablePerson.Builder();
        ImmutablePerson build = builder.setName("高航")
                .setAge("12")
                .setAddress("天津")
                .build();
        System.out.println(build);
    }
}
