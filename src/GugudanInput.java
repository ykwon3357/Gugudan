import java.util.Scanner;

public class GugudanInput {

	public static void Input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력: ");
		String inputValue = sc.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
	}

}
