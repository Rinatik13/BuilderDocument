package com.example.BuilderDocument.Builder;

import com.example.BuilderDocument.logic.BuilderPdf;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BuilderPdfDocument {
    String address = "C:\\java\\pdfBuildTest";
    String json = "";
    @Test
    public void generatorPdfDocument(){

        BuilderPdf builderPdf = new BuilderPdf();
        builderPdf.createPdf(address,json);

    }

}