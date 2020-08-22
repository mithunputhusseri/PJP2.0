package calculator;

import java.io.IOException;
import java.util.ArrayList;

public class Main_method {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the calculator");
		 Date_input dt1 = new Date_input("31 12 2020"); 
		 Date_input dt2 = new Date_input(1, 2, 2004);
		 dateCalculations dcal = new dateCalculations(); 
		 String x =dcal.dayofweek(dt1);
		 System.out.println(x);
		// System.out.println(x);
		 int y = dcal.getWeekNumber(dt1);
		 System.out.println(y);
		 DisplayDate.dis(dt1);
		NaturalLanguage.tomorrow(dt1);
		DisplayDate.dis(dt1);
		
		//p1.print(dt1);
	}
	

}
