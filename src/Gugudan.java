import java.util.ArrayList;

public class Gugudan {
	
	public static ArrayList<Integer> calculate(int first, int second){
		
		ArrayList<Integer> calculate = new ArrayList<>();
		for(int i=2;i<first+1;i++) {
			for(int j=1;j<second+1;j++) {
				calculate.add(i*j);
			}
		}
		return calculate;
	}
}
