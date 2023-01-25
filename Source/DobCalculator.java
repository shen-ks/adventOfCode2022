import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DobCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the list of dates for which you need ages calculated");
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		LocalDate localDate = LocalDate.now();

		int age = 0;
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println("DOB is " + line);
			LocalDate userInputDate = LocalDate.parse(line,format);
			if (localDate.getMonth().getValue() < userInputDate.getMonth().getValue()){
				 age = localDate.getYear() - userInputDate.getYear() -1;
			}
			else{
				 age = localDate.getYear() - userInputDate.getYear() ;
			}
			System.out.println("Age is " + age);
		}
	
		
		
	}
	
}
