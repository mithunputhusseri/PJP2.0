package logTransactions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
	   public static final String delimiter = ",";
	   public static void read(String csvFile) {
	      try {
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         int i=0;
	         while((line = br.readLine()) != null) {
	        	 if(i==0) i=i+1;
	        	 else
	        	 {
	        		LogBook.detailLog(line);
	            tempArr = line.split(delimiter);
	           // System.out.println(Integer.parseInt(tempArr[0]));
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " ");
	            }
	            System.out.println();
	        	 }
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }

}
