package utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class readExcel {

        public String getData(String pathOfTheExcel , String sheetName){

            String path = ReadPropertiesFile.getData( pathOfTheExcel );

            FileInputStream inStream = null;

                try{
                    inStream =new FileInputStream( path );
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            Workbook workbook = null;

                try{
                    workbook = WorkbookFactory.create( inStream );
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }

            Sheet sheet = workbook.getSheet( sheetName );

            Row row;

            Cell cell;

            int maxRow = sheet.getPhysicalNumberOfRows();

            System.out.println(maxRow);

            

            return "a";
        }
}
