package com.example.BuilderDocument.entity;

import java.util.List;

public class PdfDoc {
    private List<PdfDocumentBlock> pdfDocumentBlocks;

    public PdfDoc() {
    }

    public List<PdfDocumentBlock> getPdfDocumentBlocks() {
        return pdfDocumentBlocks;
    }

    public void setPdfDocumentBlocks(List<PdfDocumentBlock> pdfDocumentBlocks) {
        this.pdfDocumentBlocks = pdfDocumentBlocks;
    }
}