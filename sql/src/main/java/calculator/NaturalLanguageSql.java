package calculator;

public class  NaturalLanguageSql {
	static dateCalculations dcalc = new dateCalculations();
	public static Date_input tomorrow(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,1);
	}
	public static Date_input Dayaftertomorrow(Date_input dt1)
	{
		
		return DateSqlCalc.addDateSql(dt1,2);
	}
	public static Date_input yesterday(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,-1);
	}
	public static Date_input  Daybeforeyesterday(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,-2);
	}
	public static Date_input lastWeek(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,-7);
	}
	public static Date_input nextWeek(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,7);
	}
	public static Date_input nextMonth(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,30);
	}
	public static Date_input nextYear(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,365);
	}
	public static Date_input lastMonth(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,-30);
	}
	public static Date_input lastYear(Date_input dt1)
	{
		return DateSqlCalc.addDateSql(dt1,-365);
	}
	public static Date_input nweeksafter(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,n*7);
	}
	public static Date_input nDaysAfter(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,n);
	}
	public static Date_input nMonthsAfter(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,30*n);
	}
	public static Date_input nYearsAfter(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,365*n);
	}
	public static Date_input nweeksBefore(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,-n*7);
	}
	public static Date_input nDaysBefore(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,-n);
	}
	public static Date_input nMonthsBefore(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,-n*30);
	}
	public static Date_input nYearsBefore(Date_input dt1,int n)
	{
		return DateSqlCalc.addDateSql(dt1,-n*365);
	}
	
}
