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
