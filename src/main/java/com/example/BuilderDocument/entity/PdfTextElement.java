package com.example.BuilderDocument.entity;

public class PdfTextElement implements PdfElement {

    private String type;
    private String body;

    @Override
    public String getElement() {
        return body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "PdfTextElement{" +
                "type='" + type + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}