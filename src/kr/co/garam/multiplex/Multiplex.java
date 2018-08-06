package kr.co.garam.multiplex;

public class Multiplex {


	
	public static int[] Calc(int ftimes, int stimes) {
		int[] Result = new int[stimes] ;
	    for ( int i=0; i < Result.length; i++) {
	    	Result[i] = ftimes * (i+1) ;
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
