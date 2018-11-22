package com.offcn.pdfdemo01;

import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        PdfWriter pdfWriter=new PdfWriter("/javaSuport/简历/简历.pdf");
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        Document doc = new Document(pdfDocument);
        PdfFont font = PdfFontFactory.createFont("STSongStd-Light", "UniGB-UCS2-H");
        doc.add(new Paragraph("简历").setFont(font).setFontSize(30).setTextAlignment(TextAlignment.CENTER));
        Table table=new Table(new float[]{200,200,100,200,200});
        Cell c1 = new Cell(1, 5);
        c1.setBackgroundColor(Color.GREEN);
        c1.add("基本情况").setFont(font).setTextAlignment(TextAlignment.LEFT);
        table.addCell(c1);
        Cell c2 = new Cell();
        c2.add("姓名").setFont(font).setTextAlignment(TextAlignment.LEFT);
        table.addCell(c2);
        Cell c3 = new Cell();
        c3.add("王珂").setFont(font).setTextAlignment(TextAlignment.LEFT);
        table.addCell(c3);
        Cell c4 = new Cell();
        c4.add("性别").setFont(font).setTextAlignment(TextAlignment.LEFT);
        table.addCell(c4);
        Cell c5 = new Cell();
        c5.add("男").setFont(font).setTextAlignment(TextAlignment.LEFT);
        table.addCell(c5);
        Cell c6 = new Cell(7, 1);
        table.addCell(c6);
        doc.add(table);
        doc.close();
        pdfDocument.close();
        pdfWriter.close();


    }
}
