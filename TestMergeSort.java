import java.util.*;

public class TestMergeSort {
	
	
	public static void main (String[] args) {
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		
		for(int i = 10; i > 0; i--) {
			left.add(i);
			right.add(i);
		}
		
		Mergesort ms = new Mergesort();
		
		List<Integer> result = ms.mergesort(left, right);
		
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}