package java_programs;

import org.apache.commons.collections.comparators.ReverseComparator;

public class StringPrograms {

	public static void main(String[] args) {
		reverse();
	}
	public static void reverse() {
		String str="raju";
		System.out.println(new StringBuffer(str).reverse());
		
	}

}
