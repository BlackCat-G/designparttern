package com.ghedu.builder;

public class HtmlDocument {
    // 建造者设计模式四个角色：
    // 1. 产品类
    // 2. 抽象建造类
    // 3. 具体建造类
    // 4. 指挥者 -- 调用具体建造者，完成对象的建造
    private String header;
    private String body;
    private String footer;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "HtmlDocument{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
