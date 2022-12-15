package com.example.BuilderDocument.logic;

import com.example.BuilderDocument.entity.*;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

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

            if (pdfDocumentBlock.getTypeBlock()==TypeBlock.Text){

                List<PdfElement> elements = pdfDocumentBlock.getPdfElements();
                for (PdfElement element : elements){
                    if (element.getType()==TypeElement.Text){
                        document.add(new Paragraph(element.getElement()));
                    }
                }

            } else if (pdfDocumentBlock.getTypeBlock()==TypeBlock.Table) {
                Table table = new Table(pdfDocumentBlock.getColumn());
                List<PdfElement> elements = pdfDocumentBlock.getPdfElements();
                Cell cell;
                for (PdfElement element : elements){
                    cell = new Cell();
                    cell.add(element.getElement());
                    table.addCell(cell);
                }
                document.add(table);
            }

        }
        document.close();
    }
}