package kr.co.garam.multiplex;

public class MultiplexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 구구단을 출력하는 테스트
	    for	(int i = 2; i < 10; i++) {
	    	int[] Result = Multiplex.Calc(i) ;
	    	Multiplex.print(Result);
	    }
	}

}
