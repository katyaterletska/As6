
public class If {

	public static void main(String[] args) {


		double area, radius, pi;
		
		area= 0;
		radius = 6;
		pi = 3.14;
		
		if (radius >=0) {
			area = radius*radius*pi;
		System.out.println("THE AREA FOR THE CIRCLE OF RADIUS: "+ area);
		
		}
		
		System.out.println("AFTER THE IF STATEMENT");
		
		if (area > 100) {
			System.out.println("AREA IS GREATER THAN 100");
		}
		

	}

}
