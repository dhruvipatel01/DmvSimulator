import java.util.Random;

public class dmvSimulator {
	public static void main(String[] args) {

		System.out.println("Hello welcome to the DMV");

		Random randoNum = new Random();

		int randomNumber = randoNum.nextInt((100 - 1) + 1) + 1;

		System.out.println("Your number is " + randomNumber);

		System.out.println("Please wait till your number is called");

		int num = randomNumber + 1;

		while (num != randomNumber) {

			System.out.println("The next number is: " + num);

			num++;

			if (num == 101) {

				num = 1;

			}
		}
		
		
		System.out.println("Now we are calling: " + num);
	
		
		
		
	}
}