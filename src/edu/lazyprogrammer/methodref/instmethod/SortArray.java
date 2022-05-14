package edu.lazyprogrammer.methodref.instmethod;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		String[] stringArray = { "ab", "Ef", "cd" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);
 
        System.out.print("Sorted StringArray:");
        for (String str : stringArray) {
              System.out.print(str + " ");
        }

	}

}
