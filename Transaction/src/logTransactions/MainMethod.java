package logTransactions;

import java.io.IOException;

public class MainMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String csvFile = "C:\\Users\\HP\\Desktop\\log.csv";
	       CSVReader.read(csvFile);
	       LogBook.printLog();
	}

}
