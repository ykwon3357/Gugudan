import java.util.ArrayList;

public class GugudanOutput {

	public static void print(ArrayList<Integer> result, int second) throws Exception{
		System.out.println();
		
		for(int i=0;i<result.size();i++){
			for(int j=i*second;j<(i+1)*second;j++) {
			System.out.println((i+2)+"*"+(j%second+1)+"="+result.get(j));
			}
			System.out.println();
		}
		
		/*for(int i : result) {
			System.out.println(i);
		}*/
		
	}

}
