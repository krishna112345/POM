package java_programs;

import org.apache.commons.collections.comparators.ReverseComparator;

public class StringPrograms {

	public static void main(String[] args) {
		reverse();
		duplicateChars();
	}
	public static void reverse() {
		String str="raju";
		System.out.println(new StringBuffer(str).reverse());
		
	}
	public static  void  duplicateChars() {
		String str="raju";
		System.out.println(new StringBuffer(str).reverse());
		String str1="raju";
		System.out.println(new StringBuffer(str).reverse());
		String str2="raju";
		System.out.println(new StringBuffer(str).reverse());
	}

}
