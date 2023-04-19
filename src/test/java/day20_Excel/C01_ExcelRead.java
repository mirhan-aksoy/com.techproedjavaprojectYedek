package day20_Excel;
import org.apache.poi.ss.usermodel.*;
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
        String dosyaYolu = "src/test/java/resourses/Capitals (2).xlsx";
        //2-Dosyayı okuyabilmek için akışa almam gerekir
        FileInputStream fis = new FileInputStream(dosyaYolu);
        //FileInputStream fis = new FileInputStream("src/test/java/resourses/Capitals (2).xlsx");
        //3-Java ortamında bir excel dosyası oluşturmamız gerekir
        Workbook workbook = WorkbookFactory.create(fis);//create(fis) ile excel'de bu dosyayı okuruz
        //4-Sayfayı(Sheet) seçmemiz gerekir
        Sheet sheet = workbook.getSheet("Sheet1");
        //5-Satır(Row) seçmemiz gerekir
        Row row = sheet.getRow(0);//1.satır çünkü index 0 dan başlar
        //6-Hücreyi(Cell) seçmemiz gerekir
        Cell cell = row.getCell(0);//1.sütun çünkü index 0 dan başlar
        System.out.println(cell);
    }
    @Test
    public void readExcelTest2() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/resourses/Capitals (2).xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        //1.satır 1. sütun daki bilgiyi yazdırınız
        String satir1sutun1 = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));
        //System.out.println(satir1sutun1);
    }
    @Test
    public void readExcelTest3() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/resourses/Capitals (2).xlsx");
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
        //Kullanılan satır sayısın bulun
        //Ülke-Başkent şeklinde verileri yazdırın
    }
}
