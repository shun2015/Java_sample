
public class Chapter06 {
	public static void main (String[] args) {
		int val = 2 + 5;
		int a;
		System.out.println(val);
		a = ++val;	//val++;で省略可能
		System.out.println(a);
		a *= 5;
		System.out.println(a);
		boolean bool = (a == 50);
        System.out.println(bool);
        bool = (a <= 50 && a % 10 == 0);
        System.out.println(bool);
	}
}
