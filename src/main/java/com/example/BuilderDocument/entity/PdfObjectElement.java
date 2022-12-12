package com.example.BuilderDocument.entity;

public class PdfObjectElement implements PdfElement {

    private TypeElement type;
    private String function;

    @Override
    public String getElement() {
        return function;

    }

    @Override
    public void setElement(String elementText) {
        this.function = elementText;
    }

    public PdfObjectElement() {
    }

    public TypeElement getType() {
        return type;
    }

    public void setType(TypeElement type) {
        this.type = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}