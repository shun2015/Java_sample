
public class DoWhile01 {
	public static void main(String[] args) {
		int num = 1;
//		do {
//		    ブロック（繰り返し処理）
//		} while (条件式);
//		仮にはじめから条件式の結果が「false」となっていても、while文とは異なり、最低1度はブロックの処理が実行される
		do {
			num *= 2;
			System.out.println("DoWhile01 =" + num);
		}while(num < 50);
	}
}
