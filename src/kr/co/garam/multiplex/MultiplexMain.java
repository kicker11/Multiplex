package kr.co.garam.multiplex;

import java.util.Scanner;

public class MultiplexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 구구단을 출력하는 테스트
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		String[] splitValue = inputValue.split(",") ;
		
		int first = Integer.parseInt(splitValue[0]) ;
		int second = Integer.parseInt(splitValue[1]) ;
		
	    for	(int i = first; i <= second; i++) {
	    	int[] Result = Multiplex.Calc(i, second) ;
	    	Multiplex.print(Result);
	    }
	}

}
