
public class GugudanMain {

	public static void main(String[] args)  {
		try{
		int first = GugudanInput.Input();
		int second = GugudanInput.Input();
		InputValue IV = new InputValue(first, second);
		try{	
			if((IV.getFirst()<2||IV.getFirst()>19)||(IV.getSecond()<2||IV.getSecond()>19)) 
				System.out.println("2이상 19이하만 입력가능");
			else 
				GugudanOutput.print(Gugudan.calculate(IV.getFirst(), IV.getSecond()),IV.getSecond());
				
			} catch(Exception e){

			}
		} catch(Exception e){
			System.out.println("숫자만 입력가능");

		}
		
		
	}
}


