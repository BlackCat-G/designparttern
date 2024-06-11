package com.ghedu.builder;

public class HtmlDocumentBuilder {
    private String header;
    private String body;
    private String footer;

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "HtmlDocumentBuilder{" +
                "header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
    public static class Builder {
        protected HtmlDocumentBuilder htmlDocumentBuilder;

        public Builder() {
            this.htmlDocumentBuilder = new HtmlDocumentBuilder();
        }

        public Builder addHeader(String header) {
            htmlDocumentBuilder.setHeader(header);
            return this;
        }
        public Builder addBody(String body) {
            htmlDocumentBuilder.setBody(body);
            return this;
        }
        public Builder addFooter(String footer) {
            htmlDocumentBuilder.setFooter(footer);
            return this;
        }
        public HtmlDocumentBuilder build() {
            return htmlDocumentBuilder;
        }

    }
}
