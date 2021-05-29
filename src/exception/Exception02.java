package exception;

public class Exception02 {
	public static void main(String[] args) {
		try {	//ブロック（例外が発生する可能性がある処理）
			System.out.println("100 ÷ 0 は？");
			int result = 100 / 0;
			System.out.println("計算結果" + result);
//		catch (例外クラス 変数名) {
//		catchブロック（例外が発生した時に実行する処理）
//		}
		} catch(ArithmeticException e) {
			System.out.println("例外処理が発生");
			
//		finally {
//			finallyブロック(例外発生の有無にかかわらず必ず実行する処理)
//		}
		} finally {
			System.out.println("プログラム終了");
		}
	}
}
