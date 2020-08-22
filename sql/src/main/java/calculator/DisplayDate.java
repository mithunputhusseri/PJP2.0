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
	public static String convertSQL(Date_input dt1)
	{
		String str = "";
		str = str + dt1.getY() + "-";
		if(dt1.getM()<10)
		{
			str = str + "0" + dt1.getM();
		}
		else
			str=str + dt1.getM();
		str = str+ "-";
		if(dt1.getD()<10)
		{
			str = str + "0" + dt1.getD();
		}
		else
			str=str + dt1.getD();
		//System.out.println(str);
		return str;
	}
	public static Date_input convert2dt(String str)
	{
		String [] arr = str.split("-");
		Date_input dt1 = new Date_input();
		dt1.setY(Integer.parseInt(arr[0]));
		dt1.setM(Integer.parseInt(arr[1]));
		dt1.setD(Integer.parseInt(arr[2]));
		
		return dt1;
		
	}
	

}
