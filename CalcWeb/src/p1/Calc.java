package p1;
public class Calc {

	public static String DoCalc(String date, String function) {
	Date_input dt1 =  new Date_input(date);
	System.out.println(function);
	dateCalculations dcalc = new dateCalculations();
	//return DisplayDate.convert(dt1);
	if(function.equals("tommorow"))
	{
		//System.out.println("sdd");
		dt1 = dateCalculations.addDate(dt1, 1);
		return DisplayDate.convert(dt1);
	}
	else if(function.equals("yesterday"))
	{
		dt1 = dateCalculations.subDate(dt1, 1);
		return DisplayDate.convert(dt1);
	}
	else if(function.equals("weekday"))
	{
		return dateCalculations.dayofweek(dt1);
	}
	else if(function.equals("next week"))
	{
		dt1 = dateCalculations.addDate(dt1, 7);
		return DisplayDate.convert(dt1);
	}
	return "";	
	}

}
