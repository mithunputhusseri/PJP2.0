package calculator;

import java.io.IOException;
import java.util.ArrayList;

public class Main_method {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the calculator");
		 Date_input dt1 = new Date_input("31 12 2020"); 
		Date_input dt2 = new Date_input(18, 11, 2004);
		DisplayDate.dis(dt1);
		dt1 = DateSqlCalc.addDateSql(dt1, 1);
		DisplayDate.dis(dt1);
		dt1 = DateSqlCalc.addDateSql(dt1, -1);
		DisplayDate.dis(dt1);
		int n = DateSqlCalc.diffDateSql(dt1, dt2);
		System.out.println(n);
		dateCalculations dcalc = new dateCalculations();
		System.out.println(dcalc.dayofweek(dt1));
		
		System.out.println("Printing out the session memory in DataBase");
		MemoryManagment.memoryRead();
	}
	

}
