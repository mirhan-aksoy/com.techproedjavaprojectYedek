package day20_Excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C02 {
    @Test
    public void excelWriteTest1()  throws IOException {
        /*
    Bir "NÜFUS" sütunu oluşturup başkent nüfuslarını excel doyasına yazınız:
    (D.C: 712816, Paris: 2161000, London: 8982000, Ankara: 5663000 ...)
     */
        FileInputStream fis = new FileInputStream("src/test/java/resourse/Capitals (2).xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        workbook.getSheet("Sheet1").getRow(0).createCell(2).setCellValue("NUFUS");
        FileOutputStream fos = new FileOutputStream("src/test/java/resourse/Capitals (2).xlsx");
        workbook.write(fos);
        //src/test/java/resourse/Capitals (2).xlsx



    }
}
