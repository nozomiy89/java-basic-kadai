package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] primeJudge = new boolean[101];
		
		for(int i = 1; i < primeJudge.length; i++) {
			primeJudge[i] = true;
		}
		
		int divisor = 2;
		while(divisor < primeJudge.length) {
			for (int i= divisor + 1; i < primeJudge.length; i++) {
				if(i % divisor == 0) {
					primeJudge[i] = false;
					continue;
				}
			}
			divisor += 1;
		}
		
		for(int i = 2; i < primeJudge.length; i++) {
			if(primeJudge[i]) {
				System.out.println(i);
			}
		}

	}

}
