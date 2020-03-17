import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력:");
		String num=sc.nextLine();
		
		String[] numlist = num.split(",");
		
		int val1=Integer.parseInt(numlist[0]);
		int val2=Integer.parseInt(numlist[1]);
		
		if((val1<2||val1>19)||(val2<2||val2>19)) {
			System.out.println("2이상 19이하만 입력가능");
		}else {
			for(int i=2;i<val1+1;i++) {
				for(int j=1;j<val2+1;j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println();
			}
			
			/*for(int i=2;i<num+1;i++)
			Gugudan.print(Gugudan.dan(i), i);*/
		}
	}

}
