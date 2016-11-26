import java.util.Scanner;
public class Bobcar {

	public static void main(String[] args) {
		Scanner rental = new Scanner (System.in);
		
		int car=0, member=0, days=0, base=0, discount=0;
		double PEP = 0;
		System.out.println("Here are 3 types of rental Car: Economy(1), Compact(2) and Standard(3)");
		System.out.print("Please choose rental car by entering corrsponding number: ");
		car = rental.nextInt();
		System.out.print("Please enter the number of rental days: ");
		days = rental.nextInt();
		System.out.print("Are you club number? (1 for Yes, other for No): ");
		member = rental.nextInt();
		if (member == 1){
			System.out.print("Do you want to buy Platinum Executive Package(1 for Yes, other for No): ");
			PEP = rental.nextInt();
		}
		
		//car
		if (car == 1){
			car = 35;	
			System.out.println("You choose a Economy car($35/day)");
		}
		if (car == 2){
			car = 45;
			System.out.println("You choose a Compact car($45/day)");
		}
		if (car == 3){
			car = 95;
			System.out.println("You choose a Standard car($95/day)"); 
		}
		else {
			System.out.println("Wrong type!");
		}
		
		//days
		System.out.println("You choose to rent for " + days + " days.");
		base=car*days;
		System.out.println("Base:                       $" + base);
		
		//member
		if (member == 1){
			discount = (int)(days/7)*car;
			System.out.println("Club Member Discount:      -$" + discount);
		}
		else{
			System.out.println("The total cost:              $" + base);
			System.out.println("Thank you for choosing Bobcar Rent Service!");
		}
		
		
		//PEP
		if (member == 1)
			if (PEP == 1){
				PEP = (double)(base*0.15);
				System.out.println("Platinum Executive Package:+$" + PEP);
				System.out.println("The total cost:             $" + (double)(base-discount+PEP));
				System.out.println("Thank you for choosing Bobcar Rent Service!");
			}
			else{
				System.out.println("The total cost:              $" + (double)(base-discount));
				System.out.println("Thank you for choosing Bobcar Rent Service!");
			}





	}

}
