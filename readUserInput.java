import java.util.Scanner;

public class readUserInput {
	//class to read user input from the console and print it to the console using scanner
	public static void main(String[] args){
		//function to read user input
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		//read multiple lines of user input
		do{
			//print the next line of user input
			System.out.println(sc.nextLine());
		}while(sc.hasNextLine());
	}
}
