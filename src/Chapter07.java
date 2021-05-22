
public class Chapter07 {
	public static void main(String[] args) {
		int num = 10;
		if (num <= 5) {
			System.out.println("とても近い");
		}else if (num <= 10) {
			System.out.println("近い");
		}else if (num <= 15){
			System.out.println("遠い");
		}else {
			System.out.println("とても遠い");
		}

		String color = "yellow";
		switch (color) {
		case "red":
			System.out.println("赤信号");
			break;
		case "yellow":
			System.out.println("黄信号");
			break;
		case "blue":
			System.out.println("青信号");
			break;
		default:
			System.out.println("点検中");
		}
	}
}
