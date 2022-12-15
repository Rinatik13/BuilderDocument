package com.example.BuilderDocument.Builder;

import com.example.BuilderDocument.entity.*;
import com.example.BuilderDocument.logic.BuilderPdf;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class BuilderPdfDocumentTest {
    String address = "C:\\java\\pdfBuildTest\\";
    PdfDoc pdfDocument = new PdfDoc();


    @Test
    public void generatorPdfDocumentOneTest() throws FileNotFoundException {

        PdfElement element = new PdfObjectElement();
        element.setType(TypeElement.Text);
        element.setElement("123");

        List<PdfElement> pdfElements = new ArrayList<>();
        pdfElements.add(element);

        PdfDocumentBlock block = new PdfDocumentBlock();
        block.setPdfElements(pdfElements);

        List<PdfDocumentBlock> blocks = new ArrayList<>();
        block.setTypeBlock(TypeBlock.Text);
        blocks.add(block);

        pdfDocument.setPdfDocumentBlocks(blocks);
        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address + "OneTest.pdf",pdfDocument);
    }

    @Test
    public void generatorPdfDocumentTwoText() throws FileNotFoundException{

        PdfElement element = new PdfObjectElement();
        element.setType(TypeElement.Text);
        element.setElement("123");

        PdfElement element1 = new PdfObjectElement();
        element1.setType(TypeElement.Text);
        element1.setElement("Hello World");

        List<PdfElement> pdfElements = new ArrayList<>();
        pdfElements.add(element);
        pdfElements.add(element1);

        PdfDocumentBlock block = new PdfDocumentBlock();
        block.setTypeBlock(TypeBlock.Text);
        block.setPdfElements(pdfElements);

        List<PdfDocumentBlock> blocks = new ArrayList<>();
        blocks.add(block);

        pdfDocument.setPdfDocumentBlocks(blocks);
        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address + "TwoText.pdf",pdfDocument);
    }

    @Test
    public void oneTableColumn() throws FileNotFoundException {
        PdfElement element = new PdfObjectElement();
        element.setType(TypeElement.Text);
        element.setElement("Test One Table");

        List<PdfElement> pdfElements = new ArrayList<>();
        pdfElements.add(element);

        PdfDocumentBlock block = new PdfDocumentBlock();
        block.setColumn(1);
        block.setTypeBlock(TypeBlock.Table);
        block.setPdfElements(pdfElements);

        List<PdfDocumentBlock> blocks = new ArrayList<>();
        blocks.add(block);

        pdfDocument.setPdfDocumentBlocks(blocks);
        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address + "OneTableOneColumn.pdf",pdfDocument);
    }

    @Test
    public void twoTableColumn() throws FileNotFoundException{
        PdfElement element = new PdfObjectElement();
        element.setType(TypeElement.Text);
        element.setElement("Test One Table");

        PdfElement element2 = new PdfObjectElement();
        element2.setType(TypeElement.Text);
        element2.setElement("Test Two Table");

        List<PdfElement> pdfElements = new ArrayList<>();
        pdfElements.add(element);
        pdfElements.add(element2);

        PdfDocumentBlock block = new PdfDocumentBlock();
        block.setColumn(2);
        block.setTypeBlock(TypeBlock.Table);
        block.setPdfElements(pdfElements);

        List<PdfDocumentBlock> blocks = new ArrayList<>();
        blocks.add(block);

        pdfDocument.setPdfDocumentBlocks(blocks);
        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address + "TwoTableOneColumn.pdf",pdfDocument);
    }

    @Test
    public void oneTextEndOneTable() throws FileNotFoundException{
        PdfElement textElement = new PdfObjectElement();
        textElement.setType(TypeElement.Text);
        textElement.setElement("Test One Table");

        PdfElement element = new PdfObjectElement();
        element.setType(TypeElement.Text);
        element.setElement("Test One Table");

        PdfElement element2 = new PdfObjectElement();
        element2.setType(TypeElement.Text);
        element2.setElement("Test Two Table");

        List<PdfElement> pdfTextElement = new ArrayList<>();
        pdfTextElement.add(textElement);

        List<PdfElement> pdfElements = new ArrayList<>();
        pdfElements.add(element);
        pdfElements.add(element2);

        PdfDocumentBlock textBloc = new PdfDocumentBlock();
        textBloc.setTypeBlock(TypeBlock.Text);
        textBloc.setPdfElements(pdfTextElement);

        PdfDocumentBlock block = new PdfDocumentBlock();
        block.setColumn(2);
        block.setTypeBlock(TypeBlock.Table);
        block.setPdfElements(pdfElements);

        List<PdfDocumentBlock> blocks = new ArrayList<>();
        blocks.add(textBloc);
        blocks.add(block);

        pdfDocument.setPdfDocumentBlocks(blocks);
        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address + "OneTextEndOneTable.pdf",pdfDocument);
    }

    @Test
    public void twoTextTwoTable () throws FileNotFoundException{

        PdfElement textElement1 = new PdfObjectElement();
        textElement1.setType(TypeElement.Text);
        textElement1.setElement("Text1");

        List<PdfElement> textElements1 = new ArrayList<>();
        textElements1.add(textElement1);


        PdfElement textTable = new PdfObjectElement();
        textTable.setType(TypeElement.Text);
        textTable.setElement("Test One Table1");

        PdfElement textTable2 = new PdfObjectElement();
        textTable2.setType(TypeElement.Text);
        textTable2.setElement("Test Two Table1");

        List<PdfElement> tableElements1 = new ArrayList<>();
        tableElements1.add(textTable);
        tableElements1.add(textTable2);



        PdfElement textElement = new PdfObjectElement();
        textElement.setType(TypeElement.Text);
        textElement.setElement("Text2");

        List<PdfElement> pdfTextElement = new ArrayList<>();
        pdfTextElement.add(textElement);



        PdfElement element = new PdfObjectElement();
        element.setType(TypeElement.Text);
        element.setElement("Test One Table2");

        PdfElement element2 = new PdfObjectElement();
        element2.setType(TypeElement.Text);
        element2.setElement("Test Two Table2");

        List<PdfElement> pdfElements = new ArrayList<>();
        pdfElements.add(element);
        pdfElements.add(element2);

        PdfDocumentBlock textBloc1 = new PdfDocumentBlock();
        textBloc1.setTypeBlock(TypeBlock.Text);
        textBloc1.setPdfElements(textElements1);

        PdfDocumentBlock tableBloc1 = new PdfDocumentBlock();
        tableBloc1.setTypeBlock(TypeBlock.Table);
        tableBloc1.setColumn(2);
        tableBloc1.setPdfElements(tableElements1);

        PdfDocumentBlock textBloc = new PdfDocumentBlock();
        textBloc.setTypeBlock(TypeBlock.Text);
        textBloc.setPdfElements(pdfTextElement);

        PdfDocumentBlock block = new PdfDocumentBlock();
        block.setColumn(2);
        block.setTypeBlock(TypeBlock.Table);
        block.setPdfElements(pdfElements);

        List<PdfDocumentBlock> blocks = new ArrayList<>();
        blocks.add(textBloc1);
        blocks.add(tableBloc1);
        blocks.add(textBloc);
        blocks.add(block);

        pdfDocument.setPdfDocumentBlocks(blocks);
        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address + "TwoTextEndTwoTable.pdf",pdfDocument);
    }

}