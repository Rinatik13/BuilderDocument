package com.example.BuilderDocument.entity;

import java.util.List;

public class PdfDocumentBlock {
    List<PdfElement> pdfElements;

    public PdfDocumentBlock() {
    }

    public List<PdfElement> getPdfElements() {
        return pdfElements;
    }

    public void setPdfElements(List<PdfElement> pdfElements) {
        this.pdfElements = pdfElements;
    }
}
