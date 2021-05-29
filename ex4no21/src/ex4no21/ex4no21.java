package ex4no21;

public class ex4no21 {  // 165p
	public static void main(String[] args) {
		for( int i = 1 ; i <= 5 ; i++) {
			for( int j = 1 ; j <= 5 ; j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);
				}else {
					System.out.printf("%5c",' ');
				}
			}  // for
			System.out.println();
		}
	}

}
