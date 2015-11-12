import org.junit.*;
import static org.junit.Assert.*;

public class TestFibMem{
	
	@Test
	public void testsFib(){      // on even??
		FibMem fibbo = new FibMem();
		fibbo.fib2(40);
		FibMem fibbo2 = new FibMem();
		fibbo2.fib2(45);
	}
	
}