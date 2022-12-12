package com.example.BuilderDocument.entity;
public interface PdfElement {
    TypeElement type = null;
    String function = null;
    String getElement();

    void setElement(String elementText);

    void setFunction(String textFun);

    TypeElement getType();

    void setType(TypeElement type);
}
