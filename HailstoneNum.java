import java.util.*;

public class HailstoneNum {
	//private List<Integer> numbers = new ArrayList<Integer>();
	
	public List<Integer> hailstone(int n, List<Integer> numbers) {		
		numbers.add(n);
		if(n==1) {
			return numbers;
		}
		if(n%2==0) {
			return hailstone(n/2, numbers);
		} else {
			return hailstone(3*n+1, numbers);
		}
	}

	public static void main(String[] args) {
		HailstoneNum hail = new HailstoneNum();
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers = hail.hailstone(10, numbers);
		
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}
}