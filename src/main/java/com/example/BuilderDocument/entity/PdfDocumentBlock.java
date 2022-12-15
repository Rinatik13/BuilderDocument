package com.example.BuilderDocument.entity;

import java.util.List;

public class PdfDocumentBlock {

    private TypeBlock typeBlock;
    private int column;
    List<PdfElement> pdfElements;

    public PdfDocumentBlock() {
    }

    public TypeBlock getTypeBlock() {
        return typeBlock;
    }

    public void setTypeBlock(TypeBlock typeBlock) {
        this.typeBlock = typeBlock;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public List<PdfElement> getPdfElements() {
        return pdfElements;
    }

    public void setPdfElements(List<PdfElement> pdfElements) {
        this.pdfElements = pdfElements;
    }
}
