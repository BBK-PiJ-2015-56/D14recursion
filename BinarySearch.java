import java.util.*;

public class BinarySearch {
	public boolean search(int n, List<Integer> list) {
		if(list == null || list.size() == 0) {
			return false;			
		}
		int halfSize = list.size()/2;
		int temp = list.get(halfSize);
		if(temp==n) {
			return true;
		} else if (halfSize == 0){
			return false;
		}
		
		if(temp>n) {
			return search(n, list.subList(0, halfSize));
		} else {
			return search(n, list.subList(halfSize + 1, list.size()));
		}
	}	
}