package com.example.BuilderDocument.logic;

import com.example.BuilderDocument.entity.PdfDoc;
import com.example.BuilderDocument.entity.PdfDocumentBlock;
import com.example.BuilderDocument.entity.PdfElement;
import com.example.BuilderDocument.entity.TypeElement;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.util.List;

public class BuilderPdf {

    public void createPdf(String address, PdfDoc doc) throws FileNotFoundException {
        PdfWriter pdfWriter;
        pdfWriter = new PdfWriter(address);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        Document document = new Document(pdfDocument);

        List<PdfDocumentBlock> blocks = doc.getPdfDocumentBlocks();

        // выбираем блок из списка блоков
        for (PdfDocumentBlock pdfDocumentBlock : blocks){
            List<PdfElement> elements = pdfDocumentBlock.getPdfElements();
            for (PdfElement element : elements){
                if (element.getType()==TypeElement.Text){
                    document.add(new Paragraph(element.getElement()));
                }
            }
        }
        document.close();

    }
}
