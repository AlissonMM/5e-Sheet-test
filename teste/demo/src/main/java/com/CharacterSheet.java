package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;





public class CharacterSheet{

    private String sheetpath = "Sheets/CharacterSheet.pdf";

    public void Sheet(String name, String class_, int level){

        Document documentPDF = new Document();


            try {
                PdfWriter.getInstance(documentPDF, new FileOutputStream(sheetpath));

                documentPDF.open();

            Paragraph testParagraph = new Paragraph(name + class_ + level);

            documentPDF.add(testParagraph);


            } catch (DocumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        documentPDF.close();
        

    }

}