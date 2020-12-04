
public class warmupswapping {

	public static void main(String[] args) {
		
		
		char char3 = 'b';
		char char4 = 'y';
		char3 = (char)(char3 + char4);
		System.out.println((int)char3);
		char4 = (char)(char3 - char4);
		System.out.println(char4);
		
		char3 = (char)(char3 - char4);
		System.out.println("char3:" +char3);
		System.out.println("char4: " + char4);
		

	}

}
