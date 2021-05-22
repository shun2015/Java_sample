
public class Continue01 {
	public static void main(String[] args) {
		for (int num = 1; num <= 5; num++) {
			// countが4の場合、この後の処理をスキップ
			if (num == 4) {
				continue;	//処理をスキップ
			}
		System.out.println(num);
		}
	}
}
