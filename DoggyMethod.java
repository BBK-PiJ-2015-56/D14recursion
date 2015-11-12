/* 1 Recursive code, line by line
   a)
   Do you see anything wrong with the following code? How would you fix it?String doggyMethod(int n) {
String doggyMethod(int n) {
String result = doggyMethod(n-3) + n + doggyMethod(n-2);
if (n <= 0) {
return "";
}
return result;
}

*/
// fix by changing order
String doggyMethod(int n) {
	if (n <= 0) {
		return "";
		}
String result = doggyMethod(n-3) + n + doggyMethod(n-2);
return result;
}