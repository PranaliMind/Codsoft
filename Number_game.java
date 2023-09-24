import java.util.*;
public class Number_game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 50;
		int chances =0;
		
		while(chances <3) {
			
		System.out.println("Guess num : ");
		int guess_num = sc.nextInt();
		
		if(num == guess_num) {
			System.out.println("Correct!.....You won!!");
			break;
		}
		else if(guess_num > num+10) {
			System.out.println("Guess is too high");
		}
		else if(guess_num < num-10) {
			System.out.println("Guess is too low");
		}
		else  {
			System.out.println("You are close!");
		}
		chances++;
		}
		System.out.println();
		System.out.println("You lost");
		System.out.println("Better luck next time!");

	}

}
