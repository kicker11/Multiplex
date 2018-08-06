package kr.co.garam.multiplex;

import java.util.Scanner;

public class Multiplex {


	
	public static int[] Calc(int times) {
		int[] Result = new int[9] ;
	    for ( int i=0; i < Result.length; i++) {
	    	Result[i] = times * (i+1) ;
	    }
		return Result ;
	}
	
	public static void print(int[] Result) {
		for(int i = 0; i < Result.length; i++) {
			System.out.println(Result[i]);
		}
		System.out.println("\n");
	}
	

}
