//package パッケージ名;	必ずクラスファイルの先頭に記述
package classMethod;

//import パッケージ名.クラス名;		パッケージの宣言の直後に記述
import classMethod.human.Human02;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 yamada = new Human02();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age);

		Human02 sato = new Human02("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age);

	}
}
