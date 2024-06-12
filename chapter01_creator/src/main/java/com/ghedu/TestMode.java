package com.ghedu;

import com.ghedu.builder.*;
import com.ghedu.factory.abstractfactory.BusinessFactory;
import com.ghedu.factory.abstractfactory.Tesla;
import com.ghedu.prototype.deep.Discount;
import com.ghedu.prototype.deep.Product;
import com.ghedu.prototype.shallow.Collection;
import com.ghedu.prototype.shallow.Song;
import com.ghedu.singleton.Hungry;
import com.ghedu.singleton.Lazy;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.Test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void testShallowCopy() throws CloneNotSupportedException {
        Collection collection = new Collection();
        collection.setName("syy收藏");
        List<Song> songList = new ArrayList<>();
        songList.add(new Song("七里香", "杰伦"));
        songList.add(new Song("迷迭香", "杰伦"));
        songList.add(new Song("丁香", "杰伦"));
        collection.setSongList(songList);
        System.out.println("collection = " + collection);
        Collection copy = new Collection(collection);
        System.out.println("copy = " + copy);
        songList.add(new Song("曹操", "林俊杰"));
        System.out.println(collection + "\n" + copy);
        Collection cloneCollection = (Collection) collection.clone();
        System.out.println("cloneCollection = " + cloneCollection); // 使用clone方法实现浅拷贝
    }
    @Test
    public void testDeepCopy() throws IOException, ClassNotFoundException {
        // 1. 使用clone方式
        List<Product> products = new ArrayList<>();
        products.add(new Product("护手霜", 1.0F));
        products.add(new Product("炒菜锅", 2.0F));
        Discount sourceDiscount = new Discount("促销", 0.89F, products);
        Discount copyDiscount = (Discount) sourceDiscount.clone();
        products.add(new Product("显示器",  2000.0F));
        copyDiscount.setProducts(products);
        System.out.println(copyDiscount.getProducts().get(0) == sourceDiscount.getProducts().get(0));
        // 2. 使用序列化的方式
        ByteOutputStream byteOutputStream = new ByteOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
        objectOutputStream.writeObject(sourceDiscount);
        byte[] bytes = byteOutputStream.getBytes();
        // 代码并不规范，仅用于练习
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteInputStream(bytes, bytes.length));
        Object o = objectInputStream.readObject();
        System.out.println(o);
    }
}
