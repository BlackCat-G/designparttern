package com.ghedu.builder;

public abstract class AbstractHtmlBuilder {
    protected HtmlDocument document;
    public void createHtmlDocument() {
        document = new HtmlDocument();
    }
    public HtmlDocument getDocument() {
        return document;
    }
    abstract void buildHeader();
    abstract void buildBody();
    abstract void buildFooter();
}
