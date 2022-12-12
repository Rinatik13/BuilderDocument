package com.example.BuilderDocument.Builder;

import com.example.BuilderDocument.entity.*;
import com.example.BuilderDocument.logic.BuilderPdf;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BuilderPdfDocument {
    String address = "C:\\java\\pdfBuildTest\\test.pdf";
    PdfDoc pdfDocument = new PdfDoc();

    @Test
    public void generatorPdfDocument() throws FileNotFoundException {
        PdfElement element = new PdfObjectElement();
        element.getElement();
        element.setType(TypeElement.Text);
        element.setElement("Новый текстовый документ");
        List<PdfElement> pdfElements = new ArrayList<>();
        pdfElements.add(element);
        PdfDocumentBlock block = new PdfDocumentBlock();
        block.setPdfElements(pdfElements);
        List<PdfDocumentBlock> blocks = new ArrayList<>();
        blocks.add(block);
        pdfDocument.setPdfDocumentBlocks(blocks);
        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address,pdfDocument);
    }

}