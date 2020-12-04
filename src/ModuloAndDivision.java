
public class ModuloAndDivision {

	public static void main(String[] args) {
		
		
		
		long milliseconds = System.currentTimeMillis();
		System.out.println("Total milliseconds is: " + milliseconds);
		 
		long days = milliseconds/86400000; //86400000ms = 1 day
		System.out.println(days + " days");
		
		long remaining = milliseconds % 86400000;
		
		long hours = remaining / 3600000;
		System.out.println(hours + " hours");
		
		remaining = remaining % 3600000;
		
		long minutes = remaining / 60000;
		System.out.println(minutes + " minutes");
		
		remaining = remaining % 60000;
		
		long seconds = remaining / 1000;
		System.out.println(seconds + " seconds");
		
		long ms = remaining % 1000;
		System.out.println(ms + " millieseconds");
		
		System.out.println("have passed since January 1st, 1970.");
		
		
		
		
		
		

	}

}
