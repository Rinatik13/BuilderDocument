package com.example.BuilderDocument.entity;

public class PdfTextElement implements PdfElement {

    private TypeElement type;
    private String body;

    @Override
    public String getElement() {
        return body;
    }

    public TypeElement getType() {
        return type;
    }

    public void setType(TypeElement type) {
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