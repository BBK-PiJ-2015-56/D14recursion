// arrays are 0-based, so F(1) is stored at position 0, etc

public class FibMem{
	private int[] precalculated = null;
	
	public int fib2(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return fib2(n-1) + fib2(n-2);
	}
	
	public int fib(int n) {
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated[n-1];
		} else {
			int result = fib(n-1) + fib(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}
	private void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}
	
	public static void main(String[] args){
		FibMem fibbo = new FibMem();
		System.out.println(fibbo.fib(40));
		System.out.println(fibbo.fib(45));
	}
}