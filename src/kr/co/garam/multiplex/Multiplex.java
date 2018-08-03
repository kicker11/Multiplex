package kr.co.garam.multiplex;

import java.util.Scanner;

public class Multiplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 구구단을 출력하는 테스트
		
		int i = 2 ;
		int j = 1 ;
		int Rst = 0;

		System.out.println("구구단을 출력하시겠습니까. ? [y/n]") ;
		
		Scanner MyInput = new Scanner(System.in) ;
		
		String Ans = MyInput.next() ;
			
		
		if ( ("y").equals(Ans)) {
			for (i = 2; i < 10; i++) {
				for (j = 1; j < 10; j++) {
					Rst = i * j ;
					System.out.println(String.format("%2d %s %2d %s %3d", i, "*", j, "=", Rst)) ;
				}
				System.out.println("\n");
			}
		} else {
			System.out.println("취소되었습니다.") ;
		}
	}

}
