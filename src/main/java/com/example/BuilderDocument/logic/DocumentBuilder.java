package com.example.BuilderDocument.logic;

import com.example.BuilderDocument.entity.interfases.Block;
import com.example.BuilderDocument.entity.interfases.DocumentFile;
import com.example.BuilderDocument.entity.interfases.Element;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class DocumentBuilder {
    private DocumentFile documentFile;
    private Document document;
    private PdfWriter pdfWriter;
    private PdfDocument pdfDocument;
    private Paragraph paragraph;

    public DocumentBuilder(String fileAddress) {
        try {
            pdfWriter = new PdfWriter(fileAddress);
            pdfDocument = new PdfDocument(pdfWriter);
            document = new Document(pdfDocument);
            paragraph = new Paragraph();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void createDoc(){
        for (Block block:documentFile.getBlocks()){
            for (Element element : block.getElements()){
                add(element.createElement());
            }
        }
    }

    public void add(String element) {
        // создания шрифта
        // нужно прописать механизам создания шрифта
        paragraph.add(element);
        document.add(paragraph);
        document.close();
    }

}
