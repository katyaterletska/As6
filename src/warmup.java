
public class warmup {

	public static void main(String[] args) {
		
		char charOne = 'a';
		char charTwo = 'z';
		int temp;
		
		
		System.out.println("Before swapping");
		System.out.println("charOne is: "   + charOne);
		System.out.println("charTwo is : "+ charTwo);
		temp = charOne;
		charOne = charTwo; 
		charTwo = (char)temp; 
		System.out.println("After swapping");

		System.out.println("charOne is: "   + charOne);
		System.out.println("charTwo is : "+ charTwo);

	}

}
