package com.example.BuilderDocument.entity;

public class PdfObjectElement implements PdfElement {

    private String type;
    private String function;

    @Override
    public String getElement() {

        return null;
    }

    public PdfObjectElement() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}