package com.example.BuilderDocument.logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentBuilderTest {
    @Test
    public void createPdfFile(){
        DocumentBuilder documentBuilder = new DocumentBuilder(
                "c:\\java\\test\\test.pdf");
        documentBuilder.add("Hello pdfWorld");
    }

}