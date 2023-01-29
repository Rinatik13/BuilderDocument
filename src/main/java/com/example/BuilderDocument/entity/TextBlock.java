package com.example.BuilderDocument.entity;

import com.example.BuilderDocument.entity.interfases.Block;
import com.example.BuilderDocument.entity.interfases.Element;

import java.util.ArrayList;
import java.util.List;

public class TextBlock implements Block {
    List<Element> elements = new ArrayList<>();
    @Override
    public List<Element> getElements() {
        return elements;
    }

    public TextBlock() {
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "TextBlock{" +
                "elements=" + elements +
                '}';
    }
}
