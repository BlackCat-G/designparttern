package com.ghedu.builder;

public class ArtHtmlBuilder extends AbstractHtmlBuilder{
    @Override
    void buildHeader() {
        document.setHeader("art header");
    }

    @Override
    void buildBody() {
        document.setBody("art body");
    }

    @Override
    void buildFooter() {
        document.setFooter("art footer");
    }
}
