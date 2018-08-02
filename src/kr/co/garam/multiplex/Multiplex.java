package kr.co.garam.multiplex;

public class Multiplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 구구단을 출력하는 테스트
		
		int i = 2 ;
		int j = 1 ;
		
		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				System.out.println(String.format("%2d %s %2d %s %3d", i, "*", j, "=", (i*j))) ;
			}
			System.out.println("\n");
		}
	}

}
