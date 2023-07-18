package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;





public class CharacterSheet{

    public CharacterSheet(String character){

        Document documentPDF = new Document();

        try {
            PdfWriter.getInstance(documentPDF, new FileOutputStream("CharacterSheetTest.pdf"));

            documentPDF.open();

            Paragraph testParagraph = new Paragraph(character);

            documentPDF.add(testParagraph);

        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        documentPDF.close();
        

    }

}