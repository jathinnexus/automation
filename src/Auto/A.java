package Auto;

import java.io.File;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A {

	public static void main(String[] args) {
		Workbook w=WorkbookFactory.create(new File("./data/Book2.xlsx") );
		String s=w.getSheet("sheet1").getRow(0).getCell(0).toString();
		System.out.println(s);
	}

}
