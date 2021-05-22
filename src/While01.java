
public class While01 {
	public static void main(String[] args) {
		int num = 1;
//		while (条件式) {
//		    ブロック（繰り返し処理）
//		}
		while(num < 50) {
			//条件がtrueの間、処理を繰り返す
			num *= 2;
			System.out.println("While01 =" + num);
		}
	} 
}
