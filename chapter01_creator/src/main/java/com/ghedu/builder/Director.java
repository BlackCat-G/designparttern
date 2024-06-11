package com.ghedu.builder;

public class Director {
    private AbstractHtmlBuilder abstractHtmlBuilder;

    public Director(AbstractHtmlBuilder abstractHtmlBuilder) {
        this.abstractHtmlBuilder = abstractHtmlBuilder;
    }
    public void buildDocument() {
        abstractHtmlBuilder.createHtmlDocument();
        abstractHtmlBuilder.buildHeader();
        abstractHtmlBuilder.buildBody();
        abstractHtmlBuilder.buildFooter();
    }
    public HtmlDocument getDocument() {
        return abstractHtmlBuilder.getDocument();
    }
}
