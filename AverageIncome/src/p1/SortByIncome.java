package p1;

import java.util.Comparator;

public class SortByIncome implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String arr[] = o1.split(",");
		String arr1[] = o2.split(",");
		return (int)Double.parseDouble(arr[2]) - (int)Double.parseDouble(arr1[2]);
	}

}
