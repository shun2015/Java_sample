
public class For02 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		
//		for (型 変数名：配列やコレクションの変数) {
//		    ブロック(繰り返し処理)
//		}
		// 配列の要素を順番にnumberに代入し、要素分繰り返す
		for (int num : array) {
			System.out.println(num);
		}
	}
}
