package calculator;

import java.util.ArrayList;

interface printable{
	public  void print(Date_input dt1);
	//public void printA(ArrayList<Date_input> al);
}
interface printArray{
	public void print(ArrayList<Date_input> al);
}
public class DisplayDate {
	
	public static void dis(Date_input dt1)
	{
		p1.print(dt1);
	}
	public static void displayArray(ArrayList<Date_input> al)
	{
		p2.print(al);
	}
	public static printable p1= (dt1)->{
		int d = dt1.getD();
		int m = dt1.getM();
		int y = dt1.getY();
		System.out.println(d + ":" + m + ":" + y);
	};
	public static printArray p2 = (al)->{
		for(int i=0;i<al.size();i++)
		{
			DisplayDate.dis(al.get(i));
		}
	};
	

}
