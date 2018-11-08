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


	}
}