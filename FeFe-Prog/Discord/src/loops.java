
public class loops {

	public static void main(String[] args) {
		int i = 20;
		
		//this loop will loop once no matter what
		do{
			System.out.println(i);
			i++; //incement by 1
		}while(i < 19);
		
		//this loop will not run since i > 19
		while(i < 19) {
			System.out.println(i);
			i++; //increments by 1
		}
		 System.out.println(i);
	}

}
