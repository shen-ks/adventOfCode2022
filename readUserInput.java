import java.util.ArrayList;
import java.util.Scanner;

public class readUserInput {
	//class to read user input from the console and print it to the console using scanner
	public static void main(String[] args) {
		//function to read user input
		//create a scanner object
		Scanner sc = new Scanner(System.in);
//create a two dimensional string array and pass user input from scanner, comma delimited
		ArrayList<ArrayList<String>> array_list = new ArrayList<ArrayList<String> >();

// The space for the 0th row can be allocated with the use of new keyword, this is done in this line. The 0th row also allows the store of 0 value as default .
		array_list.add(new ArrayList<String>());
		String line ;
		while(((line = sc.nextLine()).equals("EOF"))!=true){
			//line = sc.nextLine();
			//String[] input = line.split(",");
			for(int i=0; i<9; i++){
				ArrayList list2=new ArrayList();
				//String[] input = line.split(",");
				list2.add(line.split(","));
				for (int j = 0; j < list2.size(); j++) {
					if (((String) list2.get(j)).equals("EOR")) {
						break;
					}
					System.out.println(list2.get(j));
					array_list.get(i).add((String) list2.get(j));
				}
				
				
				}
				
				
			}
		
		System.out.println(array_list);
	}
		
	}

