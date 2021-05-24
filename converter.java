package main;
import java.util.Scanner;
public class converter {

	public static void main(String[] args) {
				
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
	    @SuppressWarnings("unused")
		boolean mainLoop = true;
	    int choice;

	    while(true){
	    	System.out.println("\nCalculator Main Menu\n");
			System.out.print("1.) Cups to Teaspoons \n");
			System.out.print("2.) Miles to Kilometers.\n");
			System.out.print("3.) US Gallons to Imperial Gallons.\n");
			System.out.print("4.) Exit\n");
			System.out.print("\nEnter Your Menu Choice: ");

			choice = input.nextInt();

			switch(choice){

			    case 1:
			        //Definitions
			        double cups, teaspoons, sum;
			        System.out.print("Please Enter The number of cups ");
			        cups = input.nextInt();
			        teaspoons = 48;
			        sum = cups * teaspoons;
			        System.out.print(cups + " cups eqauls " + sum + " teaspoons");
			        break;

			    case 2: 
			        double miles, kilometers, sum2;
			        System.out.print("Please Enter The number of miles ");
			        miles = input.nextInt();
			        kilometers = 1.60934;
			        sum2 = miles * kilometers;
			        System.out.print(miles + " miles eqauls " + sum2 + " kilometers");
			        break;

			    case 3:
			        double usgal, igal, sum3;
			        System.out.print("Please Enter The number of US Gallons ");
			        usgal = input.nextInt();
			        igal = 0.832674;
			        sum3 = usgal * igal;
			        System.out.print(usgal + " US Gallons eqauls " + sum3 + " Imperial Gallons");
			        break;

			    case 4: 
			        System.out.println("Exiting Program...");
			        System.exit(0);
			         break;

			    default :
			             System.out.println("This is not a valid Menu Option! Please Select Another");
			             break;

		    }
	    }
	}
}
			    