/*
b) McCarthy’s 91 function
Calculate the result of calling this method with arguments 50, 73, and 95. Note that the recursion on line 5 is
double.
*/

//Q) should I do the test in this class, or use a test method with Junit
public class McCarthyTest(){
	
	public static void main (String[] args){
		MaCarthyTest t = new McCarthyTest();
		t.launch();
	}
	
	public void launch(){
		mcCarthy91(50);
	}
		public int mcCarthy91(int n) {
		if (n > 100) {
			int temp = n - 10;
			System.out.println(temp);
			return temp;
		} else {
			int temp = mcCarthy91(mcCarthy91(n+11))
			System.out.println(temp);
			return temp;
			}
}
