package sql;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import calculator.DateSqlCalc;
import calculator.Date_input;
import calculator.DisplayDate;

class CalcTest {

	
	@Test
	void test() {
		Date_input dt1 = new Date_input("31 12 2020"); 
		Date_input dt2 = new Date_input("30 12 2020");
		int n = DateSqlCalc.diffDateSql(dt1, dt2);
		assertEquals(n, 1);
	}
	@Test
	void tes1t() {
		Date_input dt1 = new Date_input("25 12 2020"); 
		Date_input dt2 = new Date_input("30 12 2020");
		int n = DateSqlCalc.diffDateSql(dt1, dt2);
		assertEquals(n, -5);
	}
	@Test
	void test2() {
		Date_input dt1 = new Date_input("20 12 2020"); 
		Date_input dt2 = new Date_input("30 12 2020");
		int n = DateSqlCalc.diffDateSql(dt1, dt2);
		assertEquals(n, -10);
	}
	@Test
	void test3() {
		Date_input dt1 = new Date_input("10 12 2020"); 
		Date_input dt2 = new Date_input("30 12 2020");
		int n = DateSqlCalc.diffDateSql(dt1, dt2);
		assertEquals(n, -20);
	}
	@Test
	void test4() {
		Date_input dt1 = new Date_input("10 12 2020"); 
		//Date_input dt2 = new Date_input("30 12 2020");
		dt1 = DateSqlCalc.addDateSql(dt1, 20);
		assertEquals(DisplayDate.convertSQL(dt1), "2020-12-30");
	}
	@Test
	void test5() {
		Date_input dt1 = new Date_input("10 12 2020"); 
		Date_input dt2 = new Date_input("30 12 2020");
		int n = DateSqlCalc.diffDateSql(dt1, dt2);
		assertEquals(n, -20);
	}
	@Test
	void test6() {
		Date_input dt1 = new Date_input("10 12 2020"); 
		//Date_input dt2 = new Date_input("30 12 2020");
		dt1 = DateSqlCalc.addDateSql(dt1, 20);
		assertEquals(DisplayDate.convertSQL(dt1), "2020-12-30");
	}
	@Test
	void test7() {
		Date_input dt1 = new Date_input("10 12 2020"); 
		//Date_input dt2 = new Date_input("30 12 2020");
		dt1 = DateSqlCalc.addDateSql(dt1, 20);
		assertEquals(DisplayDate.convertSQL(dt1), "2020-12-30");
	}
	@Test
	void test8() {
		Date_input dt1 = new Date_input("10 12 2020"); 
		//Date_input dt2 = new Date_input("30 12 2020");
		dt1 = DateSqlCalc.addDateSql(dt1, 20);
		assertEquals(DisplayDate.convertSQL(dt1), "2020-12-30");
	}
	@Test
	void test9() {
		Date_input dt1 = new Date_input("10 12 2020"); 
		//Date_input dt2 = new Date_input("30 12 2020");
		dt1 = DateSqlCalc.addDateSql(dt1, 20);
		assertEquals(DisplayDate.convertSQL(dt1), "2020-12-30");
	}
	

}
