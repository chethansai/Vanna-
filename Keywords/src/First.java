
import java.util.Scanner;

public class First {
	

	public static void main(String[] args) {
		int choice=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("::::::Menu:::::"
				+ "1.if 2.for 3.while");
		choice=scanner.nextInt();

		
		switch(choice)
		
		{
			case 1:Executingif eif=new Executingif();
			  eif.executingmethod();break;
			case 2:Executingfor efor=new Executingfor();
			  efor.executingmethod();break;
			case 3:Executingwhile ewhile=new Executingwhile();					;
			  ewhile.executingmethod();break;
			case 4:Executinginterface einterface=new Executinginterface();					;
			  einterface.executingmethod();break;
			default:System.out.println("Unlisted In Menu");

		}
		System.out.println("its working");
	}

}
class Executingif {
	public void executingmethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check if it is greater than 10 or not");
		int number=scanner.nextInt();
		if(number>10)
			System.out.println("The entered number is greater than 10");
		else
			System.out.println("The entered number is not greater than 10");
		}
	 
}
 class Executingfor {
	public void executingmethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number upto which numbers have to be printed");
		
		int number=scanner.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.println(i);
		}
		
	}
}
class Executingwhile {
	public void executingmethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number upto which numbers have to be printed");
		int number=scanner.nextInt();
		int i=1;
		while(i<=number) {
			System.out.println(i);
			i++;
		}
		
	}
}

//interface to create similar properties to both vehicle(changeGear, speedUp, applyBrakes)
interface Vehicle { 
    
    // abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
}
//A Class that applies gearshift and speed changes on desired vehicle(Car,Bike) using "interface"
class Executinginterface {
	public void executingmethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the desired vehicle to apply gearshift and speed changes"+"1.Bike"+"2.Car");
		int choice=scanner.nextInt();
		switch(choice)
		
		{
		    //applying changes on bike
			case 1:Bike bike = new Bike(); 
	        bike.changeGear(3); 
	        bike.speedUp(40); 
	        bike.applyBrakes(10); 
	        System.out.println("Bike present state :"); 
	        bike.printStates(); break;
			default:System.out.println("Unlisted In Menu");
			
			//applying changes on bicycle
			case 2:Car car = new Car(); 
	        car.changeGear(4); 
	        car.speedUp(50); 
	        car.applyBrakes(10); 
	        System.out.println("car present state :"); 
	        car.printStates();break;

		}
		}
}
		  
class Bike implements Vehicle { 
		    int speed; 
		    int gear; 
		      
		    // to change gear 
		    public void changeGear(int newGear){ 
		          gear = newGear; 
		    } 
		      
		    // to increase speed 
		    public void speedUp(int increment){ 
		    speed = speed + increment; 
		    } 
		      
		    // to decrease speed 
		    public void applyBrakes(int decrement){ 
		    speed = speed - decrement; 
		    } 
		      
		    public void printStates() { 
		         System.out.println("speed: " + speed 
		             + " gear: " + gear); 
		    } 
		      
} 
class Car implements Vehicle{ 
		    int speed; 
		    int gear; 
		      
		     // to change gear 
		    public void changeGear(int newGear){ 
		          gear = newGear; 
		    } 
		      
		    // to increase speed 
		    public void speedUp(int increment){ 
		          speed = speed + increment; 
		    } 
		      
		    // to decrease speed 
		    public void applyBrakes(int decrement){ 
		         speed = speed - decrement; 
		    } 
		    
		      public void printStates() { 
		         System.out.println("speed: " + speed 
		              + " gear: " + gear); 
		    } 
} 
		