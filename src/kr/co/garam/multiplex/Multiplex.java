package kr.co.garam.multiplex;

import java.util.Scanner;

public class Multiplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 구구단을 출력하는 테스트
		
		int i = 2 ;
		int j = 1 ;
		int Rst = 0;

		System.out.println("전체 구구단을 출력하시겠습니까. ? [y/n]") ;
        
		
		Scanner MyInputStr = new Scanner(System.in) ;
		String YN = MyInputStr.next() ;
			
		
		if ( ("y").equals(YN)) {
			for (i = 2; i < 10; i++) {
				for (j = 1; j < 10; j++) {
					Rst = i * j ;
					System.out.println(String.format("%2d %s %2d %s %3d", i, "*", j, "=", Rst)) ;
				}
				System.out.println("\n");
			}
		} else {
			System.out.println("몇 단을 출력하시겠습니까? : ");
			Scanner MyInputInt = new Scanner(System.in) ;
			int AnsInt = MyInputInt.nextInt() ;

			
			if ( AnsInt > 0 ) {  
			
				System.out.println(String.format("%s  %s  %d %s", "Using while loop Result", " : " , AnsInt, "단"));	
				while ( j < 10 ) {
					Rst = AnsInt * j ;
					System.out.println(String.format("%2d %s %2d %s %3d", AnsInt, "*", j, "=", Rst)) ;
					j = j + 1;
				}
				
	
				System.out.println(String.format("%s  %s  %d %s", "Using for loop Result", " : " , AnsInt, "단"));
				for ( j= 1; j < 10; j++) {
					Rst = AnsInt * j ;
					System.out.println(String.format("%2d %s %2d %s %3d", AnsInt, "*", j, "=", Rst)) ;
				}
			} else {
				System.out.println("잘못된 단을 입력하셨습니다. 입력값 = " + AnsInt);
			}
				
			
		}

	
	}

}
