package org.selenide.excelOperations;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.*;

public class ReadingExcel {

    public static void main(String[] args) throws Exception {
        File file = new File("./resources/data.xlsx");
        FileInputStream fis = new FileInputStream(file);
        
    }

}
