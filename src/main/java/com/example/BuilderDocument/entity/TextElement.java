package com.example.BuilderDocument.entity;

import com.example.BuilderDocument.entity.interfases.Element;

public class TextElement implements Element {
    @Override
    public String createElement() {
        return "test";
    }
}
