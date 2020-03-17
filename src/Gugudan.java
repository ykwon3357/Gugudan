import java.util.ArrayList;

public class Gugudan {
	
	public static ArrayList<Integer> calculate(int num){
		
		return calculate(0);
	}
	public static int[] dan(int num) {
		int[] dan = new int[19];
		for(int i=0;i<num;i++) {
			dan[i] = num*(i+1);
		}
		return dan;
	}
	
	public static void print(int[] dan,int num) {
		for(int i=0;i<num;i++) {
			System.out.println(num+"*"+(i+1)+"="+dan[i]);
		}
		System.out.println();
	}
	
}
