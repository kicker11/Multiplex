package kr.co.garam.multiplex;

import java.util.Scanner;

public class Multiplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 구구단을 출력하는 테스트
	
		int i, j ;
		int Result[] = new int[9] ;
	
		for ( i=2; i < 10; i++) {
			for ( j=1; j < (Result.length + 1); j++) {
				Result[j-1] = i * j ;
				System.out.println( i + " * " + j +  " = " + Result[j-1] ) ;
			}
			System.out.println("\n");
		}

	
	}

}
