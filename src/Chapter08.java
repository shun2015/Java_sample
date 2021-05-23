
public class Chapter08 {
	public static void main(String[] args) {
		//1以上5未満の数の2乗を出力
		int num = 1;
		while(num < 5) {
			System.out.println(num * num);
			num++;
		}
		
//		要素数が4の「int」配列を初期化
//		配列のサイズ分ループして、要素を出力
		int num2[] = {1, 2, 3, 4};
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
		
		for(int num3 : num2) {
			if(num3 % 2 == 0) {
				continue;
			}
			System.out.println(num3);
		}
	}
}
