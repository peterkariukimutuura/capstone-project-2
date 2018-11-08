## Captone Project 1

A simple Java program that allows a user to input data in a football match. The data may include "shots on target", shots off target "number of goals", fouls, red cards, yellow cards, corner kicks,  and free kicks and the players. The program should provide a report of the data input in the end. Please use Java programming language


```
import java.util.Scanner;

class GetInputData{
	public static void main(String args[]){
		int num;
		float fnum;
		String shots_on_target;
		String shots_off_target;
		String number_of_goals;
		String fouls;
		String red_cards;
		String yellow_cards;
		String corner_kicks;
		String free_kicks;
		String players;
		int total_number_of_cards_issued;

		Scanner in =new Scanner(System.in);

		System.out.println("Enter shots on target : ");
		shots_on_target=in.nextLine();

		System.out.println("Enter shots Off target : ");
		shots_off_target=in.nextLine();

		System.out.println("Enter Number of Goals : ");
		number_of_goals=in.nextLine();

		System.out.println("Enter Number of Fouls : ");
		fouls=in.nextLine();

		System.out.println("Enter Number of Red Cards Issued : ");
		red_cards=in.nextLine();

		System.out.println("Enter Number of Yellow Cards Issued : ");
		yellow_cards=in.nextLine();

		System.out.println("Enter Number of Corner Kicks : ");
		corner_kicks=in.nextLine();

		System.out.println("Enter Number of Free Kicks : ");
		free_kicks=in.nextLine();


		System.out.println("Enter Number of Players : ");
		players=in.nextLine();


		System.out.println("You have Provided The following Data : \n Shots on Target - "
			+shots_on_target + "\n Shots off Target - "
			 +shots_off_target + " \n Number of Goals - " +number_of_goals 
			 +" \n Number of Fouls - " +fouls 
			 +" \n Number of Yellow Cards - "+yellow_cards
			 +" \n Number of Red Cards - "  +red_cards
			 +" \n Number of Corner Kicks - " +corner_kicks
			 +" \n Number of Free Kicks - " +free_kicks
			 +" \n Number of Players - "+players); 


		GetInputData obj = new GetInputData();
		total_number_of_cards_issued = obj.GetTotalCardsIssued(red_cards,yellow_cards);

		System.out.println("\n Total Number of Cards Issued - "+ Integer.toString(total_number_of_cards_issued));

	}

	public int GetTotalCardsIssued(String red_cards,String yellow_cards){
		int num1 =Integer.parseInt(red_cards);
		int num2 = Integer.parseInt(yellow_cards);

		return num1+num2;
	}
}
```