// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		int min1 = Math.min(a,b);
		int min2 = Math.min(min1,c);
		int max1 = Math.max(a,b);
		int max2 = Math.max(max1,c);
		int middle = Math.max(min1,c);
		System.out.println(max2 + " " + middle + " " + min2);
		System.out.println(min2 + " " + middle + " " + max2);
	}
}
