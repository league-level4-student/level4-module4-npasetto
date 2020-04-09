package _01_introduction_to_encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private static int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private static double degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private static String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private static Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	
	@Test
	public void test() {
		setItemsReceived(6);
		assertEquals(getItemsReceived(),6);
		setItemsReceived(-2000000000);
		assertEquals(getItemsReceived(),0);
		setDegreesTurned(90);
		assertEquals(getDegreesTurned(),90,0.001);
		setDegreesTurned(999);
		assertEquals(getDegreesTurned(),279,0.001);
		setDegreesTurned(-460);
		assertEquals(getDegreesTurned(),100,0.001);
		setNomenclature("Nomenclature");
		assertEquals(getNomenclature(),"Nomenclature");
		setNomenclature("");
		assertEquals(getNomenclature()," ");
		setMemberObj(666);
		assertEquals(getMemberObj(),666);
		String s="Object";
		setMemberObj(s);
		assertNotEquals(getMemberObj(),"Object");
	}
	public static int getItemsReceived() {
		return itemsReceived;
	}
	public static double getDegreesTurned() {
		return degreesTurned;
	}
	public static String getNomenclature() {
		return nomenclature;
	}
	public static Object getMemberObj() {
		return memberObj;
	}
	public static void setItemsReceived(int i) {
		if(i<0) {
			itemsReceived=0;
		}else {
			itemsReceived=i;
		}
	}
	public static void setDegreesTurned(double d) {
		d=Math.abs(d);
		degreesTurned=d%360;
	}
	public static void setNomenclature(String s) {
		if(s.equals("")) {
			nomenclature=" ";
		}else {
			nomenclature=s;
		}
	}
	public static void setMemberObj(Object o) {
		if(o instanceof String) {
			memberObj=new Object();
		}else {
			memberObj=o;
		}
	}
}
