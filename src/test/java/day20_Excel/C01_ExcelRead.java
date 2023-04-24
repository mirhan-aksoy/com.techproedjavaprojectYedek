package day20_Excel;
import org.apache.poi.ss.usermodel.*;

import org.junit.Assert;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class C01_ExcelRead {
    @Test
    public void excelReadTest1() throws IOException {
        /*
            Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
            3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
            Kullanılan satır sayısın bulun
            Ülke-Başkent şeklinde verileri yazdırın
        */
        //Excel dosyasından bir veri okuyabilmemiz için;
        //1-Dosya yolunu alırız

        // dosya yolu yanlis diyor
        //src/test/java/resourse/Capitals (2).xlsx

       String dosyaYolu ="src/test/java/resourse/Capitals (2).xlsx";
       // String dosyaYolu = "src/test/java/resourses/Capitals (2).xlsx";
        //2-Dosyayı okuyabilmek için akışa almam gerekir workbook dosyası olarak aç
        FileInputStream fis = new FileInputStream(dosyaYolu);

        //FileInputStream fis = new FileInputStream("src/test/java/resourses/Capitals (2).xlsx");
        //3-Java ortamında bir excel dosyası oluşturmamız gerekir

        Workbook workbook = WorkbookFactory.create(fis);//create(fis) ile excel'de bu dosyayı okuruz
        //4-Sayfayı(Sheet) seçmemiz gerekir
        Sheet sheet1 = workbook.getSheet("Sheet1");

        //5-Satır(Row) seçmemiz gerekir
        Row row = sheet1.getRow(0);//1.satır çünkü index 0 dan başlar

        //6-Hücreyi(Cell) seçmemiz gerekir
        Cell cell = row.getCell(0);//1.sütun çünkü index 0 dan başlar
        System.out.println(cell);
    }
    @Test
    public void readExcelTest2() throws IOException {

        //src/test/java/resourse/Capitals (2).xlsx
        FileInputStream fis = new FileInputStream("src/test/java/resourse/Capitals (2).xlsx");

        Workbook workbook = WorkbookFactory.create(fis);
        //1.satır 1. sütun daki bilgiyi yazdırınız
        String satir1sutun1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));
        //System.out.println(satir1sutun1);
    }
    @Test
    public void readExcelTest3() throws IOException {

        FileInputStream fis = new FileInputStream("src/test/java/resourse/Capitals (2).xlsx");



        Workbook workbook = WorkbookFactory.create(fis);
        //Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
        //1.Yol
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(1);
        System.out.println("1. Satir 2. Sütun Bilgisi = "+cell);
        //2.Yol
        System.out.println("1. Satir 2. Sütun Bilgisi = "+workbook.getSheet("Sheet1").getRow(0).getCell(1));


        //3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
        String satir3sutun1 = workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
        System.out.println("3. Satır 1. Sütun Bilgisi = "+satir3sutun1);
        Assert.assertEquals("France",satir3sutun1);

        //Kullanılan satır sayısın bulun
        System.out.println("Kullanılan Satir Sayisi = "+workbook.getSheet("Sheet1").getPhysicalNumberOfRows());

        //Excel tablosunda kullanılan satir sayisini getPhysicalNumberOfRows() methodu ile alabiliriz
        System.out.println("Son Satir Sayisi = "+workbook.getSheet("Sheet1").getLastRowNum());

        //Excel tablosundaki son satır sayısını getSheet("Sheet1") yani sayfayı belirledikten sonra getLastRowNum()
        //methodu ile alabiliriz
        System.out.println("Son Sütun Sayısı = "+workbook.getSheet("Sheet1").getRow(1).getLastCellNum());
        System.out.println("Kullanılan Sütun Sayisi = "+workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells());

        //Ülke-Başkent şeklinde verileri yazdırın
        Map<String,String> ulkeVeBaskenler = new HashMap<>();
        for (int index = 1; index < workbook.getSheet("Sheet1").getPhysicalNumberOfRows(); index++) {
            String ulke = workbook.getSheet("Sheet1").getRow(index).getCell(0).toString();
            String basken = workbook.getSheet("Sheet1").getRow(index).getCell(1).toString();
            ulkeVeBaskenler.put(ulke,basken+"\n");
        }
        System.out.println("Ulke ve Baskenler = "+ulkeVeBaskenler);

        //3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
        //Kullanılan satır sayısın bulun
        //Ülke-Başkent şeklinde verileri yazdırın

    }
    @Test
    public void readExcelTest4() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/resourse/Capitals (2).xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        //Ülke-Başkent şeklinde verileri yazdırın
        for (int i = 0; i < workbook.getSheet("Sheet1").getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells(); j++) {
                System.out.print(workbook.getSheet("Sheet1").getRow(i).getCell(j)+"\t");
            }
            System.out.println();
        }
    }
}
