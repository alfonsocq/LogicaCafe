import java.util.ArrayList;

public class CafeUtil {
	
	public static int getStreakGoal() {
		int suma = 1+2+3+4+5+6+7+8+9+10;
		return suma;
	}
	
	public static double getOrderTotal(double[] prices) {
		double auncorededistancia = 0;
		
		for(double cont = 0; cont < prices.length; cont++) {			
		auncorededistancia+=prices[(int) cont];						
		}
		return auncorededistancia;
					 
	}
	
	public static void displayMenu(ArrayList<String> menuItems) {
		String menu1= menuItems.get(0);
		String menu2= menuItems.get(1);
		String menu3= menuItems.get(2);
		String menu4= menuItems.get(3);
		
		System.out.println("1" +" "+ menu1);
		System.out.println("2" +" " + menu2);
		System.out.println("3" +" "+ menu3);
		System.out.println("4" +" "+ menu4);
		 
	}
	
	public static void addCustomer(ArrayList<String> customers) {
		System.out.println("Por favor ingresa tu nombre");
		String userName = System.console().readLine();
		System.out.println("Hola " +userName+ "!");
		System.out.println("Hay "+customers.size()+ " personas frente a ti");
        customers.add(userName);
	}
}



