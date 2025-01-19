import java.util.Scanner;

public class Pizza{
	static Scanner sc=new Scanner(System.in);
	static int price=0;
	static boolean isExtraCheese;
	static boolean isExtraToppings;
	static boolean isTakeAway;
	static int extraCheeseCharges=0;
	static int extraToppingsCharges=0;
	static int takeAwayCharges=0;
	
	public static void vegPizza() {
		System.out.println("You choose veg pizza\n");
		price+=300;
		System.out.print("The extra cheese will be an additional 100. Would you like to include it? (Y/N):- ");
		char cheese= Character.toUpperCase(sc.next().charAt(0));
		cheeseCharges(cheese);
		System.out.print("The extra toppings will be an additional 150. Would you like to include it? (Y/N):- ");
		char toppings= Character.toUpperCase(sc.next().charAt(0));
		toppingsCharges(toppings);
		System.out.print("Will this order be for takeaway, or would you like to dine in? (Y/N):- ");
		char takeAway= Character.toUpperCase(sc.next().charAt(0));
		takeAwayCharges(takeAway);
	}
	public static void nonVegPizza() {
		System.out.println("You choose non-veg pizza\n");
		price+=400;
		System.out.print("The extra cheese will be an additional 100. Would you like to include it? (Y/N):- ");
		char cheese= Character.toUpperCase(sc.next().charAt(0));
		cheeseCharges(cheese);
		System.out.print("The extra toppings will be an additional 150. Would you like to include it? (Y/N):- ");
		char toppings= Character.toUpperCase(sc.next().charAt(0));
		toppingsCharges(toppings);
		System.out.print("Will this order be for takeaway, or would you like to dine in? (Y/N):- ");
		char takeAway= Character.toUpperCase(sc.next().charAt(0));
		takeAwayCharges(takeAway);
	}
	public static void deluxeVegPizza() {
		System.out.println("You choose deluxe veg pizza\n");
		price+=550;
		System.out.print("Will this order be for takeaway, or would you like to dine in? (Y/N):- ");
		char takeAway= Character.toUpperCase(sc.next().charAt(0));
		takeAwayCharges(takeAway);
	}
	public static void deluxeNonVegPizza() {
		System.out.println("You choose deluxe non-veg pizza\n");
		price+=650;
		System.out.print("Will this order be for takeaway, or would you like to dine in? (Y/N):- ");
		char takeAway= Character.toUpperCase(sc.next().charAt(0));
		takeAwayCharges(takeAway);
	}
	public static void cheeseCharges(char cheese) {
		System.out.println();
		if(cheese=='Y') {
			price+=100;
			extraCheeseCharges+=100;
			isExtraCheese=true;
			return;
		}
		else if(cheese=='N') {
			isExtraCheese=false;
			return;
		}
		else{
			System.out.println("Please press the right button:- ");
			System.out.print("The extra cheese will be an additional 100. Would you like to include it? (Y/N):- ");
			cheese= Character.toUpperCase(sc.next().charAt(0));
			cheeseCharges(cheese);
		}
	}
	public static void toppingsCharges(char toppings) {
		System.out.println();
		if(toppings=='Y') {
			price+=150;
			extraToppingsCharges+=150;
			isExtraToppings=true;
			return;
			
		}
		else if(toppings=='N') {
			isExtraToppings=false;
			return;
		}
		else{
			System.out.println("Please press the right button:- ");
			System.out.print("The extra toppings will be an additional 150. Would you like to include it? (Y/N):- ");
			toppings= Character.toUpperCase(sc.next().charAt(0));
			toppingsCharges(toppings);
		}
	}
	public static void takeAwayCharges(char takeAway) {
		System.out.println();
		if(takeAway=='Y') {
			price+=20;
			takeAwayCharges+=20;
			isTakeAway=true;
			return;
		}
		else if(takeAway=='N') {
			isTakeAway=false;
			return;
		}
		else{
			System.out.println("Please press the right button:- ");
			System.out.print("Will this order be for takeaway, or would you like to dine in? (Y/N):- ");
			takeAway= Character.toUpperCase(sc.next().charAt(0));
			takeAwayCharges(takeAway);
		}
	}
	public static boolean stillWant(char stillWant,boolean want) {
		System.out.println();
		if(stillWant=='Y') {
			return want;
		}
		else if(stillWant=='N') {
			want = false;
			return want;
		}
		else {
			System.out.println("Please press the right button:- ");
			System.out.print("The extra cheese will be an additional 100. Would you like to include it? (Y/N):- ");
			stillWant= Character.toUpperCase(sc.next().charAt(0));
			return stillWant(stillWant,want);
		}
	}
	public static void main(String[] args) {
		System.out.println("--------------------------------------Welcome To PizzaMania--------------------------------------");
		boolean want=true;
		String pizzaName="";
		while(want) {
			System.out.println("Which pizza would you like to have:- \n\n1.Veg Pizza                        300\n2.Non-Veg Pizza                    400\n3.Deluxe Veg Pizza                 550\n4.Deluxe Non-Veg Pizza             650\n");
			System.out.println("Press 1 for Veg Pizza\nPress 2 for Non-Veg\nPizza Press 3 for Deluxe Veg Pizza\nPress 4 Deluxe Non-Veg Pizza\nIf you don't want any pizza then press any number");
			int pizza=sc.nextInt();
			System.out.println();
			if(pizza==1) {
				pizzaName+="Veg Pizza         	  300";
				vegPizza();
			}
			else if(pizza==2) {
				pizzaName+="Non-Veg Pizza     	  400";
				nonVegPizza();
			}
			else if(pizza==3) {
				pizzaName+="Deluxe Veg Pizza          550";
				deluxeVegPizza();
			}
			else if(pizza==4) {
				pizzaName+="Deluxe Non-Veg Pizza      650";
				deluxeNonVegPizza();
			}
			else {
				break;
			}
			System.out.println("If you want more pizzas then you can still choose");
			System.out.print("Do you want another pizzas? (Y/N):- ");
			char stillWant= Character.toUpperCase(sc.next().charAt(0));
			want = stillWant(stillWant,want);
		}
		String bill="Your Bill:-\n\n";
		if(isExtraCheese) {
			bill+="ExtraCheese:-             "+extraCheeseCharges+"\n";
		}
		if(isExtraToppings) {
			bill+="ExtraToppings:-           "+extraToppingsCharges+"\n";
		}
		if(isTakeAway) {
			bill+="TakeAway:-                "+takeAwayCharges+"\n";
		}
		if(price!=0) {
			System.out.print(bill);
			System.out.println(pizzaName);
			System.out.println("Total Amount:-            "+price);
		}
		System.out.print("\n--------------------Thank you for visiting PizzaMania. Have a great day ahead!--------------------");
	}
}