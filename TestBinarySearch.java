import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
public class TestBinarySearch{
	
	private BinarySearch bs = new BinarySearch();
	
	@Test 
	public void testsNumbersOddSizeList(){
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i < 20; i++){
			list1.add(i);
		}
	
		boolean output = bs.search(3 , list1);
		assertTrue(output);
		
		output = bs.search(41 , list1);
		assertFalse(output);
		
		output = bs.search(7 , list1);
		assertTrue(output);
		
		output = bs.search(60 , list1);
		assertFalse(output);
	}
	
	@Test
	public void testsNumbersEvenSizedList(){
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i = 1; i < 21; i++){
			list1.add(i);
		}
	
		boolean output = bs.search(3 , list1);
		assertTrue(output);
		
		output = bs.search(41 , list1);
		assertFalse(output);
		
		output = bs.search(7 , list1);
		assertTrue(output);
		
		output = bs.search(60 , list1);
		assertFalse(output);
	}
	
	@Test
	public void testsEmptyList(){
		List<Integer> list1 = new ArrayList<Integer>();
		boolean output = bs.search(3 , list1);
		assertFalse(output);
	}
	
	@Test
	public void testsNullList(){
		List<Integer> list1 = null;
		boolean output = bs.search(3 , list1);
		assertFalse(output);
	}
	
}