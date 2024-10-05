/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;




public class PDFWriter 
{
    public boolean getTextTOPDF(String path,String text,String department,String subject,String time,String total_marks)
    {
        boolean flag=true;
        try
        {
            PdfDocument pdfDoc=new PdfDocument(new PdfWriter(path));
            
            Document doc = new Document(pdfDoc);
            
            department="               Department: "+department;
            Text text1=new Text(department);
            text1.setBold();
            
            subject="                   Subject:"+subject;
            Text text2=new Text(subject);
            
            text2.setBold();
            time="                       Time: "+time;
            
            Text text3=new Text(time);
            text3.setBold();
            
            total_marks="                 Total Marks: "+total_marks;
            Text text4=new Text(total_marks);
            text4.setBold();
            
            Text text5=new Text(text);
            
            Paragraph para1=new Paragraph(text1);
            Paragraph para2=new Paragraph(text2);
            Paragraph para3=new Paragraph(text3);
            Paragraph para4=new Paragraph(text4);
            Paragraph para5=new Paragraph(text5);
            
            doc.add(para1);
            doc.add(para2);
            doc.add(para3);
            doc.add(para4);
            doc.add(para5);
            doc.close();
            System.out.println("Text added successfully....");
            
            
            
            
        
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception is:"+ex);
            flag=false;
        }
        return flag;
    }
}
