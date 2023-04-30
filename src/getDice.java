import java.util.Random;
import java.util.Scanner;

public class getDice {
	
	public static int rollDice() {
	
	Random rand = new Random();

	int randNum = 1 + rand.nextInt(6);

	return randNum;
	}


	public static void main (String[] args) {
	
		
		{
			do
			{
			int dice1 = rollDice();
			int dice2 = rollDice();

			int sum = dice1 + dice2;


		if(sum==2||sum==3||sum==12) {
			System.out.println("You rolled "+dice1+" + "+dice2 +" = "+sum);
			System.out.println("Craps \nYou loose");
		}
		else if(sum == 7 || sum == 11) {
		System.out.println("\n You rolled "+dice1+" + "+dice2 +" = "+sum);
		System.out.println("Natural You Win");
		break;
		}
		else
		{
		System.out.println("You rolled "+dice1+" + "+dice2 +" = "+sum);
		System.out.println("point is "+sum);
		}
			}while(true);

		}

	}
}
		
